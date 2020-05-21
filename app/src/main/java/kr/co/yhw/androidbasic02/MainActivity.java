package kr.co.yhw.androidbasic02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import kr.co.yhw.androidbasic02.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {
        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = binding.nameEdt.getText().toString();

                Intent intent = new Intent(mContext,UserInfoActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public void setupValues() {

    }
}
