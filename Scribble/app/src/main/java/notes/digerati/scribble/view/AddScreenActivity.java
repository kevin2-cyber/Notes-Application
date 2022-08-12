package notes.digerati.scribble.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import notes.digerati.scribble.databinding.ActivityAddScreenBinding;

public class AddScreenActivity extends AppCompatActivity {

    ActivityAddScreenBinding binding;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityAddScreenBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.addBtn.setOnClickListener( view -> {
            Intent intent = new Intent(this, WorkSpaceActivity.class);
            startActivity(intent);
        });

        // init auth
        auth = FirebaseAuth.getInstance();
        checkUser();

        // handle click, logout
        binding.btnSignOut.setOnClickListener( view -> {
            auth.signOut();
            checkUser();
        });
    }

    private void checkUser() {

        // check if user is logged in or not
        FirebaseUser user = auth.getCurrentUser();
        if (user != null) {

            // user is not null, user is logged in, get user info
            String email = user.getEmail();

            // set to text view
            binding.tvEmail.setText(email);
        } else {

            //user is null, user not logged in go to login activity
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
    }
}