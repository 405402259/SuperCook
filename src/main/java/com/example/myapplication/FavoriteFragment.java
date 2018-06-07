package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FavoriteFragment extends Fragment {

    private TextView read_recipe;
    private Button bt_favorite_delete;
    private View view;

    public FavoriteFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorite, container, false);

        read_recipe = (TextView) view.findViewById(R.id.myrecipe_tv);
        read_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),recipes.class);
                startActivity(intent);
            }
        });

        bt_favorite_delete = (Button) view.findViewById(R.id.bt_favorite_delete);
        bt_favorite_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.bt_favorite_delete) {
                    new AlertDialog.Builder(getActivity())
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
        return view;
    }

}
