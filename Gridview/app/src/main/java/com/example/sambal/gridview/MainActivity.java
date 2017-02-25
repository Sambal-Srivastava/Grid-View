package com.example.sambal.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
GridView gridlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridlist= (GridView) findViewById(R.id.gridView);
        gridlist.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
             getResources().getStringArray(R.array.planets_in_solarsystem)));

        gridlist.setOnItemClickListener(new clickeditem());
    }

    private class clickeditem implements android.widget.AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(view.getContext(),(String) parent.getAdapter().getItem(position),Toast.LENGTH_LONG).show();
        }
    }
}
