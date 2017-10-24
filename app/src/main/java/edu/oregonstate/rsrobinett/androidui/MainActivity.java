package edu.oregonstate.rsrobinett.androidui;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_grid_layout = (Button) findViewById(R.id.button_grid_layout);
        button_grid_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_linear_layout = (Button) findViewById(R.id.button_linear_layout);
        button_linear_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
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

        Button button_tabbed_layout = (Button) findViewById(R.id.button_tabbed_layout);
        button_tabbed_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TabbedLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button button_assignment = (Button) findViewById(R.id.button_assignment);
        button_assignment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, AssignmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
