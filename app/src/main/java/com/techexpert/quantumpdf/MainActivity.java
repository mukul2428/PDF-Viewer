package com.techexpert.quantumpdf;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, initializationStatus -> {
        });
        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button btn1 = findViewById(R.id.but1);
        Button btn2 = findViewById(R.id.but2);
        btn3 = findViewById(R.id.but3);
        btn4 = findViewById(R.id.but4);

        btn1.setOnClickListener(view -> {

            Intent i = new Intent (this, ListActivity.class);
            String name = "CD";
            i.putExtra("FileName", name);
            startActivity(i);

        });
        btn2.setOnClickListener(view -> {

            Intent i = new Intent (this, ListActivity.class);
            String name = "DBMS";
            i.putExtra("FileName", name);
            startActivity(i);

        });
        btn3.setOnClickListener(view -> {

            Intent i = new Intent (this, ListActivity.class);
            String name = "DAA";
            i.putExtra("FileName", name);
            startActivity(i);

        });
        btn4.setOnClickListener(view -> {

            Intent i = new Intent (this, ListActivity.class);
            String name = "ML";
            i.putExtra("FileName", name);
            startActivity(i);


        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        checkPermission();
    }

    public void checkPermission()
    {

        PermissionListener permissionListener = new PermissionListener() {
            @Override
            public void onPermissionGranted()
            {

            }

            @Override
            public void onPermissionDenied(List<String> deniedPermissions) {

            }
        };

        TedPermission.with(MainActivity.this)
                .setPermissionListener(permissionListener)
                .setPermissions(Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .check();
    }

}