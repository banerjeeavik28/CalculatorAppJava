package com.example.avikbanerjee.avik_banerjee_calculator;

//heavily influenced by hackpundit tutorial shown in discussion with certain methods implemented
//in the same way for optimization

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {
    Button buttonzero, buttonone, buttontwo, buttonthree, buttonfour, buttonfive, buttonsix,
            buttonseven, buttoneight, buttonnine, buttonaddition, buttonsubtraction, buttondivision,
            buttonmultiplication, buttondecimal, buttonallclear, buttonequals, buttonpercent, buttondelete;
    EditText contents;

    float value1, value2;

    boolean valueadd, valuesub, valuemult, valuediv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonzero = findViewById(R.id.button0);
        buttonone = findViewById(R.id.button1);
        buttontwo = findViewById(R.id.button2);
        buttonthree = findViewById(R.id.button3);
        buttonfour = findViewById(R.id.button4);
        buttonfive = findViewById(R.id.button5);
        buttonsix = findViewById(R.id.button6);
        buttonseven = findViewById(R.id.button7);
        buttoneight = findViewById(R.id.button8);
        buttonnine = findViewById(R.id.button9);
        buttonaddition = findViewById(R.id.buttonAdd);
        buttonsubtraction = findViewById(R.id.buttonSub);
        buttonmultiplication = findViewById(R.id.buttonMult);
        buttondivision = findViewById(R.id.buttonDiv);
        buttonallclear = findViewById(R.id.buttonAllClear);
        buttonequals = findViewById(R.id.buttonEqual);
        buttonpercent = findViewById(R.id.buttonPercent);
        buttondecimal = findViewById(R.id.buttonDeci);
        buttondelete = findViewById(R.id.buttonDel);
        contents = findViewById(R.id.CalculatedValue);



        buttonzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"0");
            }
        });
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"1");
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"2");
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"3");
            }
        });

        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"4");
            }
        });

        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"5");
            }
        });

        buttonsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"6");
            }
        });

        buttonseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"7");
            }
        });

        buttoneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"8");
            }
        });

        buttonnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contents.setText(contents.getText()+"9");
            }
        });

        buttonaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(contents.getText().toString().isEmpty() == false){
                    value1 = Float.valueOf(contents.getText().toString());
                    valueadd = true;
                    contents.setText("");
                }else{
                    contents.setText("");
                }
            }
        });

        buttonsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    value1 = Float.valueOf(contents.getText().toString());
                    valuesub = true;
                    contents.setText("");
                }else{
                    contents.setText("");
                }
            }
        });

        buttonmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    value1 = Float.valueOf(contents.getText().toString());
                    valuemult = true ;
                    contents.setText("");
                }else{
                    contents.setText("");
                }
            }
        });

        buttondivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    value1 = Float.valueOf(contents.getText().toString());
                    valuediv = true;
                    contents.setText("");
                }else{
                    contents.setText("");
                }
            }
        });


        buttonequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    value2 = Float.valueOf(contents.getText().toString());
                }else{
                    contents.setText("");
                }
                Float add = (value1 + value2);
                Float subtract = (value1 - value2);
                Float multiply = (value1 * value2);
                Float divide = (value1 / value2);
                if (valueadd == true) {
                    contents.setText(add.toString());
                    valueadd = false;
                }


                if (valuesub == true){
                    contents.setText(subtract.toString());
                    valuesub=false;
                }

                if (valuemult == true){
                    contents.setText(multiply.toString());
                    valuemult=false;
                }

                if (valuediv == true){
                    contents.setText(divide.toString());
                    valuediv=false;
                }
            }
        });

        buttonpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    value1 = Float.valueOf(contents.getText() + "");
                    contents.setText(String.valueOf(value1 / 100));
                }else{
                    contents.setText("");
                }
            }
        });


        buttonallclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contents.setText(null);
            }
        });

        buttondecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((contents.getText()).toString().contains(".") == false) {
                    contents.setText(contents.getText() + ".");
                }
            }
        });
        buttondelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(contents.getText().toString().isEmpty() == false) {
                    String s = contents.getText().toString();
                    StringBuilder updatedstring = new StringBuilder(s);
                    updatedstring.deleteCharAt(s.length() - 1);
                    contents.setText(updatedstring.toString());
                }else{
                    contents.setText("");
                }
            }
        });

    }

}

