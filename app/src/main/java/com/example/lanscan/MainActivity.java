package com.example.lanscan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder output = new StringBuilder();
                EditText edit=findViewById(R.id.edit);
                //有需要可以修改下面的代码修改路径前缀
                File folder = new File("/storage/emulated/0/"+edit.getText());
                File[] listOfFiles = folder.listFiles();

                for (File listOfFile : listOfFiles) {
                    output.append(listOfFile.getAbsolutePath());
                }
                textView.setText(output);
            }
        });
    }



}