package kr.co.yhw.androidbasic02;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.yhw.androidbasic02.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends BaseActivity {
    ActivityUserInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info);
        setupValues();
        setupEvents();
    }

    @Override
    public void setupEvents() {


    }

    @Override
    public void setupValues() {

        String name = getIntent().getStringExtra("userName");
        binding.userInfoTxtEdt.setText(name);

    }
}
