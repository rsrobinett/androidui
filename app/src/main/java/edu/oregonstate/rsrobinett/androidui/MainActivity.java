package edu.oregonstate.rsrobinett.androidui;

import android.content.Intent;
import android.database.AbstractCursor;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import edu.oregonstate.rsrobinett.androidui.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_linear_layout = (Button) findViewById(R.id.button_linear_layout);
        button_linear_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_grid_layout = (Button) findViewById(R.id.button_grid_layout);
        button_grid_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_frame_layout = (Button) findViewById(R.id.button_frame_layout);
        button_frame_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_relative_layout = (Button) findViewById(R.id.button_relative_layout);
        button_relative_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_tab_layout = (Button) findViewById(R.id.button_tab_layout);
        button_tab_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TabLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_table_layout = (Button) findViewById(R.id.button_table_layout);
        button_table_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
