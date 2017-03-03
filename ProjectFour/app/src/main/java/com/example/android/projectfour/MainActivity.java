package com.example.android.projectfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchSetOnClickListener();
    }

    //set onClickListener for each View
    private void launchSetOnClickListener() {
        //click banner
        ImageView bannerSingle = (ImageView) findViewById(R.id.banner_single);
        bannerSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 1;
                onClickEvent();
            }
        });

        //click avatar 王菲
        ImageView avatarWF = (ImageView) findViewById(R.id.avatar_wf);
        avatarWF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 2;
                onClickEvent();
            }
        });

        //click avatar 陈奕迅
        ImageView avatarCYX = (ImageView) findViewById(R.id.avatar_cyx);
        avatarCYX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 3;
                onClickEvent();
            }
        });

        //click avatar 周杰伦
        ImageView avatarZJL = (ImageView) findViewById(R.id.avatar_zjl);
        avatarZJL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 4;
                onClickEvent();
            }
        });

        //click album 周杰伦《十二新作》
        ImageView albumZjl12 = (ImageView) findViewById(R.id.album_zjl_12);
        albumZjl12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 5;
                onClickEvent();
            }
        });

        //click album 周杰伦《跨时代》
        ImageView albumZjlKsd = (ImageView) findViewById(R.id.album_zjl_ksd);
        albumZjlKsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 6;
                onClickEvent();
            }
        });

        //click album 陈奕迅《认了吧》
        ImageView albumCyxRlb = (ImageView) findViewById(R.id.album_cyx_rlb);
        albumCyxRlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 7;
                onClickEvent();
            }
        });

        //click album 陈奕迅《不想放手》
        ImageView albumCyxBxfs = (ImageView) findViewById(R.id.album_cyx_bxfs);
        albumCyxBxfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 8;
                onClickEvent();
            }
        });

        //click album 王菲《致青春》
        ImageView albumWfZqc = (ImageView) findViewById(R.id.album_wf_zqc);
        albumWfZqc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 9;
                onClickEvent();
            }
        });

        //click album 王菲《菲常传奇》
        ImageView albumWfFccq = (ImageView) findViewById(R.id.album_wf_fccq);
        albumWfFccq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleActivity.clickType = 10;
                onClickEvent();
            }
        });
    }

    //onClickEvent for setOnClickListener
    private void onClickEvent() {
        Intent openSingle = new Intent(MainActivity.this, SingleActivity.class);
        startActivity(openSingle);
    }
}