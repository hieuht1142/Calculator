package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCE, btnC, btnBS, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
            btnSeven, btnEight, btnNine, btnAdd, btnSub, btnMul, btnDiv, btnNeg, btnDec, btnEql;
    TextView txtView, txtInput;
    boolean add = false, sub = false, mul = false, div = false;
    int val1;
    int val2;
    int rs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCE = findViewById(R.id.btn_ce);
        btnC = findViewById(R.id.btn_c);
        btnBS = findViewById(R.id.btn_bs);
        btnZero = findViewById(R.id.btn_0);
        btnOne = findViewById(R.id.btn_1);
        btnTwo = findViewById(R.id.btn_2);
        btnThree = findViewById(R.id.btn_3);
        btnFour = findViewById(R.id.btn_4);
        btnFive = findViewById(R.id.btn_5);
        btnSix = findViewById(R.id.btn_6);
        btnSeven = findViewById(R.id.btn_7);
        btnEight = findViewById(R.id.btn_8);
        btnNine = findViewById(R.id.btn_9);
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnNeg = findViewById(R.id.btn_neg);
        btnDec = findViewById(R.id.btn_dec);
        btnEql = findViewById(R.id.btn_eql);
        txtView = findViewById(R.id.txt_view);
        txtInput = findViewById(R.id.txt_input);

        btnCE.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnNeg.setOnClickListener(this);
        btnDec.setOnClickListener(this);
        btnEql.setOnClickListener(this);

        // Set font for txtInput and txtView
        Typeface typeface = Typeface.createFromAsset(getAssets(), "digital-7.ttf");
        txtInput.setTypeface(typeface);
        txtView.setTypeface(typeface);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String input = txtInput.getText().toString();
        String view = txtView.getText().toString();
        int ip = Integer.parseInt(input);

        if (id == btnZero.getId()) {
            if (!input.equals("0")) {
                input = input + "0";
            }
            txtInput.setText(input);
        } else if (id == btnOne.getId()) {
            if (input.equals("0")) {
                input = "1";
            } else {
                input = input + "1";
            }
            txtInput.setText(input);

        } else if (id == btnTwo.getId()) {
            if (input.equals("0")) {
                input = "2";
            } else {
                input = input + "2";
            }
            txtInput.setText(input);

        } else if (id == btnThree.getId()) {
            if (input.equals("0")) {
                input = "3";
            } else {
                input = input + "3";
            }
            txtInput.setText(input);

        } else if (id == btnFour.getId()) {
            if (input.equals("0")) {
                input = "4";
            } else {
                input = input + "4";
            }
            txtInput.setText(input);

        } else if (id == btnFive.getId()) {
            if (input.equals("0")) {
                input = "5";
            } else {
                input = input + "5";
            }
            txtInput.setText(input);

        } else if (id == btnSix.getId()) {
            if (input.equals("0")) {
                input = "6";
            } else {
                input = input + "6";
            }
            txtInput.setText(input);

        } else if (id == btnSeven.getId()) {
            if (input.equals("0")) {
                input = "7";
            } else {
                input = input + "7";
            }
            txtInput.setText(input);

        } else if (id == btnEight.getId()) {
            if (input.equals("0")) {
                input = "8";
            } else {
                input = input + "8";
            }
            txtInput.setText(input);

        } else if (id == btnNine.getId()) {
            if (input.equals("0")) {
                input = "9";
            } else {
                input = input + "9";
            }
            txtInput.setText(input);

        } else if (id == btnAdd.getId()) {
            setVal1();
            btnFalse();
            add = true;
            txtView.setText(input + "+");

        } else if (id == btnSub.getId()) {
            setVal1();
            btnFalse();
            sub = true;
            txtView.setText(input + "-");

        } else if (id == btnMul.getId()) {
            setVal1();
            btnFalse();
            mul = true;
            txtView.setText(input + "x");

        } else if (id == btnDiv.getId()) {
            setVal1();
            btnFalse();
            div = true;
            txtView.setText(input + "/");

        } else if (id == btnCE.getId()) {
            txtInput.setText("0");
        } else if (id == btnC.getId()) {
            allReset();
        } else if (id == btnBS.getId()) {
            ip = ip / 10;
            txtInput.setText(Integer.toString(ip));
        } else if (id == btnNeg.getId()) {
            txtInput.setText(Integer.toString(-ip));
        } else if (id == btnDec.getId()) {

        } else if (id == btnEql.getId()) {
            view = view + input + "=";
            txtView.setText(view);
            val2 = Integer.parseInt(input);
            int r = rs;
            if (add) {
                rs = val1 + val2;
                add = false;
            } else if (sub) {
                rs = val1 - val2;
                sub = false;
            } else if (mul) {
                rs = val1 * val2;
                mul = false;
            } else if (div) {
                rs = val1 / val2;
                div = false;
            } else {
                txtView.setText(txtInput.getText().toString());
            }

            txtInput.setText(Integer.toString(rs));

            btnAdd.setEnabled(true);
            btnSub.setEnabled(true);
            btnMul.setEnabled(true);
            btnDiv.setEnabled(true);

        }
    }

    private void btnFalse() {
        btnAdd.setEnabled(false);
        btnSub.setEnabled(false);
        btnMul.setEnabled(false);
        btnDiv.setEnabled(false);
        txtInput.setText("0");
    }

    private void setVal1() {
        val1 = Integer.parseInt(txtInput.getText().toString());
    }

    private void allReset() {
        btnAdd.setEnabled(true);
        btnSub.setEnabled(true);
        btnMul.setEnabled(true);
        btnDiv.setEnabled(true);
        btnEql.setEnabled(true);

        txtInput.setText("0");
        txtView.setText("");
    }

}