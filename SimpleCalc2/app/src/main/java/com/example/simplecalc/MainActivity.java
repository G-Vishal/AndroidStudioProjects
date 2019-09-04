package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button sum,sub,multi,divide;

    float result_num;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);

        sum = (Button)findViewById(R.id.sum);
        sub = (Button)findViewById(R.id.sub);
        multi = (Button)findViewById(R.id.multi);
        divide = (Button)findViewById(R.id.divide);


        sum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 + num2;
                result.setText(String.valueOf(result_num));
            }
        });


        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 - num2;
                result.setText(String.valueOf(result_num));
            }
        });

        multi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 * num2;
                result.setText(String.valueOf(result_num));
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                result_num = num1 / num2;
                result.setText(String.valueOf(result_num));
            }
        });

    }


}
