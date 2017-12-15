package tech.geeksquad.localise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);

        listView = findViewById(R.id.list);

        list = new ArrayList<>();
        list.add("Father");
        list.add("Mother");
        list.add("Grandfather");
        list.add("Grandmother");
        list.add("Son");
        list.add("Daughter");
        list.add("Brother");
        list.add("Sister");
        list.add("Uncle");
        list.add("Aunt");

        adapter = new ArrayAdapter<>(this, R.layout.list_item, list);

        listView.setAdapter(adapter);
    }
}
