package ir.rayapp.horizontallistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //Make Listview Horizontal
        LinearLayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //end

        ArrayList<String> items = new ArrayList<>();
        items.add("Book 1");
        items.add("Book 2");
        items.add("Book 3");
        items.add("Book 4");
        items.add("Book 5");
        items.add("Book 6");
        items.add("Book 7");

        AdapterHorizontalList adapter = new AdapterHorizontalList(items);
        recyclerView.setAdapter(adapter);
    }
}
