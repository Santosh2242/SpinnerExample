package com.baiju.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_1,spinner_2,spinner_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        spinner_1 = findViewById(R.id.spinner_1);
        spinner_2 = findViewById(R.id.spinner_2);
        spinner_3 = findViewById(R.id.spinner_3);

        final List<String> categories_1 = new ArrayList<String>();
        final List<String> categories_2 = new ArrayList<String>();
        final List<String> categories_3 = new ArrayList<String>();

        //first spinner insert data
        categories_1.add("Select Category*");
        categories_1.add("Lenovo");
        categories_1.add("Dell");

       //second spinner insert data
        categories_2.add("Please Select Category*");
        categories_2.add("Lava");
        categories_2.add("Samsung");

        //Third spinner insert data
        categories_3.add("Please Select Category*");
        categories_3.add("Nokia");
        categories_3.add("Dell");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_1);
        spinner_1.setAdapter(dataAdapter);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //second Spinner Adapter
        ArrayAdapter<String> dataAdapter_2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_2);
        spinner_2.setAdapter(dataAdapter_2);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Third Spinner Adapter
        ArrayAdapter<String> dataAdapter_3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories_3);
        spinner_3.setAdapter(dataAdapter_3);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Selected : "+ categories_1.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Selected : "+ categories_2.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Selected : "+ categories_3.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}

