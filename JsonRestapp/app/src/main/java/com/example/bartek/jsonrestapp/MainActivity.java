package com.example.bartek.jsonrestapp;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private AssetManager am;
    private InputStream is;
    private JsonParser jParser;
    private Object obj;
    private JsonObject jsonObject;
    private Gson gson;
    private  Markers[] markers;
    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        am = getBaseContext().getAssets();
        is = getResources().openRawResource(R.raw.json);

        jParser = new JsonParser();
        obj = jParser.parse(new InputStreamReader(is));
        jsonObject = (JsonObject) obj;
        gson = new GsonBuilder().create();
        markers = gson.fromJson(jsonObject.get("markers").toString(), Markers[].class );
        textView = (TextView) findViewById(R.id.editText);

    }

    public void importJson(View view) {
           textView.setText(markers[0].toString());

    }
}
