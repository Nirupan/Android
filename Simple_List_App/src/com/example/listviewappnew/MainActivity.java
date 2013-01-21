package com.example.listviewappnew;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.app.ListActivity;

@SuppressWarnings("unused")
public class MainActivity extends ListActivity {

	//LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
	ArrayList<String> listItems=new ArrayList<String>();

	//DEFINING STRING ADAPTER WHICH WILL HANDLE DATA OF LISTVIEW
	ArrayAdapter<String> adapter;

	//RECORDING HOW MUCH TIMES BUTTON WAS CLICKED
	int clickCounter=0;

	@Override
	public void onCreate(Bundle icicle) {

	super.onCreate(icicle);
	setContentView(R.layout.main);
	adapter=new ArrayAdapter<String>(this,
	    android.R.layout.simple_list_item_1,
	    listItems);
	setListAdapter(adapter);
	}

	//METHOD WHICH WILL HANDLE DYNAMIC INSERTION
	public void addItems(View v) {
	 listItems.add("Clicked : "+clickCounter++);
	 adapter.notifyDataSetChanged();
	}
    

    
}
