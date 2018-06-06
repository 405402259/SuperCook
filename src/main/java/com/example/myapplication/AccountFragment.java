package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AccountFragment extends Fragment {
    public AccountFragment() {
    }

    private Button bt_profile_modify;
    private Button bt_profile_recipe;
    private Button bt_profile_page;
    private Button bt_profile_feedback;
    private Button bt_profile_signout;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.profile, container, false);

        bt_profile_modify = (Button) view.findViewById(R.id.bt_profile_modify);
        bt_profile_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(),modify.class);
                startActivity(intent);
            }
        });

        bt_profile_recipe = view.findViewById(R.id.bt_profile_recipe);
        bt_profile_recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),myrecipe.class);
                startActivity(intent);
            }
        });

        bt_profile_page = view.findViewById(R.id.bt_profile_page);
        bt_profile_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),mypage.class);
                startActivity(intent);
            }
        });

        bt_profile_feedback = view.findViewById(R.id.bt_profile_feedback);
        bt_profile_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),suggest.class);
                startActivity(intent);
            }
        });

        bt_profile_signout = view.findViewById(R.id.bt_profile_signout);
        bt_profile_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),signin.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
