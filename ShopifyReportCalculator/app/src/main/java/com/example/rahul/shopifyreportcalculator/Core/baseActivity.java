package com.example.rahul.shopifyreportcalculator.Core;


import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.example.rahul.shopifyreportcalculator.HelperClasses.viewHelperClass;


abstract public class baseActivity extends AppCompatActivity {

    protected RelativeLayout activityLayout; //Activity Layout
    protected viewHelperClass viewHelperClass; //Helper class to output views to the activity
}
