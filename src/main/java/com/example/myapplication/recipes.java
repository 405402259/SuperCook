package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class recipes extends AppCompatActivity {

    ArrayAdapter<String> fileDBAdapter;
    private FirebaseApp myfirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipes);

        FirebaseApp.getApps(getApplicationContext());
        FirebaseDatabase fireDB = FirebaseDatabase.getInstance();

        final ImageView image = (ImageView) findViewById(R.id.ig_recipes);
        final TextView Rname = (TextView) findViewById(R.id.tv_recipe);
        final TextView Rpublisher = (TextView) findViewById(R.id.tv_name);
        final TextView Rscore = (TextView) findViewById(R.id.tv_score);
        final TextView Rneedfood = (TextView) findViewById(R.id.tv_needfood);
        final TextView Rpeople = (TextView) findViewById(R.id.tv_people);
        final TextView Rtaste = (TextView) findViewById(R.id.tv_taste);
        final TextView Rtime = (TextView) findViewById(R.id.tv_time);
        final TextView Rtool = (TextView) findViewById(R.id.tv_needtool);
        final TextView Rtopic = (TextView) findViewById(R.id.tv_topic);
        final TextView Rtype = (TextView) findViewById(R.id.tv_type);

        //讀取圖片
        DatabaseReference myRef = fireDB.getReference("recipe/1/picture");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                String uriString = dataSnapshot.getValue().toString();
                Uri uri = Uri.parse(uriString);
               // image = image.setImageURI(uri);
/*
                StorageReference httpsReference = FirebaseStorage.getInstance().getReferenceFromUrl(url);
                Glide.with(this)
                        .using(new FirebaseImageLoader())
                        .load(httpsReference)
                        .into(image);

*/
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


      /*StorageReference storageRef = FirebaseStorage.getInstance().getReference(url);



      storageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                // Got the download URL for 'users/me/profile.png'
                Rname.setText(uri.toString());
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                // Handle any errors
            }
        });
      */
/*
    StorageReference httpsReference = FirebaseStorage.getInstance().getReferenceFromUrl(url);
      Glide.with(this)
                .using(new FirebaseImageLoader())
                .load(httpsReference)
                .into(image);
*/

        //讀取資料
        //DatabaseReference
        myRef = fireDB.getReference("recipe/1/recipeName");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rname.setText(mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rname.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/publisher");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rpublisher.setText(mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rpublisher.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/hard");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rscore.setText("難易度：" + mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rscore.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/ingredient");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rneedfood.setText(mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rscore.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/people");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rpeople.setText(mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rscore.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/taste");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rtaste.setText("口味：" + mychildtext + "  ");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rtaste.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/time");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rtime.setText("所需時間: " + mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rtime.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/tool");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rtool.setText(mychildtext);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rtool.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/topic");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rtopic.setText("主題：" + mychildtext + "  ");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rtopic.setText("Not found");
            }
        });

        myRef = fireDB.getReference("recipe/1/type");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String mychildtext = dataSnapshot.getValue(String.class);
                Rtype.setText("菜式：" + mychildtext + "  ");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Rtype.setText("Not found");
            }
        });

        ListView listView = (ListView) findViewById(R.id.tv_way);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1);
        listView.setAdapter(adapter);

        DatabaseReference reference_contacts = FirebaseDatabase.getInstance().getReference("recipe/1/step");
        reference_contacts.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                adapter.clear();
                int i=(int) dataSnapshot.getChildrenCount();
                for(int j=1;j<=i;j++) {
                    String x = "step" + String.valueOf(j);
                    adapter.add(dataSnapshot.child(x).getValue().toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


    /*
        public String f(TextView nf){
        String f="";
        String[] nf2=needfood.toString().split( "," );
        for (int i=0;i<nf2.length;i++){
            String[] fn=nf2[i].split( " " );
            int n=Integer.valueOf(people.toString());
            nf2[i]=fn[0]+" "+String.valueOf(n*1.0/Integer.valueOf(fn[1]));
            f+=nf2[i];
        }
        return f;
    }
    */


