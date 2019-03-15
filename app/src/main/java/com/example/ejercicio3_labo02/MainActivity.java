package com.example.ejercicio3_labo02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout buttonPanel_01;
    LinearLayout buttonPanel_02;
    LinearLayout buttonPanel_03;

    int panel_button_1=1;
    int panel_button_2=1;
    int panel_button_3=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPanel_01=(LinearLayout)findViewById(R.id.buttonPanel_01);
        buttonPanel_02=(LinearLayout)findViewById(R.id.buttonPanel_02);
        buttonPanel_03=(LinearLayout)findViewById(R.id.buttonPanel_03);

        buttonPanel_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(panel_button_1==0){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color));
                    panel_button_1=1;
                }
                else if(panel_button_1==1){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color02));
                    panel_button_1=2;
                }
                else if(panel_button_1==2){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color03));
                    panel_button_1=3;
                }
                else if(panel_button_1==3){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color04));
                    panel_button_1=4;
                }
                else if(panel_button_1==4){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color05));
                    panel_button_1=5;
                }
                else if(panel_button_1==5){
                    buttonPanel_01.setBackgroundColor(getResources().getColor(R.color.panel01_color06));
                    panel_button_1=0;
                }
            }
        });

        buttonPanel_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(panel_button_2==0){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel02_color));
                    panel_button_2=1;
                }
                else if(panel_button_2==1){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel02_color02));
                    panel_button_2=2;
                }
                else if(panel_button_2==2){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel01_color03));
                    panel_button_2=3;
                }
                else if(panel_button_2==3){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel02_color04));
                    panel_button_2=4;
                }
                else if(panel_button_2==4){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel02_color05));
                    panel_button_2=5;
                }
                else if(panel_button_2==5){
                    buttonPanel_02.setBackgroundColor(getResources().getColor(R.color.panel02_color06));
                    panel_button_2=0;
                }
            }
        });

        buttonPanel_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(panel_button_3==0){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color));
                    panel_button_3=1;
                }
                else if(panel_button_3==1){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color02));
                    panel_button_3=2;
                }
                else if(panel_button_3==2){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color03));
                    panel_button_3=3;
                }
                else if(panel_button_3==3){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color04));
                    panel_button_3=4;
                }
                else if(panel_button_3==4){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color05));
                    panel_button_3=5;
                }
                else if(panel_button_3==5){
                    buttonPanel_03.setBackgroundColor(getResources().getColor(R.color.panel03_color06));
                    panel_button_3=0;
                }
            }
        });

    }
}

