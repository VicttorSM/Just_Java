package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void addOne(View view) {
        TextView quantity = findViewById(R.id.Number);
        String str = quantity.getText().toString();
        int number = Integer.parseInt(str);
        number++;
        str = Integer.toString(number);
        quantity.setText(str);
    }
    public void removeOne(View view) {
        TextView quantity = findViewById(R.id.Number);
        String str = quantity.getText().toString();
        int number = Integer.parseInt(str);
        if (number >= 1) number--;
        str = Integer.toString(number);
        quantity.setText(str);
    }
    public void submitOrder(View view) {
        TextView quantity = findViewById(R.id.Number);
        quantity.setText("0");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
