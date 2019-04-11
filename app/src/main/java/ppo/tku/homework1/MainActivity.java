package ppo.tku.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextView01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView01 = (TextView) findViewById(R.id.myTextView01);
        String str_2 = "test 測試 Android TextView";
        mTextView01.setText(str_2);

        mTextView01.setText("changed text");
        mTextView01.setTextSize(50);
        mTextView01.setTextColor(getResources().getColor(R.color.colorAccent));
        mTextView01.setY(200);
    }

}
