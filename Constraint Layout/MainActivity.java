package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]= {R.drawable.html, R.drawable.css};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.programming_languages);
        s2= getResources().getStringArray(R.array.description);

        MobilAdapter1301184059 MobilAdapter1301184059 = new MobilAdapter1301184059(ct: this, s1, s2, images);
    }
}