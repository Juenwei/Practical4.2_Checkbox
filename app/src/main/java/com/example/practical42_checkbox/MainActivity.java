package com.example.practical42_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chocoCheck,sprinkleCheck,nutCheck,cherryCheck,oreoCheck;
    private Button toastButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkboxListner(View view)
    {
        chocoCheck= (CheckBox)findViewById(R.id.chocolate_checkbox);
        sprinkleCheck= (CheckBox)findViewById(R.id.sprinkles_checkbox);
        nutCheck= (CheckBox)findViewById(R.id.nut_checkbox);
        cherryCheck= (CheckBox)findViewById(R.id.cherry_checkbox);
        oreoCheck= (CheckBox)findViewById(R.id.oreo_checkbox);
        toastButton=findViewById((R.id.toast_button));

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer toppings = new StringBuffer().append("Topping :");
                if(chocoCheck.isChecked())
                {
                    toppings.append("  "+chocoCheck.getText().toString());
                }
                if(sprinkleCheck.isChecked())
                {
                    toppings.append("  "+sprinkleCheck.getText().toString());
                }
                if(nutCheck.isChecked())
                {
                    toppings.append("  "+nutCheck.getText().toString());
                }
                if(cherryCheck.isChecked())
                {
                    toppings.append("  "+cherryCheck.getText().toString());
                }
                if(oreoCheck.isChecked())
                {
                    toppings.append("  "+oreoCheck.getText().toString());
                }
                Toast.makeText(MainActivity.this,toppings.toString(),Toast.LENGTH_SHORT).show();
            }
        });



    }


}
