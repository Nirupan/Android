package com.example.buddyexpensemanagervi;



import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {


	EventDataSQLHelper eventsData;
	  TextView output;
	  Long id[] = new Long[20];
	  String name[] = new String [20];
	  String expense[] = new String [20];
	  
	  Integer i=0;
	  
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

	    output = (TextView) findViewById(R.id.output);

	    
	    
	    
	    
	    eventsData = new EventDataSQLHelper(this);
	    addEvent("Raj","100");
	    addEvent("Ravi","200");
	    addEvent("Ramu","300");
	    addEvent("Shamu","400");
	    Cursor cursor = getEvents();
	    showEvents(cursor);
	    
	    
	    Button next = (Button) findViewById(R.id.btn_submit);
	    
	    next.setOnClickListener(new View.OnClickListener() {



	    	public void onClick(View v) {

	    	 

	    	





	    	Intent intent  = new Intent(getApplicationContext(),InnerClass.class);

	    	 

	    	intent.putExtra("name1", name[0]);

	    	intent.putExtra("expense1", expense[0]);
	    	
	    	

	    	intent.putExtra("name2", name[1]);

	    	intent.putExtra("expense2", expense[1]); 

	    	
	    	
	    	intent.putExtra("name3", name[2]);

	    	intent.putExtra("expense3", expense[2]);
	    	
	    	

	    	intent.putExtra("name4", name[3]);

	    	intent.putExtra("expense4", expense[3]);
	    	
	    	





	    	startActivity(intent);

	    	  

	    	}

	    	});
	    
	  }
	  
	  @Override
	  public void onDestroy() {
	    eventsData.close();
	  }

	  private void addEvent(String name, String expense) {
	    SQLiteDatabase db = eventsData.getWritableDatabase();
	    ContentValues values = new ContentValues();
	    values.put(EventDataSQLHelper.NAME, name);
	    values.put(EventDataSQLHelper.EXPENSE, expense);
	    
	    db.insert(EventDataSQLHelper.TABLE, null, values);

	  }

	  private Cursor getEvents() {
	    SQLiteDatabase db = eventsData.getReadableDatabase();
	    Cursor cursor = db.query(EventDataSQLHelper.TABLE, null, null, null, null,
	        null, null);
	    
	    startManagingCursor(cursor);
	    return cursor;
	  }

	  private void showEvents(Cursor cursor) {
	    StringBuilder ret = new StringBuilder("Saved Buddies:\n\n");
	    while (cursor.moveToNext()) {
	      long id1 = cursor.getLong(0);
	       String name1 = cursor.getString(1);
	       String expense1 = cursor.getString(2);
	       
	       
	       
	       id[i]=id1;
	       name[i]=name1;
	       expense[i]=expense1;
	      
	       
	       i++;
	      ret.append(id1 + ": " + name1 + ": " + expense1 + ": "  + "\n");
	    }
	    output.setText(ret);
	  }
   

    
}
