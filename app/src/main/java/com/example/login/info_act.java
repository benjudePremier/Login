package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class info_act extends AppCompatActivity {
    private VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Aqui llamo el elemento por id
        videoview = (VideoView) findViewById(R.id.vd);

        videoview.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v1)); // ruta del video
        // control de la navigacion
        MediaController media = new MediaController(this);
        videoview.setMediaController(media);
        videoview.start();
    }


}






