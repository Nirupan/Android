package com.table.multiply;



import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import android.widget.TextView;

import android.widget.Button;

import android.view.View;

@SuppressWarnings("unused")
public class MultiplicationTableActivity extends Activity {
    /** Called when the activity is first created. */
	
	 EditText v1;
	  EditText v2;
	  EditText v3;
	  EditText v4;
	  EditText v5;
	  EditText v6;
	  Button calculate;
	  double x=0;
	  double y=0;
	  double z=0;
	  double w=0;
	  double u=0;
	  double v=0;
	  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        controls();
    
    }
    private void controls (){
    	v1=(EditText)findViewById(R.id.editText1);
        v2=(EditText)findViewById(R.id.editText2);
        v3=(EditText)findViewById(R.id.editText3);
        v4=(EditText)findViewById(R.id.editText4);
        y++;          
        
        calculate=(Button)findViewById(R.id.button1);
        calculate.setOnClickListener(new Button.OnClickListener()
        {
        	public void onClick
        (View  v) {
        		
        		if(y<=10)
        		
        		calculate();
                
        		else 
        		{	
        			y=1;
        			calculate();
        		}
            
              
        		}
        	
        
    });
}
    
    private void calculate()
    {
        x=Double.parseDouble(v1.getText().toString());
        v2.setText(Double.toString(x));
        v3.setText(Double.toString(y));
        z=x * y;
        v4.setText(Double.toString(z));
        y++;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }        
     
}
