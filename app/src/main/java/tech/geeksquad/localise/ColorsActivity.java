package tech.geeksquad.localise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        listView = findViewById(R.id.list);

        list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("White");
        list.add("Pink");
        list.add("Black");
        list.add("Brown");
        list.add("Grey");
        list.add("Orange");

        adapter = new ArrayAdapter<>(this, R.layout.list_item, list);

        listView.setAdapter(adapter);
    }
}
