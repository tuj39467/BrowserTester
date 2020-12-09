package edu.temple.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("Browser Tester");
            }
            android.widget.Button button = new android.widget.Button(this);
            button.setText("Click Here to open Temple's website!");
            button.setOnClickListener(new android.view.View.OnClickListener() {
                @Override
                public void onClick(android.view.View v) {
                    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("http://www.temple.edu")));
                }
            });
            setContentView(button);
    }
}