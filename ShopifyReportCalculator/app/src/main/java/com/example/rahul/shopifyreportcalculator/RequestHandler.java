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
 * @Class RequestHandler : Handles all HTTP requests made by the app (CONVERT THIS TO SINGLETON)
 */
public class RequestHandler {
    private Context activityContext;
    private String pageUrl;
    private RequestQueue queue;

    public RequestHandler(Context activityContext, String pageUrl){
        this.activityContext = activityContext;
        this.pageUrl = pageUrl;
        this.queue = Volley.newRequestQueue(this.activityContext);
    }

    public void newRequestQueue(){
        // Instantiate the RequestQueue
        String url = this.pageUrl;
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
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
        this.queue.add(stringRequest);
    }

    public void addToRequestQueue(Request request){
        this.queue.add(request);
    }

    public String getPageUrl(){
        return this.pageUrl;
    }
}
