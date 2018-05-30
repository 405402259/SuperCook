package com.example.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class recipes extends AppCompatActivity {


    //private TextView needfood=(TextView)findViewById( R.id.tv_needfood );
   // private EditText people=(EditText)findViewById( R.id.et_people );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes);


        //needfood.setText( f(needfood) );
    }

    /*public String f(TextView nf){
        String f="";
        String[] nf2=needfood.toString().split( "," );
        for (int i=0;i<nf2.length;i++){
            String[] fn=nf2[i].split( " " );
            int n=Integer.valueOf(people.toString());
            nf2[i]=fn[0]+" "+String.valueOf(n*1.0/Integer.valueOf(fn[1]));
            f+=nf2[i];
        }
        return f;

    }*/


}