package com.example.buddyexpensemanagervi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class InnerClass extends Activity{
	
public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);

        setContentView(R.layout.secondscreen);

        

        TextView txt_enteredName = (TextView) findViewById(R.id.txt_enteredName);

         final TextView txt_enteredexpense = (TextView) findViewById(R.id.txt_enteredExpense);
         
         
         
         
         
         TextView txt_secondenteredName = (TextView) findViewById(R.id.txt_secondenteredName);

         final TextView txt_secondenteredexpense = (TextView) findViewById(R.id.txt_secondenteredExpense);

         
         
         
         TextView txt_thirdenteredName = (TextView) findViewById(R.id.txt_thirdenteredName);

         final TextView txt_thirdenteredexpense = (TextView) findViewById(R.id.txt_thirdenteredExpense);

       
         
         
         TextView txt_fourthenteredName = (TextView) findViewById(R.id.txt_fourthenteredName);

         final TextView txt_fourthenteredexpense = (TextView) findViewById(R.id.txt_fourthenteredExpense);

        
         
         
         /* Get values from Intent */

        Intent intent = getIntent();

         

        final String name  = intent.getStringExtra("name1");

        String expense = intent.getStringExtra("expense1");
        
        

        final String name2  = intent.getStringExtra("name2");

        String expense2 = intent.getStringExtra("expense2");

       

        final String name3  = intent.getStringExtra("name3");

        String expense3 = intent.getStringExtra("expense3");
        
        


        final String name4  = intent.getStringExtra("name4");

        String expense4 = intent.getStringExtra("expense4");

        
        
        
        txt_enteredName.setText(name);

        txt_enteredexpense.setText(expense);
        
        

        txt_secondenteredName.setText(name2);

        txt_secondenteredexpense.setText(expense2);
        
      
	
        txt_thirdenteredName.setText(name3);

        txt_thirdenteredexpense.setText(expense3);
        
       
        
        txt_fourthenteredName.setText(name4);

        txt_fourthenteredexpense.setText(expense4);

      
        
        
        
        
        
        Button calc = (Button) findViewById(R.id.btn_calc);

        

        calc.setOnClickListener(new View.OnClickListener() {



    public void onClick(View v) {

     

    
    

    
    
    double a=0,b=0,c=0,d=0,s=0,div=0,sa=0,sb=0,sc=0,sd=0;
    
    


    a=Double.parseDouble(txt_enteredexpense.getText().toString());
    
    b=Double.parseDouble(txt_secondenteredexpense.getText().toString());
    
    c=Double.parseDouble(txt_thirdenteredexpense.getText().toString());
    
    d=Double.parseDouble(txt_fourthenteredexpense.getText().toString());
    
    s=a+b+c+d;
    
    div= s /4;
    
    sa = div - a;
    sb = div - b;
    sc = div - c;
    sd = div - d;
    
    
    

    Intent intent  = new Intent(getApplicationContext(),Calculations.class);

     
   intent.putExtra("result", s);
   intent.putExtra("avg", div);
   intent.putExtra("buddy1", sa);
   intent.putExtra("buddy2", sb);
   intent.putExtra("buddy3", sc);
   intent.putExtra("buddy4", sd);
   intent.putExtra("name", name);
   intent.putExtra("name2", name2);
   intent.putExtra("name3", name3);
   intent.putExtra("name4", name4);
   
 


    startActivity(intent);

      

    }

    });

        
        
	}

}
