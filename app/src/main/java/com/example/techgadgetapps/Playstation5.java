package com.example.techgadgetapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Playstation5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_playstation5);
        Button playstation=(Button) findViewById(R.id.btnPlaystation5);
        playstation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.playstation.com/en-us/ps5/")));
            }
        });
    }
}
