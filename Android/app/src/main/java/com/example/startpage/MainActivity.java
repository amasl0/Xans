package com.example.startpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void click_entr(View view) {
        Intent act_entr = new Intent(MainActivity.this, EnterActivity.class);
        startActivity(act_entr);
    }

    private void click_rgstr(View view) {
        Intent act_rgstr = new Intent(MainActivity.this, RegistrationActivity.class);
        setContentView(R.layout.registration);
        startActivity(act_rgstr);
    }
}