package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import notes.digerati.scribble.databinding.ActivityAddScreenBinding;

public class AddScreenActivity extends AppCompatActivity {

    ActivityAddScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityAddScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.addBtn.setOnClickListener( view -> {
            Intent intent = new Intent(this, WorkSpaceActivity.class);
            startActivity(intent);
        });
    }
}