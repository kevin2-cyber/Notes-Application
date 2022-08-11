package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

import notes.digerati.scribble.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    private FirebaseAuth auth;

    String email = "";
    String password = "";
    String confirmPassword = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btnSignUp.setOnClickListener( view ->
                firebaseSignUp()
                );

        auth = FirebaseAuth.getInstance();
    }

    private void validateData(){

        // get data
        email = binding.etEmail.getText().toString().trim();
        password = binding.etPassword.getText().toString().trim();
        confirmPassword = binding.etPasswordConfirm.getText().toString().trim();

        // validate data
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            // invalid email format
            binding.etEmail.setError("Invalid email format");
        } else if (TextUtils.isEmpty(password)) {
            // password isn't entered
            binding.etPassword.setError("Please enter your password");
        } else if (password.length() < 6) {
            binding.etPassword.setError("Please enter at least 6 characters long");
        } else if (TextUtils.isEmpty(confirmPassword)) {
            binding.etPasswordConfirm.setError("Please confirm your password");
        } else if (!Objects.equals(password, confirmPassword)) {
            Toast.makeText(this,"Passwords must be the same", Toast.LENGTH_LONG).show();
        } else firebaseSignUp();
    }

    private void firebaseSignUp(){
        if (binding.etEmail.getText().equals(email)
                && binding.etPassword.getText().equals(password)
                && binding.etPasswordConfirm.getText().equals(password)) {
            startActivity(new Intent(this, WorkSpaceActivity.class));
        } else {
            Toast.makeText(this,"Sign Up unsuccessful", Toast.LENGTH_LONG).show();
        }
    }
}