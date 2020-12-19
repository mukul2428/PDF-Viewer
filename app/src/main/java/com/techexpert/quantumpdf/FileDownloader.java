package com.techexpert.quantumpdf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader {

    private static final int MEGABYTE = 1024*1024;

    public static void downloadFile(String fileUrl, File directory)
    {
        try{
            URL url = new URL(fileUrl);
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();



            FileOutputStream fileOutputStream = new FileOutputStream(directory);

            byte[] buffer = new byte[MEGABYTE];
            int bufferLength = 0;

            while((bufferLength = inputStream.read(buffer)) > 0)
            {
                fileOutputStream.write(buffer,0,bufferLength);
            }
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
