package com.example.brezincl.ense471lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnMul, btnDiv, btnAdd, btnSub, btnEqu, btnClr;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnDot = (Button) findViewById(R.id.btnDot);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);

        Button btnMul = (Button) findViewById(R.id.btnMul);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);

        Button btnOpenBracket = (Button) findViewById(R.id.btnOpenBracket);
        Button btnCloseBracket = (Button) findViewById(R.id.btnCloseBracket);

        Button btnEqu = (Button) findViewById(R.id.btnEqu);
        Button btnClr = (Button) findViewById(R.id.btnClr);

        textView = (TextView) findViewById(R.id.textView);

    }

    public void onRegularButtonClick(View view)
    {
        Button clickedButton = (Button)view;
        textView.setText(textView.getText() + clickedButton.getText().toString());
    }

    public void onClearClick(View view)
    {
        textView.setText("");
    }

    public void onEqualsClick(View view)
    {
        textView.setText("The Right Ans");
    }
    public void onBackspaceClick(View view)
    {
        textView.setText(textView.getText().subSequence(0,textView.getText().length() - 1));
    }
}
