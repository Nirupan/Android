package com.example.jsonpublictimeline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.app.ListActivity;


@SuppressWarnings("unused")
public class MainActivity extends ListActivity {
    /** Called when the activity is first created. */
    @SuppressWarnings({ "rawtypes", "unchecked" })
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.fetchTwitterPublicTimeline()));
    }
    public ArrayList<String> fetchTwitterPublicTimeline()
    {
        ArrayList<String> listItems = new ArrayList<String>();
        try {
            URL twitter = new URL(
            		//"https://api.twitter.com/1/statuses/user_timeline/sachin_rt");
            		"https://api.twitter.com/1/statuses/user_timeline/CypressNorth.json");
            		//"http://twitter.com/statuses/public_timeline.json");
            		
            URLConnection tc = twitter.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    tc.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                JSONArray ja = new JSONArray(line);
                for (int i = 0; i < ja.length(); i++) {
                    JSONObject jo = (JSONObject) ja.get(i);
                    listItems.add(jo.getString("text"));
                }
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return listItems;
    }




   
   

    
}
