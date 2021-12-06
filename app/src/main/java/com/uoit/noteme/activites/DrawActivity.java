package com.uoit.noteme.activites;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.uoit.noteme.R;

public class DrawActivity extends AppCompatActivity {

    FrameLayout bottomSheet;
    Button circle, square, line, diamond;
    Canvas canvas;
    BottomSheetBehavior mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        CustomView customView = new CustomView(this);

        circle  = findViewById(R.id.circle);
        square = findViewById(R.id.rect);
        diamond = findViewById(R.id.diamond);
        line = findViewById(R.id.line);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }
}