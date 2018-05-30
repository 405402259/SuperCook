package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class find extends AppCompatActivity {
    private ImageButton search;
    private ImageButton star;
    private ImageButton message;
    private ImageButton person;
    private EditText clicket;
    private EditText et;
    private List<CheckBox> checkBoxList = new LinkedList<>();
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private ListView mListView;
    private ArrayAdapter mSearchAdapter;
    private ArrayList<String> mSearchList = new ArrayList<>();
    private boolean mIsSearch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        Spinner spinner1 = (Spinner)findViewById(R.id.find_type);
        final String[] type = {"中式", "日式", "法式", "德式", "義式", "美式", "英式", "葡式", "西班牙式", "俄式", "泰式", "韓式"};
        ArrayAdapter<String> typeList = new ArrayAdapter<>(find.this, android.R.layout.simple_spinner_dropdown_item, type);
        spinner1.setAdapter(typeList);

        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(find.this,find.class);
                startActivity(intent);
            }
        });

        star = findViewById(R.id.star);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(find.this,favorite.class);
                startActivity(intent);
            }
        });

        message = findViewById(R.id.message);
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(find.this,recipes.class);
                startActivity(intent);
            }
        });

        person = findViewById(R.id.person);
        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(find.this,profile.class);
                startActivity(intent);
            }
        });


        checkbox1 = (CheckBox) findViewById(R.id.find_sour);
        checkbox2 = (CheckBox) findViewById(R.id.find_sweet);
        checkbox3 = (CheckBox) findViewById(R.id.find_bitter);
        checkbox4 = (CheckBox) findViewById(R.id.find_spicy);
        checkbox5 = (CheckBox) findViewById(R.id.find_salty);

        checkBoxList.add(checkbox1);
        checkBoxList.add(checkbox2);
        checkBoxList.add(checkbox3);
        checkBoxList.add(checkbox4);
        checkBoxList.add(checkbox5);




    }



}

