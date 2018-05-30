package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class profile extends AppCompatActivity {
    private Button bt_profile_modify;
    private Button bt_profile_recipe;
    private Button bt_profile_page;
    private Button bt_profile_feedback;
    private Button bt_profile_signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        bt_profile_modify = findViewById(R.id.bt_profile_modify);
        bt_profile_modify.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(profile.this,modify.class);
            startActivity(intent);
        }
    });

        bt_profile_recipe = findViewById(R.id.bt_profile_recipe);
        bt_profile_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this,myrecipe.class);
                startActivity(intent);
            }
        });

        bt_profile_page = findViewById(R.id.bt_profile_page);
        bt_profile_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this,mypage.class);
                startActivity(intent);
            }
        });

        bt_profile_feedback = findViewById(R.id.bt_profile_feedback);
        bt_profile_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this,suggest.class);
                startActivity(intent);
            }
        });

        bt_profile_signout = findViewById(R.id.bt_profile_signout);
        bt_profile_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(profile.this,signin.class);
                startActivity(intent);
            }
        });
}
    }