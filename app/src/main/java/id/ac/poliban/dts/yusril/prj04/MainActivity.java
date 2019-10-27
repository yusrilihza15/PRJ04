package id.ac.poliban.dts.yusril.prj04;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;

    private List<String> data = new ArrayList<>();
    {
        data.add("Persija");
        data.add("Persiba");
        data.add("Barito");
        data.add("Madura United");
        data.add("Persela");
        data.add("Bali United");
        data.add("Real Madrid");
        data.add("Machester United");
        data.add("Liecester");
        data.add("Cina");
        data.add("Malaysia");
        data.add("Perseru badak lampung");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)getSupportActionBar().setTitle("Demo SImple List");
        ListView lv = findViewById(R.id.lvItem);
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,data);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "Kamu Memilih"+data, Toast.LENGTH_SHORT).show();
        });

        lv.setOnItemLongClickListener((parent, view, position, id) -> {
            data.remove(1);
            adapter.notifyDataSetChanged();
            return true;
        });
    }
}
