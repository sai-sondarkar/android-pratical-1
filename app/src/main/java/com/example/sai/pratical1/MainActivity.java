package com.example.sai.pratical1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        initUiInteraction();
    }

    public void initUI(){
        button = (Button) findViewById(R.id.button);
    }

    public void initUiInteraction(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello World",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
