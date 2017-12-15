package tech.geeksquad.localise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        listView = findViewById(R.id.list);

        list = new ArrayList<>();
        list.add("Hello");
        list.add("What is your name?");
        list.add("How are you?");
        list.add("I am fine.");
        list.add("Thank You");
        list.add("Nice Meeting You");
        list.add("Good Morning");
        list.add("Good Night");
        list.add("Welcome");
        list.add("Bye");

        adapter = new ArrayAdapter<>(this, R.layout.list_item, list);

        listView.setAdapter(adapter);
    }
}
