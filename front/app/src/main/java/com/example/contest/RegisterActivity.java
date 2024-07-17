package com.example.contest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.model.Member;
import com.example.retrofit.RetrofitClient;
import com.example.service.ApiService;

import java.math.BigInteger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RegisterActivity extends AppCompatActivity {
    public Member member;

    private EditText etId, etPw, etName, etAge, etEmail, etCall, etAddress, etIntro;
    private RadioGroup rgGender;
    private CheckBox cbDis;
    private Button btnRegister;
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_register);

        etId = findViewById(R.id.et_register_id);
        etPw = findViewById(R.id.et_register_pw);
        etName = findViewById(R.id.et_register_name);
        rgGender = findViewById(R.id.et_register_gender);
        etAge = findViewById(R.id.et_register_age);
        etEmail = findViewById(R.id.et_register_email);
        etCall = findViewById(R.id.et_register_call);
        etAddress = findViewById(R.id.et_register_address);
        etIntro = findViewById(R.id.et_register_intro);
        cbDis = findViewById(R.id.et_register_disabled);
        btnRegister = findViewById(R.id.btn_register);

        Retrofit retrofit = RetrofitClient.getClient("http://10.0.2.2:8080");
        apiService = retrofit.create(ApiService.class);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long isDis;
                String gender;

                if(cbDis.isChecked()) isDis = 1;
                else isDis = 0;

                RadioButton radioButton = findViewById(rgGender.getCheckedRadioButtonId());
                gender = radioButton.getText().toString();

                member = new Member(
                        etId.getText().toString(),
                        etPw.getText().toString(),
                        etName.getText().toString(),
                        gender,
                        Integer.parseInt(etAge.getText().toString()),
                        etEmail.getText().toString(),
                        etCall.getText().toString(),
                        etAddress.getText().toString(),
                        //getTextAsLines(etIntro),
                        etIntro.getText().toString(),
                        isDis);

                registerUser(member);
            }
        });
    }

    private void registerUser(Member member) {
        apiService.registerUser(member).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Log.d("RegisterActivity", "회원가입 성공");
                    Toast.makeText(RegisterActivity.this, "회원가입 성공", Toast.LENGTH_SHORT).show();

                    if(cbDis.isChecked()) {
                        // Register_DisabledActivity 이동
                        Intent intent = new Intent(RegisterActivity.this, Register_DisabledActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        // MainActivity로 이동
                        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                } else {
                    String errorMessage = "회원가입 실패: " + response.message();
                    Log.e("RegisterActivity", errorMessage);
                    Toast.makeText(RegisterActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                String errorMessage = "회원가입 실패: " + t.getMessage();
                Log.e("RegisterActivity", errorMessage, t);
                Toast.makeText(RegisterActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String[] getTextAsLines(EditText editText) {
        String text = editText.getText().toString();
        return text.split("\\r?\\n");
    }
}
