package com.example.practical_42_leong_hp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public boolean choco,sprinkles,nuts,cherries,orio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void show_toast(View view){
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.buttonToast));
        if  (choco) {
            toppings.append(" "+getString(R.string.chocoCheck));
        }
        if  (sprinkles) {
            toppings.append(" "+getString(R.string.sprinklesCheck));
        }
        if  (nuts) {
            toppings.append(" "+getString(R.string.nutsCheck));
        }
        if  (cherries) {
            toppings.append(" "+getString(R.string.cherriesCheck));
        }
        if  (orio) {
            toppings.append(" "+getString(R.string.orioCheck));
        }
        String toast_message = toppings.toString();
        Toast toast = Toast.makeText(this,toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void onSubmit(View view) {


        if  (((CheckBox) findViewById(R.id.choco_box)).isChecked()) {
            choco = true;
        }
        else {
            choco = false;
        }

        if  (((CheckBox) findViewById(R.id.sprinkles_box)).isChecked()) {
            sprinkles = true;
        }
        else {
            sprinkles = false;
        }

        if  (((CheckBox) findViewById(R.id.nuts_box)).isChecked()) {
            nuts = true;
        }
        else {
            nuts= false;
        }

        if  (((CheckBox) findViewById(R.id.cherries_box)).isChecked()) {
            cherries = true;
        }
        else {
            cherries = false;
        }

        if  (((CheckBox) findViewById(R.id.orio_box)).isChecked()) {
            orio = true;
        }
        else {
            orio = false;
        }

    }

}