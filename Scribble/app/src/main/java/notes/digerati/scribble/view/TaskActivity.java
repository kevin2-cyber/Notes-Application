package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import notes.digerati.scribble.R;
import notes.digerati.scribble.adapter.RecyclerViewAdapter;
import notes.digerati.scribble.databinding.ActivityTaskBinding;

public class TaskActivity extends AppCompatActivity {

    ActivityTaskBinding binding;
    int[] mNoteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTaskBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        GridLayoutManager mGridLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        RecyclerViewAdapter mRecyclerViewAdapter = new RecyclerViewAdapter(this, mNoteList);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
    }
}