package notes.digerati.scribble;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

import notes.digerati.scribble.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        getSplashScreen().setOnExitAnimationListener(view -> {
            setContentView(R.style.Theme_AppCompat_SplashDay);
        });
        setContentView(binding.getRoot());

        binding.textView.setText(R.string.app_name);
        Button loginBtn = findViewById(R.id.login_btn);
        Button signBtn = findViewById(R.id.sign_up_btn);
    }
}