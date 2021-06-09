package com.dimidium.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final static String TAG = "[LifeCycleActivity]";
    private Processing processing;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        processing = new Processing();
        Calculating ();
    }

    private void Calculating() {
        textResult = findViewById(R.id.Result);
        onButtonClickListener0();
        onButtonClickListener1();
        onButtonClickListener2();
        onButtonClickListener3();
        onButtonClickListener4();
        onButtonClickListener5();
        onButtonClickListener6();
        onButtonClickListener7();
        onButtonClickListener8();
        onButtonClickListener9();
        onButtonClickListenerDivide();
        onButtonClickListenerMultiply();
        onButtonClickListenerMinus();
        onButtonClickListenerPlus();
        onButtonClickListenerResult();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.num_0:
                setTextResult(textResult, "0");
                break;
            case R.id.num_1:
                setTextResult(textResult,"1");
                break;
            case R.id.num_2:
                setTextResult(textResult,"2");
                break;
            case R.id.num_3:
                setTextResult(textResult,"3");
                break;
            case R.id.num_4:
                setTextResult(textResult,"4");
                break;
            case R.id.num_5:
                setTextResult(textResult,"5");
                break;
            case R.id.num_6:
                setTextResult(textResult,"6");
                break;
            case R.id.num_7:
                setTextResult(textResult,"7");
                break;
            case R.id.num_8:
                setTextResult(textResult,"8");
                break;
            case R.id.num_9:
                setTextResult(textResult,"9");
                break;
            case R.id.decimal:
                setTextResult(textResult,".");
                break;
            case R.id.result:
                setTextResult(textResult,"=");
                break;
            case R.id.plus:
                setTextResult(textResult,"+");
                break;
            case R.id.minus:
                setTextResult(textResult,"-");
                break;
            case R.id.multiply:
                setTextResult(textResult,"*");
                break;
            case R.id.divide:
                setTextResult(textResult,"/");
                break;
        }
    }

    private void setTextResult(TextView textResult, String string) {
        textResult.setText(String.format(Locale.getDefault(), "%s", string));
    }

    private void onButtonClickListener0(){
        Button num_0 = findViewById(R.id.num_0);
        num_0.setOnClickListener(this);
    }
    private void onButtonClickListener1(){
        Button num_1 = findViewById(R.id.num_1);
        num_1.setOnClickListener(this);
    }
    private void onButtonClickListener2(){
        Button num_2 = findViewById(R.id.num_2);
        num_2.setOnClickListener(this);
    }
    private void onButtonClickListener3(){
        Button num_3 = findViewById(R.id.num_3);
        num_3.setOnClickListener(this);
    }
    private void onButtonClickListener4(){
        Button num_4 = findViewById(R.id.num_4);
        num_4.setOnClickListener(this);
    }
    private void onButtonClickListener5(){
        Button num_5 = findViewById(R.id.num_5);
        num_5.setOnClickListener(this);
    }
    private void onButtonClickListener6(){
        Button num_6 = findViewById(R.id.num_6);
        num_6.setOnClickListener(this);
    }
    private void onButtonClickListener7(){
        Button num_7 = findViewById(R.id.num_7);
        num_7.setOnClickListener(this);
    }
    private void onButtonClickListener8(){
        Button num_8 = findViewById(R.id.num_8);
        num_8.setOnClickListener(this);
    }
    private void onButtonClickListener9(){
        Button num_9 = findViewById(R.id.num_9);
        num_9.setOnClickListener(this);
    }
    private void onButtonClickListenerResult(){
        Button result = findViewById(R.id.result);
        result.setOnClickListener(this);
    }
    private void onButtonClickListenerMinus(){
        Button minus = findViewById(R.id.minus);
        minus.setOnClickListener(this);
    }
    private void onButtonClickListenerPlus(){
        Button plus = findViewById(R.id.plus);
        plus.setOnClickListener(this);
    }
    private void onButtonClickListenerMultiply(){
        Button multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(this);
    }
    private void onButtonClickListenerDivide(){
        Button divide = findViewById(R.id.divide);
        divide.setOnClickListener(this);
    }

}