package com.example.techgadgetapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class XboxSeriesX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_xbox_series_x);
        Button xbox=(Button) findViewById(R.id.btnXbox);
        xbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.xbox.com/en-US/consoles/xbox-series-x")));
            }
        });
    }
}
