package com.example.basicgmailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Gmail> gmails = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new GmailListAdapter(this, gmails));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Gmail gmail = (Gmail) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + gmail, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Gmail> getListData() {
        List<Gmail> gmails = new ArrayList<>();
        Gmail a = new Gmail("Adam", "Question of week", "I have a B.S. in computer science but...", "9:00 AM");
        Gmail b = new Gmail("Dom Nguyen", "Black Friday sale", "Hi there, Black Friday is here, don't m...", "8:00 AM");
        Gmail c = new Gmail("Elice", "Coronavirus news", "Wave #6 in Europe and US: “That brings us...", "7:00 AM");
        Gmail d = new Gmail("Mike", "The message from Google Team", "Hung, take the next step on your Windows...", "5:00 AM");
        gmails.add(a);
        gmails.add(b);
        gmails.add(c);
        gmails.add(d);
        return gmails;
    }
}