package com.example.osamaaldawoody.storage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.txt);
        relative = (RelativeLayout)findViewById(R.id.rel);
        registerForContextMenu(relative);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.location:
                Toast.makeText(this, "hello location", Toast.LENGTH_SHORT).show();
                break;
            case R.id.search:
                Toast.makeText(this ,"hello search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh :
                Toast.makeText(this, "hello refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, "hello help", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.location:
                Toast.makeText(this, "hello location", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,location.class);
                startActivity(i);
                break;
            case R.id.search:
                Toast.makeText(this ,"hello search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh :
                Toast.makeText(this, "hello refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, "hello help", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}
