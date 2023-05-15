package com.example.techgadgetapps;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GamingComputer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancedState){
        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_gaming_computer);
        Button gamingComputer=(Button) findViewById(R.id.btnGamingComputer);
        gamingComputer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://skytechgaming.com/product/prism2b-0685-12700f-4070ti-32grgb/")));
            }
        });
    }
}
