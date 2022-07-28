package notes.digerati.scribble;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();

        TextView textView = findViewById(R.id.textView);
        textView.setText(R.string.app_name);
        Button loginBtn = findViewById(R.id.login_btn);
        Button signBtn = findViewById(R.id.sign_up_btn);
    }
}