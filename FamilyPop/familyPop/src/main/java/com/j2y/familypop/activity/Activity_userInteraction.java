package com.j2y.familypop.activity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.j2y.familypop.activity.BaseActivity;
import com.nclab.familypop.R;

/**
 * Created by gmpguru on 2016-01-28. �̷��� �ϸ� �ȵɰŰ���. �����ؾ���.
 */
public class Activity_userInteraction extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_client_mode_interaction);
    }

    @Override
    protected void onDestroy()
    {
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //


        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        super.onDestroy();
    }

}