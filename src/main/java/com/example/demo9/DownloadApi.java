package com.example.demo9;

import javafx.scene.control.ProgressBar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadApi {

    public static class MyThread extends Thread {
        String url, out_name;
        ProgressBar bar;
        MyThread(String url, String out_name, ProgressBar bar){
            this.url = url;
            this.out_name = out_name;
            this.bar = bar;
        }
        @Override
        public void run() {
            try{
                URL website = new URL(url);
                ReadableByteChannel rbc = Channels.newChannel(website.openStream());
                FileOutputStream fos = new FileOutputStream(out_name);
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            for (int i = 0; i <= 500; i++) {
                bar.setProgress(bar.getProgress()+0.1);
                try {
                    sleep(25);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static MyThread download(String url, String out_name, ProgressBar bar){
        MyThread thread = new MyThread(url, out_name, bar);
        thread.start();
        return thread;
    }
}
