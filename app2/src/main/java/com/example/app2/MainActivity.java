package com.example.app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editTextTextPersonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        Random random = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editTextTextPersonName.getText().toString();
                if (string!=null){
                    int i1 = Integer.parseInt(string);
                    int i = random.nextInt(i1);
                    textView.setText(i + "");
                } else {
                    Toast.makeText(MainActivity.this, "还没设置最大值那大哥", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}