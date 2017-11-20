package com.example.engineers_workbook.inventory_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class EditorActivity extends AppCompatActivity {

    EditText name;
    EditText Details;
    EditText Weight;
    Spinner Qty_Spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        name = (EditText) findViewById(R.id.edit_item_name);
        Details = (EditText) findViewById(R.id.edit_item_details);
        Weight = (EditText) findViewById(R.id.edit_item_weight);
        Qty_Spinner =(Spinner) findViewById(R.id.spinner_qty);

        SetupSpinner();
    }

    private void SetupSpinner(){

        ArrayAdapter mSpinnerAdaptor =ArrayAdapter.createFromResource(this, )
    }
}
