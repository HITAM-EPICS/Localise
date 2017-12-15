package tech.geeksquad.localise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void numbers(View view) {
        Intent intent = new Intent(this, NumberActivity.class);
        startActivity(intent);
    }

    public void familyMembers(View view) {
        Intent intent = new Intent(this, FamilyMembersActivity.class);
        startActivity(intent);
    }

    public void colors(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void phrases(View view) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
}
