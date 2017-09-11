package com.example.rahul.shopifyreportcalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.rahul.shopifyreportcalculator.Core.RequestHandler;
import com.example.rahul.shopifyreportcalculator.Core.baseActivity;
import com.example.rahul.shopifyreportcalculator.Orders.LineItem;
import com.example.rahul.shopifyreportcalculator.Orders.Order;
import com.example.rahul.shopifyreportcalculator.Orders.Orders;
import com.example.rahul.shopifyreportcalculator.HelperClasses.viewHelperClass;
import com.google.gson.Gson;

import org.json.JSONObject;

public class ReportsActivity extends baseActivity {

    private Gson gson = new Gson(); //Using GSON libraries to parse JSON strings

    private String content; //Stores captured raw JSON content after the request is processed
    private final String jsonUrl = "https://shopicruit.myshopify.com/admin/orders.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6"; //Url to the page containing JSON Data

    private Orders orders;
    private TextView totalBill;
    private TextView totalQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        //Activity methods
        this.layoutSetup();
        this.requestJsonData();
        this.parseJSONData();
    }

    /**
     * @Method layoutSetup : creates and sets up all static views that show up when the app is created
     */
    protected void layoutSetup(){
        this.activityLayout = (RelativeLayout) findViewById(R.id.report_layout);
        this.activityLayout.setBackgroundColor(Color.parseColor("#60D0DE"));
        this.viewHelperClass = new viewHelperClass(activityLayout, getApplicationContext(), this.getWindowManager().getDefaultDisplay());

        //Set Text based graphics
        this.viewHelperClass.addText("Data Report", "OpenSans-Bold", "BLACK", 2, 35, 50, 20);
        this.viewHelperClass.addText("Amount spent by Napoleon Batz (CAD):", "OpenSans-Bold", "BLACK", 2, 15, 50, 30);

        this.totalBill = new TextView(getApplicationContext());
        this.viewHelperClass.addText(totalBill, "Loading Data ...", "OpenSans-Regular", "BLACK", 15, 50, 35, false);

        this.viewHelperClass.addText("Amount of Awesome Bronze Bags Sold:", "OpenSans-Bold", "BLACK", 2, 15, 50, 45);

        this.totalQuantity = new TextView(getApplicationContext());
        this.viewHelperClass.addText(totalQuantity, "Loading Data ...", "OpenSans-Regular", "BLACK", 15, 50, 50, false);

    }

    /**
     * @Method requestJsonData : Creates and adds a JsonObjectRequest to the RequestQueue to retrieve data from the Shopify API endpoint
     */
    protected void requestJsonData(){
        RequestHandler.getInstance().initData(getApplicationContext());
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, this.jsonUrl, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        //Capture Raw JSON data as String
                        content = response.toString();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("ERROR", error.getStackTrace().toString());
                    }
                });

        RequestHandler.getInstance().addToRequestQueue(jsObjRequest);
    }

    /**
     * @Method parseJSONData : parses Json data that was captured as a string and uses GSON libraries to populate the orders Object
     */
    protected void parseJSONData(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                orders = gson.fromJson(content, Orders.class);
                calculateData();
            }
        }, 2000); //Temporarily using postDelayed on new handler, next time, implement it using java Futures and Promises so that data loads as soon as the Request is Complete
    }

    /**
     * @Method calculateData : calculates total Amount spent by Napoleon Batz and the Total number of Bronze Bags sold
     */
    private void calculateData() {
        float totalAmountInCAD = 0;
        int totalBronzeBags = 0;

        for (Order order : orders.getOrders()){
            //Calculate quantity of bronze bags sold
            if (order.getLineItems() != null){
                for (LineItem item : order.getLineItems()){
                    totalBronzeBags += item.getQuantity();
                }
            }

            //Calculate Amount spent by Napoleon Batz
            if (order.getCustomer() != null){
                //check to make sure Napoleon Batz submitted this order
                String desiredFirstName = "Napoleon";
                String desiredLastName = "Batz";

                if (order.getCustomer().getFirstName().equals(desiredFirstName) && order.getCustomer().getLastName().equals(desiredLastName)){
                    //Check to make sure the currency is in CAD
                    String desiredCurrency = "CAD";
                    if (order.getCurrency().equals(desiredCurrency)){
                        //Add it to the total bill
                        totalAmountInCAD += Float.parseFloat(order.getTotalPrice());
                    } else {
                        //Was not specified what to do if amount was not in CAD but I would convert it to cad then add
                    }
                }
            }
        }
        //shift textview to align it properly
        this.totalQuantity.setX(this.totalQuantity.getX() - 200);
        this.totalQuantity.setText(String.valueOf(totalBronzeBags) +  " Awesome Bronze Bags Sold");
        this.totalBill.setX(this.totalBill.getX() + 50);
        this.totalBill.setText("$" + String.valueOf(totalAmountInCAD));
    }
}
