package com.example.lab1bb;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list = new ArrayList<String>(Arrays.asList("you get knocked out", "you go somewhere else","you find a dead man","you find a dead women", "you meet a buxom blonde", "you meet a buxom blonde", "someone has searched the place",
            "a crooked cop warns you", "you are arrested", "you find a gun", "you find a knife", "you find a frayed rope", "a bullet whizzes past your ear!",
            "you are almost run over", "you are being followed", "you smell fimiliar perfume",
            "the telephone rings", "there is a knock at the door", "you hear footsteps behind you",
            "you hear a gunshot!", "you hear a scream!", "you are not alone", "...forget this story it suck!"));
    private ArrayList<String> sublist = new ArrayList<>();

    public void storyIterator(View v){

        TextView t =(TextView) findViewById(R.id.textView2);

        if (list.size() > 0){
            int index = (int) Math.round(Math.random() * list.size());

            String s = list.remove(index);

            t.setText(s);

            sublist.add(s);
        }

        else {
            for (int i = 0; i < sublist.size(); i++){
                list.add(sublist.get(i));

            }
            sublist.clear();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
