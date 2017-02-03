package com.example.heather.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;
    CheckBox chkbxCheese;
    CheckBox chkbxDelivery;
    TextView txtviewTotal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbSmall = (RadioButton) findViewById(R.id.radioButtonSmall);
        rbMedium = (RadioButton) findViewById(R.id.radioButtonMedium);
        rbLarge = (RadioButton) findViewById(R.id.radioButtonLarge);
        chkbxCheese = (CheckBox) findViewById(R.id.checkBoxCheese);
        chkbxDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);
        txtviewTotal = (TextView) findViewById(R.id.textViewTotal);

    }

    public void OnClickCalcBtn(View view) {
        Double total = 0.0;

        if (rbSmall.isChecked()) {
            total = 7.00;
        }

        else if (rbMedium.isChecked()) {
            total = 9.00;
        }

        else if (rbLarge.isChecked()) {
            total = 13.00;
        }

        if (chkbxCheese.isChecked()) {
            total = total + 1.75;
        }

        if (chkbxDelivery.isChecked()) {
            total = total + 2.50;
        }

        txtviewTotal.setText(String.format("Total is $%.2f", total));      // this code inserts the value of total for the %.2f location in the string

        rbSmall.setChecked(false);
        rbMedium.setChecked(false);
        rbLarge.setChecked(false);
        chkbxCheese.setChecked(false);
        chkbxDelivery.setChecked(false);
    }
}
