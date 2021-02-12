package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } mTvAnswer = findViewById(R.id.tv_answer);
    mEdtFnum = findViewById(R.id.edt_fnum);
    mEdtSnum = findViewById(R.id.edt_snum);
    mBtnAdd = findViewById(R.id.btn_add);
    mBtnSubtract = findViewById(R.id.btn_subtract);
    mBtnDivide = findViewById(R.id.btn_divide);
    mBtnMultiply = findViewById(R.id.btn_multiply);
    mBtnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strFnum, strSnum;
            Double first_number, second_number;
            strFnum = mEdtFnum.getText().toString().trim();
            strSnum = mEdtSnum.getText().toString().trim();
            if (strFnum.isEmpty()){
                mEdtFnum.setError("Please fill this field");
                mEdtFnum.requestFocus();
            }else if (strSnum.isEmpty()){
                mEdtSnum.setError("Please fill this field");
                mEdtSnum.requestFocus();
}