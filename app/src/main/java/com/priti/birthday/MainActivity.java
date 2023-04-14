package com.priti.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     button = findViewById(R.id.btn);
     button.setOnClickListener(new View.OnClickListener() {

         @Override
         public void onClick(View view) {

      Log.d("first","happy birthday");
             Toast.makeText(MainActivity.this," wish a very HAPPIEST BIRTHDAY",Toast.LENGTH_SHORT).show();
         }
     });
    }

}