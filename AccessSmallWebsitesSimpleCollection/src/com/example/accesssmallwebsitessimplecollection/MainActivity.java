package com.example.accesssmallwebsitessimplecollection;



import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	
	ImageButton b7,b8,b9,b10,b11,b12;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b7=(ImageButton)findViewById(R.id.b7);
        b7.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "http://google.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
        b8=(ImageButton)findViewById(R.id.b8);
        b8.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "http://facebook.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
        b9=(ImageButton)findViewById(R.id.b9);
        b9.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/?tab%3Dwm&scc=1&ltmpl=default&ltmplcache=2";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
        
        b10=(ImageButton)findViewById(R.id.b10);
        b10.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "http://www.linkedin.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
        
        b11=(ImageButton)findViewById(R.id.b11);
        b11.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "https://twitter.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
        
        b12=(ImageButton)findViewById(R.id.b12);
        b12.setOnClickListener(new ImageButton.OnClickListener()
        {public void onClick
        (View  v) {
        	String url = "http://wikipedia.org";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        	
        }});
    }

    

    
}
