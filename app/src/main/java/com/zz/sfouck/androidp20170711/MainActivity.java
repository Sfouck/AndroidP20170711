package com.zz.sfouck.androidp20170711;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner fruitSpinner;
    private String[] fruit = {"Select a fruit","Apple", "Banana", "Papaya"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCompent();

        ArrayAdapter adapterFruit = new ArrayAdapter(this, android.R.layout.simple_spinner_item, fruit);
        adapterFruit.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        fruitSpinner.setAdapter(adapterFruit);
        fruitSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0){
                    Toast.makeText(MainActivity.this,parent.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
                    fruitSpinner.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void initCompent() {
        fruitSpinner = (Spinner) findViewById(R.id.fruitSpinner);
    }
}
