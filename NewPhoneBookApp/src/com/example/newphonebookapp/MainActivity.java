package com.example.newphonebookapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class MainActivity extends Activity {

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.main);

	        ListView list = (ListView) findViewById(R.id.ListView01);
	        list.setClickable(true);

	        final List<Phonebook> listOfPhonebook = new ArrayList<Phonebook>();
	        listOfPhonebook.add(new Phonebook("Test", "9981728", "test@test.com"));
	        listOfPhonebook.add(new Phonebook("Test1", "1234455", "test1@test.com"));
	        listOfPhonebook.add(new Phonebook("Test2", "00000", "test2@test.com"));

	        PhonebookAdapter adapter = new PhonebookAdapter(this, listOfPhonebook);

	        list.setOnItemClickListener(new OnItemClickListener() {

	            public void onItemClick(AdapterView<?> arg0, View view, int position, long index) {
	                System.out.println("sadsfsf");
	                showToast(listOfPhonebook.get(position).getName());
	            }
	        });

	        list.setAdapter(adapter);
	    }

	    private void showToast(String message) {
	        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
	    }

   

    
}
