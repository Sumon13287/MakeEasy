package com.example.makeeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ThirtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirt);
    }

    public void answer(View view) {
        try {
            EditText operand = (EditText) findViewById(R.id.operand);
            EditText firstValue = (EditText) findViewById(R.id.editTextNumber_first);
            EditText secondValue = (EditText) findViewById(R.id.editTextNumber_second);

            double vOperand = Double.parseDouble(operand.getText().toString());
            double vfirstValue = Double.parseDouble(firstValue.getText().toString());
            double vsecondValue = Double.parseDouble(secondValue.getText().toString());
            if(vOperand == 1){
                double result = vfirstValue + vsecondValue;
                printResult(result);
            }
            else if(vOperand == 2){
                double result = vfirstValue - vsecondValue;
                printResult(result);
            }
            else if(vOperand == 3){
                double result = vfirstValue * vsecondValue;
                printResult(result);
            }
            else if(vOperand == 4){
                double result = vfirstValue / vsecondValue;
                printResult(result);
            }
            else{
                Toast.makeText(getApplicationContext(), "You got some mistake on the Type. Please check our Instruction. ", Toast.LENGTH_LONG).show();
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Pleage give input!", Toast.LENGTH_SHORT).show();
        }

    }

    public void printResult(double result){
        DecimalFormat formatval = new DecimalFormat("##.###");
        Toast.makeText(getApplicationContext(), "Result = "+ formatval.format(result), Toast.LENGTH_LONG).show();
    }

}