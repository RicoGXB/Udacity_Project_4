package com.example.android.projectfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SingleActivity extends AppCompatActivity {

    static int clickType = 1; //decide which single song list to show

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        decideChickType(clickType);
        launchOnClickListener();
    }

    /**
     * This method decide which single songs list to show.
     *
     * @param clickType is where the click from.
     */
    private void decideChickType(int clickType) {

        switch (clickType) {
            //show all single songs
            case 1:
                findViewById(R.id.single_list_1).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_2).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_3).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_4).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_5).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_6).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_7).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_8).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_9).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_10).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_11).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_12).setVisibility(View.VISIBLE);
                break;

            //show all 王菲 single songs
            case 2:
                findViewById(R.id.single_list_5).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_6).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_7).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_8).setVisibility(View.VISIBLE);
                break;

            //show all 陈奕迅 single songs
            case 3:
                findViewById(R.id.single_list_1).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_2).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_3).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_4).setVisibility(View.VISIBLE);
                break;

            //show all 周杰伦 single songs
            case 4:
                findViewById(R.id.single_list_9).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_10).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_11).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_12).setVisibility(View.VISIBLE);
                break;

            //show all 《十二新作》 single songs
            case 5:
                findViewById(R.id.single_list_11).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_12).setVisibility(View.VISIBLE);
                break;

            //show all 《跨时代》 single songs
            case 6:
                findViewById(R.id.single_list_9).setVisibility(View.VISIBLE);
                break;

            //show all 《认了吧》 single songs
            case 7:
                findViewById(R.id.single_list_3).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_4).setVisibility(View.VISIBLE);
                break;

            //show all 《不想放手》 single songs
            case 8:
                findViewById(R.id.single_list_1).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_2).setVisibility(View.VISIBLE);
                break;

            //show all 《致青春》 single songs
            case 9:
                findViewById(R.id.single_list_8).setVisibility(View.VISIBLE);
                break;

            //show all 《菲常传奇》 single songs
            case 10:
                findViewById(R.id.single_list_5).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_6).setVisibility(View.VISIBLE);
                findViewById(R.id.single_list_7).setVisibility(View.VISIBLE);
                break;
        }
    }

    /**
     * This method set onClickListener for each single song
     */
    private void launchOnClickListener() {
        View singleList1 = findViewById(R.id.single_list_1);
        singleList1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 1;
                onClickEvent();
            }
        });

        View singleList2 = findViewById(R.id.single_list_2);
        singleList2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 2;
                onClickEvent();
            }
        });

        View singleList3 = findViewById(R.id.single_list_3);
        singleList3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 3;
                onClickEvent();
            }
        });

        View singleList4 = findViewById(R.id.single_list_4);
        singleList4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 4;
                onClickEvent();
            }
        });

        View singleList5 = findViewById(R.id.single_list_5);
        singleList5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 5;
                onClickEvent();
            }
        });

        View singleList6 = findViewById(R.id.single_list_6);
        singleList6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 6;
                onClickEvent();
            }
        });

        View singleList7 = findViewById(R.id.single_list_7);
        singleList7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 7;
                onClickEvent();
            }
        });

        View singleList8 = findViewById(R.id.single_list_8);
        singleList8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 8;
                onClickEvent();
            }
        });

        View singleList9 = findViewById(R.id.single_list_9);
        singleList9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 9;
                onClickEvent();
            }
        });

        View singleList10 = findViewById(R.id.single_list_10);
        singleList10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 10;
                onClickEvent();
            }
        });

        View singleList11 = findViewById(R.id.single_list_11);
        singleList11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 11;
                onClickEvent();
            }
        });

        View singleList12 = findViewById(R.id.single_list_12);
        singleList12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayingTrackActivity.clickType = 12;
                onClickEvent();
            }
        });
    }

    /**
     * The event after user clicks the sing song.
     */
    private void onClickEvent() {
        Intent openPlayingTrack = new Intent(SingleActivity.this, PlayingTrackActivity.class);
        startActivity(openPlayingTrack);
    }

}
