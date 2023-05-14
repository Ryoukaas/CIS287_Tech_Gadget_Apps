package com.example.techgadgetapps;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] gadgets={"Nintendo Switch", "Steam Deck"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.gadget, gadgets));
    }
}