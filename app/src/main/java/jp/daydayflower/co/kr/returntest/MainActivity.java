package jp.daydayflower.co.kr.returntest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        private Animation fab_open, fab_close;
        private Boolean isFabOpen = false;
        private FloatingActionButton fab, fab1, fab2, fab3;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
            fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);

            fab = (FloatingActionButton) findViewById(R.id.fab);
            fab1 = (FloatingActionButton) findViewById(R.id.fab1);
            fab2 = (FloatingActionButton) findViewById(R.id.fab2);
            fab3 = (FloatingActionButton) findViewById(R.id.fab3);

            fab.setOnClickListener(this);
            fab1.setOnClickListener(this);
            fab2.setOnClickListener(this);
            fab3.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id) {
                case R.id.fab:
                    anim();
                    Toast.makeText(this, "Floating Action Button", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab1:
                    anim();
                    Toast.makeText(this, "Button1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.fab2:
                    anim();
                    Toast.makeText(this, "Button2", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.fab3:
                    anim();
                    Toast.makeText(this, "Button3", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        public void anim() {
            if (isFabOpen) {
                fab1.startAnimation(fab_close);
                fab2.startAnimation(fab_close);
                fab3.startAnimation(fab_close);

                fab1.setClickable(false);
                fab2.setClickable(false);
                fab3.setClickable(false);
                isFabOpen = false;
            } else {
                fab1.startAnimation(fab_open);
                fab2.startAnimation(fab_open);
                fab3.startAnimation(fab_open);

                fab1.setClickable(true);
                fab2.setClickable(true);
                fab3.setClickable(true);
                isFabOpen = true;
            }
        }
     }
