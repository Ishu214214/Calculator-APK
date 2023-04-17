package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView t;
    Button addition ,subtract , multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.no1);
        n2=findViewById(R.id.no2);
        addition=findViewById(R.id.add);
        subtract=findViewById(R.id.sub);
        multiply=findViewById(R.id.mul);
        divide=findViewById(R.id.div);
        t=findViewById(R.id.txt1);

    }

    public void addition(View v)
    {
        String str1 = n1.getText().toString();
        String str2 = n2.getText().toString();
        int num1=Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3=num1+num2;
        String str3 = String.valueOf(num3);
        t.setText(str3);

    }

    public void subtraction(View v)
    {
        String str1 = n1.getText().toString();
        String str2 = n2.getText().toString();
        int num1=Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3=num1-num2;
        String str3 = String.valueOf(num3);
        t.setText(str3);

    }

    public void multiply(View v)
    {
        String str1 = n1.getText().toString();
        String str2 = n2.getText().toString();
        int num1=Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3=num1*num2;
        String str3 = String.valueOf(num3);
        t.setText(str3);

    }

    public void divide(View v)
    {
        String str1 = n1.getText().toString();
        String str2 = n2.getText().toString();
        int num1=Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3=num1/num2;
        String str3 = String.valueOf(num3);
        t.setText(str3);

    }



}