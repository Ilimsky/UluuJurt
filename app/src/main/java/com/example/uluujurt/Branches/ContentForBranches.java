package com.example.uluujurt.Branches;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.uluujurt.R;
import com.example.uluujurt.YoutubeConfig;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class ContentForBranches extends YouTubeBaseActivity {

    TextView v_tag, v_title, v_content;

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_for_talk_show);

        Intent intent = getIntent();

        final int index = intent.getIntExtra("index",0);
        final String intentTag = intent.getStringExtra("tag");
        final String intentTitle = intent.getStringExtra("title");
        final String intentContent = intent.getStringExtra("content");
        final String intentURL = intent.getStringExtra("url");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setAlpha(0.25f);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, intentURL);
                startActivity(Intent.createChooser(shareIntent, "Поделиться..."));
            }
        });



        v_tag = (TextView) findViewById(R.id.v_tags);
        v_title = (TextView) findViewById(R.id.v_title);
        v_content = (TextView) findViewById(R.id.v_content);

        v_tag.setText(intentTag);
        v_title.setText(intentTitle);
        v_content.setText(intentContent);

        v_content.setMovementMethod(new ScrollingMovementMethod());

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlay);

        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videoList = new ArrayList<String>();
                videoList.add("eGGMqEhiNM8");
                videoList.add("0H8f9EfylFU");
                videoList.add("ncNNQPEM3s4");
                videoList.add("-bm5IZ2Fg8c");
                videoList.add("Lu_ndka-Kr0");
                videoList.add("Ukr-2jPP2b4");
                videoList.add("9IcWCoBhA6Q");
                videoList.add("YjN7kiPNBE8");
                videoList.add("HsPZhEjhqjs");
                videoList.add("TJ2Eg8M6oN4");
                youTubePlayer.loadVideo(videoList.get(index));
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
            }
        };

        youTubePlayerView.initialize(YoutubeConfig.getApiKey(), listener);
    }
}
