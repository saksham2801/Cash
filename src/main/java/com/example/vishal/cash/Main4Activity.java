package com.example.vishal.cash;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Vishal on 8/24/2017.
 */
public class Main4Activity extends Activity
{
    swipe adapter;
    ViewPager viewPager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4activity);
        viewPager =(ViewPager)findViewById(R.id.view_pager);
        adapter=new swipe(this);
        viewPager.setAdapter(adapter);

    }


}
