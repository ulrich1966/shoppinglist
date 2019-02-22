package de.auli.shoppinglist;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String dir = getFilesDir().getAbsolutePath();
        File root = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
        Log.d(TAG, String.format("Die App liegt in: %s", dir));
        Log.d(TAG, String.format("Die Geräte-Root ist: %s", root.getAbsolutePath()));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShoppingMemo testMemo = new ShoppingMemo("Äpfel", 2);
        Log.d(TAG, "inhalt der der test memo:" + testMemo.toString());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        boolean success = false;
        switch (item.getItemId()){
            case R.id.menit_settinngs:
                //Toast
                success = true;
                break;
            default:
                success = false;

        }
        return success;
    }
}
