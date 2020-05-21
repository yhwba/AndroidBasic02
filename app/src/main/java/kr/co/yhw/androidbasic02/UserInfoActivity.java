package kr.co.yhw.androidbasic02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.yhw.androidbasic02.databinding.ActivityMainBinding;
import kr.co.yhw.androidbasic02.databinding.ActivityUserInfo2Binding;

public class UserInfoActivity extends BaseActivity {
    ActivityUserInfo2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info2);
        setupValues();
        setupEvents();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {
        binding.userNameEdt.setText("????");

    }
}
