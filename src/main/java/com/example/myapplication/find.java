package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.File;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class find extends AppCompatActivity implements ChildEventListener {
    private ImageButton search;
    private ImageButton star;
    private ImageButton message;
    private ImageButton person;

    private EditText et;
    private String e;
    private List<CheckBox> checkBoxList = new LinkedList<>();
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;
    private CheckBox checkbox4;
    private CheckBox checkbox5;
    private ListView mListView;
    private ArrayAdapter<String> searchList;
    private boolean mIsSearch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        Spinner spinner1 = (Spinner)findViewById(R.id.find_type);
        final String[] type = {"中式", "日式", "法式", "德式", "義式", "美式", "英式", "葡式", "西班牙式", "俄式", "泰式", "韓式"};
        ArrayAdapter<String> typeList = new ArrayAdapter<>(find.this, android.R.layout.simple_spinner_dropdown_item, type);
        spinner1.setAdapter(typeList);



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



        ListView list = (ListView) findViewById(R.id.find_list);
        searchList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1);
        list.setAdapter(searchList);

        FirebaseDatabase fireDB = FirebaseDatabase.getInstance();
        DatabaseReference myRef = fireDB.getReference("recipe");
        myRef.addChildEventListener(this);


        et = (EditText)findViewById( R.id.find_recipeName );
        e = et.getText().toString();






    }


    @Override
    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
        searchList.add(
                String.valueOf(dataSnapshot.child("recipeName").getValue()));
    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {
        searchList.remove(
                String.valueOf(dataSnapshot.child("recipeName").getValue()));
    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) { }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) { }

    @Override
    public void onCancelled(DatabaseError databaseError) { }
}







