package com.alldi.a20190414_firsthomework_jinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox agreementCkBx;
    CheckBox agreementCkBx1;
    CheckBox agreementCkBx2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agreementCkBx = findViewById(R.id.agreementCkBx);
        agreementCkBx1 = findViewById(R.id.agreementCkBx1);
        agreementCkBx2 = findViewById(R.id.agreementCkBx2);

        String text = "<font color = 'black'>서비스 이용약관</font><font color = '#7848d5'>(필수)</font>";
        String text1 = "<font color = 'black'>개인정보처리방침</font><font color = '#7848d5'>(필수)</font>";
        String text2 = "<font color = 'black'>유료상품 이용약관</font><font color = '#7848d5'>(필수)</font>";

        agreementCkBx.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);
        agreementCkBx1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);
        agreementCkBx2.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);
    }
}
