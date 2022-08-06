package notes.digerati.scribble.view;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;


import notes.digerati.scribble.R;
import notes.digerati.scribble.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.S)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        getSplashScreen().setOnExitAnimationListener(view -> setContentView(R.style.Theme_AppCompat_SplashDay));
        setContentView(binding.getRoot());

    }
}