package com.example.mc_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    private String fruits_value = "", cities_value = "";
    boolean chk_a, chk_b, chk_c, chk_d;
    private TextView to_show_result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        to_show_result = (TextView) findViewById(R.id.text_view_to_show_result);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        fruits_value = getIntent().getExtras().get("fruits").toString();
        cities_value = getIntent().getExtras().get("cities").toString();
        chk_a = getIntent().getExtras().getBoolean("chk_a");
        chk_b = getIntent().getExtras().getBoolean("chk_b");
        chk_c = getIntent().getExtras().getBoolean("chk_c");
        chk_d = getIntent().getExtras().getBoolean("chk_d");

        to_show_result.setText(fruits_value + " is selected\n" +
                cities_value + " is selected\n" +
                "A is " + DecideCheckedOrNot(chk_a) + "\n" +
                "B is " + DecideCheckedOrNot(chk_b) + "\n" +
                "C is " + DecideCheckedOrNot(chk_c) + "\n" +
                "D is " + DecideCheckedOrNot(chk_d));
    }

    private String DecideCheckedOrNot(boolean value)
    {
        if (value == true)
        {
            return "checked";
        }
        else
        {
            return "is not checked";
        }
    }
}