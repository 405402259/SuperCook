package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class myrecipe extends AppCompatActivity {
    private Button myrecipe_insert;
    private Button myrecipe_del;

    private TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myrecipe);

        myrecipe_insert = findViewById(R.id.myrecipe_insert);
        myrecipe_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myrecipe.this, newrecipe.class);
                startActivity(intent);
            }
        });

        myrecipe_del = findViewById(R.id.myrecipe_del);
        myrecipe_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.myrecipe_del) {
                    new AlertDialog.Builder(myrecipe.this)
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
        });


        r = (TextView) findViewById(R.id.myrecipe_tv);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myrecipe.this, recipes.class);
                startActivity(intent);
            }
        });
    }
}
