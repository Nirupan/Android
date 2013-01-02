package com.calculator.loan;







import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import android.widget.TextView;

import android.widget.Button;

import android.view.View;

@SuppressWarnings("unused")
public class NewLoanCalculatorActivity extends Activity {
    /** Called when the activity is first created. */
	  EditText amount1;
	  EditText amount2;
	  EditText amount3;
	  EditText tt;
	  Button calculate;
	  double x=0;
	  double y=0;
	  double z=0;
	  double w=0;
	  
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initcontrols();
    }
    
    private void initcontrols (){
    	amount1=(EditText)findViewById(R.id.editText1);
        amount2=(EditText)findViewById(R.id.editText2);
        amount3=(EditText)findViewById(R.id.editText3);
        tt=(EditText)findViewById(R.id.editText4);
        
        calculate=(Button)findViewById(R.id.button1);
        calculate.setOnClickListener(new Button.OnClickListener()
        {public void onClick
        (View  v) { calculate();}});
    }
    
    private void calculate()
    {
        x=Double.parseDouble(amount1.getText().toString());
        y=Double.parseDouble(amount2.getText().toString());
        z=Double.parseDouble(amount3.getText().toString());
        w=((z * y * x) / 100);
        tt.setText(Double.toString(w));
    }
}