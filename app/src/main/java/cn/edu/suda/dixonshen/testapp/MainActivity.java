package cn.edu.suda.dixonshen.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //当第一次创建该Activity时调用该方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建一个线性布局管理器
        LinearLayout layout = new LinearLayout(this);
        super.setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);
        final TextView show = new TextView(this);
        Button bn = new Button(this);
        bn.setText(R.string.button1);
        bn.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        layout.addView(show);
        layout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                show.setText("Hello, Android, " + new java.util.Date());
            }
        });
    }

    public void clickHandler(View source){
        //获取UI界面中ID为R.id.show的文本框
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hello Android-" + new java.util.Date());
    }
}
