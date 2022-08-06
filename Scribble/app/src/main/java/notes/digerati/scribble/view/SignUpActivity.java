package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import notes.digerati.scribble.R;
import notes.digerati.scribble.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}