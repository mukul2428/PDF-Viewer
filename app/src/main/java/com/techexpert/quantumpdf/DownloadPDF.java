package com.techexpert.quantumpdf;

import android.os.AsyncTask;
import android.os.Environment;

import java.io.File;
import java.io.IOException;

public class DownloadPDF extends AsyncTask<String, Void, Void>
{
    @Override
    protected Void doInBackground(String... strings) {

        String fileUrl = strings[0];
        String fileName = strings[1];

        String externalStorage = Environment.getExternalStorageDirectory().toString();

        File folder = new File(externalStorage,"PDF DOWNLOAD");
        if(!folder.exists())
        {
            folder.mkdir();
        }
        File pdfFile = new File(folder,fileName);

        if(!pdfFile.exists())
        {
            try {
                pdfFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
        }
        return null;

    }
}
