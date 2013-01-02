package com.example.buddyexpensemanagervi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class Calculations extends Activity{

	public void onCreate(Bundle savedInstanceState) {
		
		double r1=0,dvavg=0,b1=0,b2=0,b3=0,b4=0;
		
		String bname1,bname2,bname3,bname4;
		
        super.onCreate(savedInstanceState);

        setContentView(R.layout.thirdscreen);

        TextView totalexpense = (TextView) findViewById(R.id.txt_totalExpense);
        TextView avgexpense = (TextView) findViewById(R.id.txt_avgExpense);
        TextView buddy1bal = (TextView) findViewById(R.id.txt_buddy1Expense);
        TextView buddy2bal = (TextView) findViewById(R.id.txt_buddy2Expense);
        TextView buddy3bal = (TextView) findViewById(R.id.txt_buddy3Expense);
        TextView buddy4bal = (TextView) findViewById(R.id.txt_buddy4Expense);
        
        TextView buddy1name = (TextView) findViewById(R.id.txt_buddy1text);
        TextView buddy2name = (TextView) findViewById(R.id.txt_buddy2text);
        TextView buddy3name = (TextView) findViewById(R.id.txt_buddy3text);
        TextView buddy4name = (TextView) findViewById(R.id.txt_buddy4text);
        
        
        
        Intent intent = getIntent();
        
        
        r1 = intent.getDoubleExtra("result", r1);
        
        dvavg = intent.getDoubleExtra("avg", dvavg);
       
        b1 = intent.getDoubleExtra("buddy1", b1);
       
        b2 = intent.getDoubleExtra("buddy2", b2);
        
        b3 = intent.getDoubleExtra("buddy3", b3);
        
        b4 = intent.getDoubleExtra("buddy4", b4);
        
        bname1 = intent.getStringExtra("name");
        
        bname2 = intent.getStringExtra("name2");
        
        bname3 = intent.getStringExtra("name3");
        
        bname4 = intent.getStringExtra("name4");
        
        
        
        totalexpense.setText(Double.toString(r1));
        
        avgexpense.setText(Double.toString(dvavg));
        
        buddy1bal.setText(Double.toString(b1));
        
        buddy2bal.setText(Double.toString(b2));
        
        buddy3bal.setText(Double.toString(b3));
        
        buddy4bal.setText(Double.toString(b4));
        
        buddy1name.setText(bname1+"  has to pay or receive balance");
        
        buddy2name.setText(bname2+"  has to pay or receive balance");
        
        buddy3name.setText(bname3+"  has to pay or receive balance");
        
        buddy4name.setText(bname4+"  has to pay or receive balance");
}
}
