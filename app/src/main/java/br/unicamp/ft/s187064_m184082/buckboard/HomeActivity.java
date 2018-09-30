package br.unicamp.ft.s187064_m184082.buckboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button testButton = findViewById(R.id.testButton);

        testButton.setOnClickListener(view -> {
            Intent homeIntent = new Intent(HomeActivity.this, ActivityPrincipal.class);
            startActivity(homeIntent);
            finish();
        });
    }

    public void openCreateNewUserView(View view) {
        Intent homeIntent = new Intent(HomeActivity.this, CreateUserActivity.class);
        startActivity(homeIntent);
        finish();
    }
}
