package com.example.rahul.shopifyreportcalculator;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.rahul.shopifyreportcalculator.Core.baseActivity;
import com.example.rahul.shopifyreportcalculator.Data.Order;
import com.example.rahul.shopifyreportcalculator.HelperClasses.viewHelperClass;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class ReportsActivity extends baseActivity {

    RequestHandler requestHandler;
    String content;
    Gson gson = new Gson();
    Order[] orders; //array holding all the orders gathered from the JSON request

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        //Activity methods
        this.layoutSetup();
        this.requestJsonData();
    }

    protected void layoutSetup(){
        RelativeLayout activityLayout = (RelativeLayout) findViewById(R.id.report_layout);
        this.viewHelperClass = new viewHelperClass(activityLayout, getApplicationContext(), this.getWindowManager().getDefaultDisplay());

        //Set Text based graphics
        this.viewHelperClass.addText("Data Report", "OpenSans-Bold", "BLACK", 2, 35, 50, 25);
        this.viewHelperClass.addText("Amount spent by Napolean Batz", "OpenSans-Regular", "BLACK", 2, 15, 50, 30);
        this.viewHelperClass.addText("Amount of Awesome Bronze Bags Sold", "OpenSans-Regular", "BLACK", 2, 15, 50, 45);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                viewHelperClass.addText(content, "OpenSans-Bold", "BLACK", 1, 10, 5, 50);
                orders = gson.fromJson(content, Order[].class);
            }
        }, 1000);
    }

    protected void requestJsonData(){
        this.requestHandler = new RequestHandler(getApplicationContext(), "https://shopicruit.myshopify.com/admin/orders.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6");
        this.requestHandler.newRequestQueue();
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, this.requestHandler.getPageUrl(), null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        //Capture Raw JSON data as String
                        try {
                            content = response.getString("orders");
                            Log.d("content", content);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        //
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("ERROR", error.getStackTrace().toString());
                    }
                });

        this.requestHandler.addToRequestQueue(jsObjRequest);
    }


}
