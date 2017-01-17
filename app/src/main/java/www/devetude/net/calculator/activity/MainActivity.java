package www.devetude.net.calculator.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import www.devetude.net.calculator.R;
import www.devetude.net.calculator.listener1.OnBtnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button acBtn;
    private Button devideBtn;
    private Button mulBtn;
    private Button minuBtn;
    private Button plusBtn;
    private Button equalsBtn;
    private Button zeroBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private TextView resTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resTextView = (TextView) findViewById(R.id.main_result_textview);

        Button acBtn = (Button) findViewById(R.id.main_btn_ac);
        acBtn.setTag(OnBtnClickListener.Btn_AC);
        acBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button devideBtn = (Button) findViewById(R.id.main_btn_devide);
        devideBtn.setTag(OnBtnClickListener.Btn_devide);
        devideBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button mulBtn = (Button) findViewById(R.id.main_btn_mul);
        mulBtn.setTag(OnBtnClickListener.Btn_mul);
        mulBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button minuBtn = (Button) findViewById(R.id.main_btn_minu);
        minuBtn.setTag(OnBtnClickListener.Btn_minu);
        minuBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button plusBtn = (Button) findViewById(R.id.main_btn_plus);
        plusBtn.setTag(OnBtnClickListener.Btn_plus);
        plusBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button equalsBtn = (Button) findViewById(R.id.main_btn_equals);
        equalsBtn.setTag(OnBtnClickListener.Btn_equals);
        equalsBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button zeroBtn = (Button) findViewById(R.id.main_btn_0);
        zeroBtn.setTag(0);
        zeroBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button oneBtn = (Button) findViewById(R.id.main_btn_1);
        oneBtn.setTag(1);
        oneBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button twoBtn = (Button) findViewById(R.id.main_btn_2);
        twoBtn.setTag(2);
        twoBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button threeBtn = (Button) findViewById(R.id.main_btn_3);
        threeBtn.setTag(3);
        threeBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button fourBtn = (Button) findViewById(R.id.main_btn_4);
        fourBtn.setTag(4);
        fourBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button fiveBtn = (Button) findViewById(R.id.main_btn_5);
        fiveBtn.setTag(5);
        fiveBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button sixBtn = (Button) findViewById(R.id.main_btn_6);
        sixBtn.setTag(6);
        sixBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button sevenBtn = (Button) findViewById(R.id.main_btn_7);
        sevenBtn.setTag(7);
        sevenBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button eightBtn = (Button) findViewById(R.id.main_btn_8);
        eightBtn.setTag(8);
        eightBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));

        Button nineBtn = (Button) findViewById(R.id.main_btn_9);
        nineBtn.setTag(9);
        nineBtn.setOnClickListener(new OnBtnClickListener(MainActivity.this, resTextView));
    }
}



