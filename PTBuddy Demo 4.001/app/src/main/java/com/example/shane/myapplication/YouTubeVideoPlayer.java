package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeVideoPlayer extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyBa0Vh37US7tpaJKpHV_RK_a3he7VX_Hxg";
    /*
    The video id is the youtube video id needed to play the desired video. We
    Will more than likely need to create an array string the reps each body and
    access them in that matter.
     */
    public static final String VIDEO_ID = "dDI8ClxRS04";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_player);

        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);

        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
                                             public void onClick(View v_2) {
                                                 Intent returnIntent_2 = new Intent(getApplicationContext(), PTBuddy.class);
                                                 returnIntent_2.putExtra("com.example.shane.myapplication.PTBuddy", "");
                                                 returnIntent_2.setFlags(returnIntent_2.getFlags() | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                                                 startActivity(returnIntent_2);
                                             }
                                         });

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }


    @Override
    public void onBackPressed() {
                Intent returnIntent_1 = new Intent(getApplicationContext(), smiley.class);
                returnIntent_1.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent_1.setFlags(returnIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent_1);
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();
    }
    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
        /* Start buffering **/
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }
    }
    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };
    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }

        @Override
        public void onError(ErrorReason arg0) {
        }

        @Override
        public void onLoaded(String arg0) {
        }

        @Override
        public void onLoading() {
        }

        @Override
        public void onVideoEnded() {
        }

        @Override
        public void onVideoStarted() {
        }
    };
}