package com.example.myapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {

    private TextView tv_newaccount;
    private  TextView tv_forgetpassword;

    private EditText txtEmailLogin;
    private EditText txtPwd;
    private FirebaseAuth firebaseAuth;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        txtEmailLogin = (EditText) findViewById(R.id.et_loginname);
        txtPwd = (EditText) findViewById(R.id.et_loginpassword);
        firebaseAuth = FirebaseAuth.getInstance();

        tv_newaccount = (TextView) findViewById(R.id.tv_newaccount);
        tv_newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this,createaccount.class);
                startActivity(intent);
            }
        });

        tv_forgetpassword = (TextView) findViewById(R.id.tv_forgetpassword);
        tv_forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this,forgetpassword.class);
                startActivity(intent);
            }
        });
    }

    public void btnUserLogin_Click(View v) {
        final ProgressDialog progressDialog = ProgressDialog.show(signin.this, "Please wait...", "Proccessing...", true);

        (firebaseAuth.signInWithEmailAndPassword(txtEmailLogin.getText().toString(), txtPwd.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(signin.this, "Login successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(signin.this, MainActivity.class);
                            i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                            startActivity(i);
                        } else {
                            Log.e("ERROR", task.getException().toString());
                            Toast.makeText(signin.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();

                        }
                    }
                });

    }


}
