package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    RadioButton size_radioButton;
    String pizza_size = "";
    String toppings = "";
    String delivery_type = "";
    TextView size_result_View;
    TextView delivery_result_View;
    CheckBox topping_checkBox;
    RadioButton delivery_radio_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void size_click(View view) {

        size_radioButton = (RadioButton) view;
        int id = view.getId();

        switch (id) {
            case R.id.size_Large:
                if(size_radioButton.isChecked()){
                    pizza_size = "Large Pizza";
                }
                break;

            case R.id.size_Medium :
                if(size_radioButton.isChecked()){
                    pizza_size = "Medium Pizza";
                }

                break;

            case R.id.size_Small :
                if(size_radioButton.isChecked())
                {
                    pizza_size = "Small Pizza";
                }
                break;
        }

    }
    public void toppic_cb(View view) {

        topping_checkBox = (CheckBox) view;
        int toppig_id = topping_checkBox.getId();
        switch (toppig_id){
            case R.id.cb_Pepperoni :
                if(topping_checkBox.isChecked()){
                    toppings += "Pepperoni";
                }
                break;
            case R.id.cb_Green_Pepper :
                if(topping_checkBox.isChecked())
                {
                    toppings += " and Green Papper";
                }
                break;
            case R.id.cb_Onions :
                if(topping_checkBox.isChecked())
                {
                    toppings += " and Onion";
                }
                break;
        }

    }

    public void order_type_btn(View view) {
        delivery_radio_btn = (RadioButton) view;
        int id = view.getId();

        switch (id){
            case R.id.pickupBtn :
                if(delivery_radio_btn.isChecked()) {
                    delivery_type = " Pick up";
                }

                break;

            case R.id.deliveryBtn :
                if (delivery_radio_btn.isChecked()){
                    delivery_type = " Delivery";
                }

                break;
        }
    }

    public void place_Order_btn(View view) {
        size_result_View = findViewById(R.id.size_result);
        delivery_result_View = findViewById(R.id.order_result);

        if(pizza_size == "" || toppings == "") {
            size_result_View.setText("Please select size and topping type");
        }
        else {
            size_result_View.setText(pizza_size + " with " + toppings);
        }

        if (delivery_type == "")
        {
            delivery_result_View.setText("Please select delivery type");
        }
        else {
            delivery_result_View.setText("Your order type: " + delivery_type);
        }

    }



}