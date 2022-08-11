package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import notes.digerati.scribble.databinding.ActivityTaskBinding;

public class TaskActivity extends AppCompatActivity {

    ActivityTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTaskBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}