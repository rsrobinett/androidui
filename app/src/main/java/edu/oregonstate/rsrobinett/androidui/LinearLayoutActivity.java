package edu.oregonstate.rsrobinett.androidui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Button button_back = (Button) findViewById(R.id.back_button);
        button_back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(LinearLayoutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
