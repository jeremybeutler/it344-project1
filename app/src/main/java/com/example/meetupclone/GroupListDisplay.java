package com.example.meetupclone;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONException;
import java.io.IOException;

public class GroupListDisplay extends Activity {
    // Array of strings...
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);

        String urlString = "http://10.0.2.2:3000/events";
//        try{
            RetrieveEvents retrieveEvents = new RetrieveEvents();
            retrieveEvents.execute(urlString);
            //
            // Parse your json here
            //
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

//    public static JSONObject getJSONObjectFromURL(String urlString) throws IOException, JSONException {
//        HttpURLConnection urlConnection = null;
//        URL url = new URL(urlString);
//        urlConnection = (HttpURLConnection) url.openConnection();
//        urlConnection.setRequestMethod("GET");
//        urlConnection.setReadTimeout(10000 /* milliseconds */ );
//        urlConnection.setConnectTimeout(15000 /* milliseconds */ );
//        urlConnection.setDoOutput(true);
//        urlConnection.connect();
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//        StringBuilder sb = new StringBuilder();
//
//        String line;
//        while ((line = br.readLine()) != null) {
//            sb.append(line + "\n");
//        }
//        br.close();
//
//        String jsonString = sb.toString();
//        System.out.println("JSON: " + jsonString);
//
//        return new JSONObject(jsonString);
//    }
}


