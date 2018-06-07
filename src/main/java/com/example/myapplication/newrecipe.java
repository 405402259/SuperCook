package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CursorTreeAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;





  /*
    private FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    private DatabaseReference mDatabase=firebaseDatabase.getReference();
    private DataSnapshot id;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newrecipe);
        Spinner spinner1 = (Spinner)findViewById(R.id.newrecipe_type);
        final String[] type = {"中式", "日式", "法式", "德式", "義式", "美式", "英式", "葡式", "西班牙式", "俄式", "泰式", "韓式"};
        ArrayAdapter<String> typeList = new ArrayAdapter<>(newrecipe.this, android.R.layout.simple_spinner_dropdown_item, type);
        spinner1.setAdapter(typeList);
    }

    /*
        private void writeNewRecipe(String recipeName, String tool, String time,
        String hard,String ingredient,String type,
        String taste,String topic,String people,String step,
        String publisher,DataSnapshot id) {
        String recipeName=findViewById( R.id.newrecipe_recipeName ).toString();
        String tool=findViewById( R.id.newrecipe__tool).toString();
        String time=findViewById( R.id.newrecipe__time ).toString()+" min";
        String hard=findViewById( R.id.newrecipe_hard).toString();
        String ingredient=findViewById( R.id.newrecipe__food ).toString();
        String topic=findViewById( R.id.newrecipe_topic ).toString();
        String people=findViewById( R.id.newrecipe_people ).toString();
        String step=findViewById( R.id.newrecipe_step ).toString();
        String publisher=findViewById( R.id.mypage_username ).toString();

    }

    @Override
    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onChildRemoved(DataSnapshot dataSnapshot) {

    }

    @Override
    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

    }

    @Override
    public void onCancelled(DatabaseError databaseError) {

    }





    /*private void writeNewRecipe(DataSnapshot childrenCount) {
        String recipeName=findViewById( R.id.newrecipe_recipeName ).toString();
        String tool=findViewById( R.id.newrecipe__tool).toString();
        String time=findViewById( R.id.newrecipe__time ).toString()+" min";
        String hard=findViewById( R.id.newrecipe_hard).toString();
        String ingredient=findViewById( R.id.newrecipe__food ).toString();
        String topic=findViewById( R.id.newrecipe_topic ).toString();
        String people=findViewById( R.id.newrecipe_people ).toString();
        String step=findViewById( R.id.newrecipe_step ).toString();
        String publisher=findViewById( R.id.mypage_username ).toString();


        Recipe rcp = new Recipe(recipeName,tool,time,hard,ingredient,"中式","salt",topic,people,null,step,null,publisher,true);
        mDatabase.child("recipe").child(String.valueOf( n(id) )).setValue(rcp);*/


}
