package com.example.myapplication;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class favorite extends AppCompatActivity {
    private ImageButton search;
    private ImageButton star;
    private ImageButton message;
    private ImageButton person;
    private Button bt_favorite_delete;
    private TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite);



        r = (TextView) findViewById(R.id.myrecipe_tv);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(favorite.this,recipes.class);
                startActivity(intent);
            }
        });

        bt_favorite_delete = findViewById(R.id.bt_favorite_delete);
        bt_favorite_delete.setOnClickListener(listener);
    }

    private Button.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.bt_favorite_delete) {
                new AlertDialog.Builder(favorite.this)
                        .setTitle("對話視窗")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("確定刪除嗎？")
                        .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                }
                        )
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                
                            }
                        })
                        .show();
            }
        }
    };
}
