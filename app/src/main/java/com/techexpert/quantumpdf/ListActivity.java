package com.techexpert.quantumpdf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.pdftron.pdf.config.ViewerConfig;
import com.pdftron.pdf.controls.DocumentActivity;

import java.io.File;
import java.io.IOException;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        MobileAds.initialize(this, initializationStatus -> {
        });
        AdView mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ListView pdfListView = findViewById(R.id.list_View);

        String getItem = getIntent().getStringExtra("FileName");

        if(getItem.equals("DBMS"))
        {
            final String[] pdfFiles ={"DBMS-Part-1","DBMS-Part-2","DBMS-Part-3","DBMS-Part-4","DBMS-Part-5"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
                @NonNull
                @Override
                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                    return super.getView(position, convertView, parent);
                }
            };

            pdfListView.setAdapter(adapter);

            pdfListView.setOnItemClickListener((parent, view, i, id) ->
            {

                String item = pdfListView.getItemAtPosition(i).toString();

                if (item.equals("DBMS-Part-1"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"dbms-part-1.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/unit%201%20dbms_compressed.pdf?alt=media&token=adc53376-afc3-4f96-848a-85d899f2c194","dbms-part-1.pdf");
                    }
                }
                else if (item.equals("DBMS-Part-2"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"dbms-part-2.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/unit%202%20dbms_compressed.pdf?alt=media&token=1530f8c2-dbaa-44fc-b49b-5f1db5f320b2","dbms-part-2.pdf");
                    }

                }
                else if (item.equals("DBMS-Part-3"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"dbms-part-3.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/unit%203%20dbms_compressed.pdf?alt=media&token=5060a0f9-82d9-4283-9144-f834153d1fa3","dbms-part-3.pdf");
                    }
                }
                else if (item.equals("DBMS-Part-4"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"dbms-part-4.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/unit%204%20dbms_compressed.pdf?alt=media&token=8b73d26b-12b9-4553-8aa4-7c48a86b0528","dbms-part-4.pdf");
                    }
                }
                else if (item.equals("DBMS-Part-5"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"dbms-part-5.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/unit%205%20dbms_compressed.pdf?alt=media&token=546710a8-6cce-40a2-878b-c280ace773dd","dbms-part-5.pdf");
                    }
                }

            });

       }

        else if(getItem.equals("DAA"))
        {
            final String[] pdfFiles ={"DAA-Part-1","DAA-Part-2","DAA-Part-3","DAA-Part-4","DAA-Part-5"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
                @NonNull
                @Override
                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                    return super.getView(position, convertView, parent);
                }
            };

            pdfListView.setAdapter(adapter);

            pdfListView.setOnItemClickListener((parent, view, i, id) -> {

                String item = pdfListView.getItemAtPosition(i).toString();

                if (item.equals("DAA-Part-1"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"daa-part-1.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/daa%20part%201.pdf?alt=media&token=36df90f4-b02e-4563-a4b2-66412611b078","daa-part-1.pdf");
                    }
                }
                else if (item.equals("DAA-Part-2"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"daa-part-2.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/daa%20part%202.pdf?alt=media&token=5b1924a9-84b7-410e-b1f9-1833e22585ea","daa-part-2.pdf");
                    }
                }
                else if (item.equals("DAA-Part-3"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"daa-part-3.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/daa%20part%203.pdf?alt=media&token=213bad52-363f-4f76-9a04-31f292b08676","daa-part-3.pdf");
                    }
                }
                else if (item.equals("DAA-Part-4"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"daa-part-4.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/daa%20part%204.pdf?alt=media&token=412ebc87-85a5-4d45-9f86-3d171e9469bd","daa-part-4.pdf");
                    }
                }
                else if (item.equals("DAA-Part-5"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"daa-part-5.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/daa%20part%205.pdf?alt=media&token=5ba984aa-e1ce-49b3-abc8-b864a475d68a","daa-part-5.pdf");
                    }
                }

            });

        }
        else if(getItem.equals("CD"))
        {
            final String[] pdfFiles ={"Compiler Design-Part-1","Compiler Design-Part-2","Compiler Design-Part-3","Compiler Design-Part-4","Compiler Design-Part-5"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
                @NonNull
                @Override
                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                    return super.getView(position, convertView, parent);
                }
            };

            pdfListView.setAdapter(adapter);

            pdfListView.setOnItemClickListener((parent, view, i, id) -> {

                String item = pdfListView.getItemAtPosition(i).toString();

                if (item.equals("Compiler Design-Part-1"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"cd-part-1.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/CD%20part%201.pdf?alt=media&token=ae2b75fd-c9ba-4a50-84ce-57db6bc45779","cd-part-1.pdf");
                    }
                }
                else if (item.equals("Compiler Design-Part-5"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"cd-part-5.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/Cd%20part%205.pdf?alt=media&token=d6771ee6-43d7-438d-9181-d042339bc6d5","cd-part-5.pdf");
                    }
                }
                else if (item.equals("Compiler Design-Part-2"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"cd-part-2.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/Cd%20part%202.pdf?alt=media&token=54b9ce26-10b7-402d-8b51-85594010452e","cd-part-2.pdf");
                    }
                }
                else if (item.equals("Compiler Design-Part-3"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"cd-part-3.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/Cd%20part%203.pdf?alt=media&token=b309985d-edfb-400f-8066-a6733314fefd","cd-part-3.pdf");
                    }
                }
                else if (item.equals("Compiler Design-Part-4"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"cd-part-4.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/Cd%20part%204.pdf?alt=media&token=165f68c5-6922-4015-af90-683451bbcbdc","cd-part-4.pdf");
                    }
                }

            });

        }
        else if(getItem.equals("ML"))
        {
            final String[] pdfFiles ={"Machine Learning-Part-1","Machine Learning-Part-2","Machine Learning-Part-3","Machine Learning-Part-4","Machine Learning-Part-5"};

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
                @NonNull
                @Override
                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                    return super.getView(position, convertView, parent);
                }
            };

            pdfListView.setAdapter(adapter);

            pdfListView.setOnItemClickListener((parent, view, i, id) -> {


                String item = pdfListView.getItemAtPosition(i).toString();

//                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
//                start.putExtra("pdfFileName",item);
//                startActivity(start);

                if(item.equals("Machine Learning-Part-1"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"ml part-1.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/ml%20part%201.pdf?alt=media&token=beb5e7a2-91b0-4a84-9c72-9b66126145a1","ml part-1.pdf");
                    }
                }
                else if (item.equals("Machine Learning-Part-2"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"ml part-2.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/ml%20part%202.pdf?alt=media&token=38d2a5ca-56bf-4c4b-b2aa-e40275fc756b","ml part-2.pdf");
                    }
                }
                else if (item.equals("Machine Learning-Part-3"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"ml part-3.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/ml%20part%203.pdf?alt=media&token=afa50f5b-f78f-415b-a2e0-b529d836458b","ml part-3.pdf");
                    }
                }
                else if (item.equals("Machine Learning-Part-4"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"ml part-4.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/ml%20part%204.pdf?alt=media&token=be5acb5f-d368-480c-8bca-192c5e224c38","ml part-4.pdf");
                    }
                }
                else if (item.equals("Machine Learning-Part-5"))
                {
                    File pdfFile = new File(Environment.getExternalStorageDirectory()+"/PDF DOWNLOAD/"+"ml part-5.pdf");
                    if(pdfFile.exists())
                    {
                        OpenUsingFile(pdfFile);
                    }
                    else
                    {
                        OpenUsingUri("https://firebasestorage.googleapis.com/v0/b/food-ui-a6125.appspot.com/o/ml%20part%205.pdf?alt=media&token=bacadaf6-12c3-4ed4-959c-38828425655c","ml part-5.pdf");
                    }
                }
            });

        }

    }

    private void OpenUsingFile(File pdfFile)
    {
        Toast.makeText(this, "Loading...Please wait", Toast.LENGTH_SHORT).show();

        ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).build();
        final Uri uri = Uri.fromFile(new File(String.valueOf(pdfFile)));
        Intent intent = DocumentActivity.IntentBuilder.fromActivityClass(this, DocumentActivity.class)
                .withUri(uri)
                .usingConfig(config)
                .usingTheme(R.style.PDFTronAppTheme)
                .build();
        startActivity(intent);
    }

    private void OpenUsingUri(String link, String name)
    {
        Toast.makeText(this, "Downloading File...Please wait", Toast.LENGTH_LONG).show();

      //  ViewerConfig config = new ViewerConfig.Builder().openUrlCachePath(this.getCacheDir().getAbsolutePath()).build();

        Intent intent = new Intent(this,PDFOpener.class);
        intent.putExtra("uri",link);
        startActivity(intent);
//
//                final Uri uri = Uri.parse(link);
//        Intent intent = DocumentActivity.IntentBuilder.fromActivityClass(this, DocumentActivity.class)
//                .withUri(uri)
//                .usingConfig(config)
//                .usingTheme(R.style.PDFTronAppTheme)
//                .build();
//        startActivity(intent);


        new Thread(() -> {
            // do background stuff here

            String externalStorage = Environment.getExternalStorageDirectory().toString();

            File folder = new File(externalStorage,"PDF DOWNLOAD");
            if(!folder.exists())
            {
                folder.mkdir();
            }
            File pdfFile = new File(folder,name);

            if(!pdfFile.exists())
            {
                try {
                    pdfFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                FileDownloader.downloadFile(link, pdfFile);
            }


            runOnUiThread(()->{
                // OnPostExecute stuff here
            });
        }).start();

//        new DownloadPDF()
//                .execute(link,name);
    }
}