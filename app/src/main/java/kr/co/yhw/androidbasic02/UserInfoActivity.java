package kr.co.yhw.androidbasic02;

import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.Calendar;

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
        int birthYear = getIntent().getIntExtra("userBirthYear", -1);

//        현재 나이를 알기위해 현재 시간을 받고 바로 해를 뺀다.
        int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear + 1;

        binding.userInfoTxtEdt.setText(String.format("%s (%d) 세",name,age));

    }
}
