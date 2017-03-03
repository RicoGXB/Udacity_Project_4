package com.example.android.projectfour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayingTrackActivity extends AppCompatActivity {

    static int clickType = 1; //decide which track to show.
    private Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_track);
        decideChickType();
        launchOnClickListenerPlay();
        launchOnclickListenerForward();
        launchOnclickListenerBackward();
    }

    /**
     * This method decide which track to show.
     */
    private void decideChickType() {
        switch (clickType) {
            case 1:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_cyx_bxfs);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music1_cyx_bysh);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album1_cyx_bxfs);
                break;
            case 2:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_cyx_bxfs);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music2_cyx_djdw);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album1_cyx_bxfs);
                break;
            case 3:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_cyx_rlb);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music3_cyx_yw);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album2_cyx_rlb);
                break;
            case 4:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_cyx_rlb);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music4_cyx_tt);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album2_cyx_rlb);
                break;
            case 5:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_wf_fccq);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music5_wf_am);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album3_wf_fccq);
                break;
            case 6:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_wf_fccq);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music6_wf_yd);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album3_wf_fccq);
                break;
            case 7:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_wf_fccq);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music7_wf_wyy);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album3_wf_fccq);
                break;
            case 8:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_wf_zqc);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music8_wf_zqc);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album4_wf_zqc);
                break;
            case 9:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_zjl_ksd);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music9_zjl_hjbj);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album5_zjl_ksd);
                break;
            case 10:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_zjl_mj);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music10_zjl_hh);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album6_zjl_mjz);
                break;
            case 11:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_zjl_sexz);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music11_zjl_sy);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album7_zjl_sexz);
                break;
            case 12:
                ((ImageView) findViewById(R.id.playing_track_single_pic)).setImageResource(R.drawable.album_zjl_sexz);
                ((TextView) findViewById(R.id.playing_track_single_name)).setText(R.string.single_list_music12_zjl_mmj);
                ((TextView) findViewById(R.id.playing_track_single_info)).setText(R.string.single_list_album7_zjl_sexz);
                break;
        }
    }

    /**
     * This method set onClickListener for play or pause.
     */
    private void launchOnClickListenerPlay() {
        final ImageView play = (ImageView) findViewById(R.id.playing_track_icon_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag = (String) play.getTag();

                // whether the icon is play or not,Switches play and pause tag.
                if (tag.equals(getString(R.string.res_id_icon_play))) {
                    play.setImageResource(R.drawable.icon_pause);
                    play.setTag(getString(R.string.res_id_icon_pause));
                } else {
                    play.setImageResource(R.drawable.icon_play);
                    play.setTag(getString(R.string.res_id_icon_play));
                }
            }
        });
    }

    /**
     * This method set onClickListener for forward.
     */
    private void launchOnclickListenerForward() {
        ImageView forward = (ImageView) findViewById(R.id.playing_track_icon_forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickType < 12) {
                    clickType += 1;
                    decideChickType();
                } else if (toast != null) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), R.string.the_end, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    toast = Toast.makeText(getApplicationContext(), R.string.the_end, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    /**
     * This method set onClickListener for backward.
     */
    private void launchOnclickListenerBackward() {
        ImageView backward = (ImageView) findViewById(R.id.playing_track_icon_backward);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickType > 1) {
                    clickType -= 1;
                    decideChickType();
                } else if (toast != null) {
                    toast.cancel();
                    toast = Toast.makeText(getApplicationContext(), R.string.the_begin, Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    toast = Toast.makeText(getApplicationContext(), R.string.the_begin, Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

}
