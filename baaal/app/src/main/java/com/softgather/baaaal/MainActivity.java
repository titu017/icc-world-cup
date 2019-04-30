package com.softgather.baaaal;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button openBtn;
    Dialog myDialog1;
    TextView textView;
    Button closeBtn;

    Dialog myDialog2;
    TextView textView2;
    Button openBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openBtn = findViewById(R.id.openBtn);
        myDialog1 = new Dialog(this);

        openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        myDialog2= new Dialog(this);
        openBtn2 = findViewById(R.id.openBtn2);

        openBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog2();
            }
        });
    }

    private void showDialog2() {
        myDialog2.setContentView(R.layout.dialogbox2);
        textView = (TextView) myDialog2.findViewById(R.id.textView2Id);


//        closeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myDialog.dismiss();
//            }
//        });
        myDialog2.show();
    }

    private void showDialog() {
        myDialog1.setContentView(R.layout.dialogbox);
        textView = (TextView) myDialog1.findViewById(R.id.textViewId);
        closeBtn = (Button) myDialog1.findViewById(R.id.closeBtn);

//        closeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myDialog.dismiss();
//            }
//        });
        myDialog1.show();

    }

}
