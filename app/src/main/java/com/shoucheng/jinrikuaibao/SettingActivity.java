package com.shoucheng.jinrikuaibao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends AppCompatActivity {

    @BindView(R.id.buttonCollection)
    Button buttonCollection;
    @BindView(R.id.button3)
    Button button3;
    @BindView(R.id.button4)
    Button button4;
    @BindView(R.id.button5)
    Button button5;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button6)
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.buttonCollection, R.id.button3, R.id.button4, R.id.button5, R.id.button, R.id.button6})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.buttonCollection:
                Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                break;
            case R.id.button4:
                break;
            case R.id.button5:
                break;
            case R.id.button:
                break;
            case R.id.button6:
                break;
        }
    }
}
