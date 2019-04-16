package com.example.dixon.buttonclick02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTV=null;
    private Button mBT4 = null;
    private Button mBT5=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定TextView资源
        mTV=(TextView)findViewById(R.id.tv);
        //绑定Button资源
        mBT4 = (Button) findViewById(R.id.btn4);
        //设置Button监听
        mBT4.setOnClickListener(this);
        mBT5=(Button)findViewById(R.id.btn5);
        mBT5.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn4:
                mTV.setText("通过实现OnClickListener接口实现ButtonClick事件");
                Toast.makeText(MainActivity.this,"通过实现OnClickListener接口实现ButtonClick事件",Toast.LENGTH_LONG).show();
                break;
            case R.id.btn5:
                mTV.setText("你点击了BUTTON5");
                Toast.makeText(MainActivity.this,"你点击了BUTTON5",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
