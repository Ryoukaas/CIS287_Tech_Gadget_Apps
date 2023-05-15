package com.example.techgadgetapps;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] gadgets = {"Nintendo Switch", "Steam Deck", "Xbox Series X", "Playstation 5", "Gaming Computer"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.gadget, gadgets));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, NintendoSwitch.class));
                break;

            case 1:
                startActivity(new Intent(MainActivity.this, SteamDeck.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, XboxSeriesX.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Playstation5.class));
                break;
            case 4:
                startActivity(new Intent(MainActivity.this, GamingComputer.class));
                break;
        }
    }
}