package com.example.mc_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
{
    private RadioGroup radio_group_fruits, radio_group_cities;
    private Button btn_click_me;
    private CheckBox checkBox_A, checkBox_B, checkBox_C, checkBox_D;
    private RadioButton radioButton_fruits, radioButton_cities;
    private String fruits_value, cities_value;
    private int c1, c2;
    private boolean chk_a, chk_b, chk_c, chk_d;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radio_group_fruits = (RadioGroup) findViewById(R.id.radio_group_fruits);
        radio_group_cities = (RadioGroup) findViewById(R.id.radio_group_cities);
        btn_click_me = (Button) findViewById(R.id.btn_click_me);
        checkBox_A = (CheckBox) findViewById(R.id.checkbox_A);
        checkBox_B = (CheckBox) findViewById(R.id.checkbox_B);
        checkBox_C = (CheckBox) findViewById(R.id.checkbox_C);
        checkBox_D = (CheckBox) findViewById(R.id.checkbox_D);



        btn_click_me.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                c1 = radio_group_fruits.getCheckedRadioButtonId();
                c2 = radio_group_cities.getCheckedRadioButtonId();

                radioButton_fruits = (RadioButton) findViewById(c1);
                fruits_value = (String) radioButton_fruits.getText();

                radioButton_cities = (RadioButton) findViewById(c2);
                cities_value = (String) radioButton_cities.getText().toString();

                chk_a = checkBox_A.isChecked();
                chk_b = checkBox_B.isChecked();
                chk_c = checkBox_C.isChecked();
                chk_d = checkBox_D.isChecked();

                Intent second_intent = new Intent(MainActivity.this, SecondActivity.class);
                second_intent.putExtra("fruits", fruits_value);
                second_intent.putExtra("cities", cities_value);
                second_intent.putExtra("chk_a", chk_a);
                second_intent.putExtra("chk_b", chk_b);
                second_intent.putExtra("chk_c", chk_c);
                second_intent.putExtra("chk_d", chk_d);
                startActivity(second_intent);
            }
        });
    }
}