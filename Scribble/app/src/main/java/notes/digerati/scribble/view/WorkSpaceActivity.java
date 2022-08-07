package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import notes.digerati.scribble.databinding.ActivityWorkSpaceBinding;

public class WorkSpaceActivity extends AppCompatActivity {

    ActivityWorkSpaceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityWorkSpaceBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
    }
}