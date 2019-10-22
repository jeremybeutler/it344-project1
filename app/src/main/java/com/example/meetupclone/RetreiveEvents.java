//package com.example.meetupclone;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.ProtocolException;
//import java.net.URL;
//import android.os.AsyncTask;
//
//class RetrieveEvents extends AsyncTask<String, String, String> {
//
//    private Exception exception;
//
//    protected String doInBackground(String... args) {
//        try {
//            HttpURLConnection urlConnection = null;
//            String url_string = args[0];
//            URL url = new URL(url_string);
//            urlConnection = (HttpURLConnection) url.openConnection();
//            urlConnection.setRequestMethod("GET");
//            urlConnection.setReadTimeout(10000 /* milliseconds */);
//            urlConnection.setConnectTimeout(15000 /* milliseconds */);
//            urlConnection.setDoOutput(true);
//            urlConnection.connect();
//            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//            StringBuilder sb = new StringBuilder();
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                sb.append(line + "\n");
//            }
//            br.close();
//
//            String jsonString = sb.toString();
//            return jsonString;
//        } catch (Exception e) {
////            Log.d(TAG, e.getLocalizedMessage());
//            System.out.println("Exception: " + e.getLocalizedMessage());
//            return  e.getLocalizedMessage();
//
//        }
//    }
//
//    protected void onProgressUpdate(Integer... progress) {
//    }
//
//    protected String onPostExecute(String result) {
//        // this is executed on the main thread after the process is over
//        // update your UI here
//        // System.out.println("JSON string result: " + result);
//        return result;
//    }
//}
