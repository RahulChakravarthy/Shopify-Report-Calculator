package com.example.rahul.shopifyreportcalculator;


import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * @Singleton RequestHandler : Handles all HTTP requests made by the app
 */
class RequestHandler {

    private static final RequestHandler requestInstance = new RequestHandler();

    private Context activityContext;
    private RequestQueue queue;

    /** Contructor is private to prevent creating multiple Request handlers throughout the program */
    private RequestHandler(){}

    /**
     * @Method initData : resets the Context of the requestInstance and resets the Request Queue
     * @param activityContext : Context of the Activity
     */
    public void initData(Context activityContext){
        RequestHandler.requestInstance.activityContext = activityContext;
        RequestHandler.requestInstance.queue = Volley.newRequestQueue(this.activityContext);
    }

    /**
     * @Method newGetRequest : Creates and stores a simple get request
     * @param pageUrl : String  url of where to fetch the request
     */
    public void newGetRequest(String pageUrl){
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, pageUrl,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        Log.d("Response", response.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error", error.toString());
            }
        });
        RequestHandler.requestInstance.queue.add(stringRequest);
    }

    /**
     * @Method addToRequestQueue : Provides functionality for creating other Requests and adding it to the queue
     * @param request : Request
     */
    public void addToRequestQueue(Request request){
        RequestHandler.requestInstance.queue.add(request);
    }

    /**
     * @Method getInstance : Provides access to the instance
     * @return RequestHandler
     */
    public static RequestHandler getInstance(){return requestInstance;}
}
