package com.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textViewPunkty;
    private ImageButton imageButtonGora;
    private ImageButton imageButtonDol;
    private  int licznik=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageButtonGora = findViewById(R.id.imageButton);
        imageButtonDol = findViewById(R.id.imageButton2);
        textViewPunkty = findViewById(R.id.textViewPunkty);
        if(savedInstanceState!=null){
            licznik = savedInstanceState.getInt("PUNKTY");
            textViewPunkty.setText(String.valueOf(licznik));
        }
        Log.i("Czas Zycia","wywolana oncreta");
        imageButtonGora.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznik++;
                        textViewPunkty.setText(String.valueOf(licznik));
                    }
                }
        );
        imageButtonDol.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        licznik--;
                        textViewPunkty.setText(String.valueOf(licznik));
                    }
                }
        );

        git init
        git config user.name "[nazwa]"
        git config user.email "[nazwa]"
        git add .
        git commit -m "tłumaczenia"


        karameler
                trudne


    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Czas Zycia","wywolana onresum");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Czas Zycia","wywolana onpaus");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Czas Zycia","wywolana ondestroj");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Czas Zycia","wywolana onstop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Czas Zycia","wywolana restart");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Czas Zycia","wywolana save");
    outState.putInt("PUNKTY",licznik);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Czas Zycia","wywolana onstrat");

    }
}