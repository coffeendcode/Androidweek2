package com.example.a100948484.myapplication;

import android.app.Activity;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quit = (Button) findViewById(R.id.quit);
        ButtonListener quitListener = new ButtonListener();
        quit.setOnClickListener((quitListener));
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart completed", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume completed", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnCreate completed", Toast.LENGTH_LONG).show();
    }

    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "OnCreate completed", Toast.LENGTH_LONG).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "OnCreate completed", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnCreate completed", Toast.LENGTH_LONG).show();
    }

    private class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            finish();
        }
    }
}
