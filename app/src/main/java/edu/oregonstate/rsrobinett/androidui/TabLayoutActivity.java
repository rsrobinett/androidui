package edu.oregonstate.rsrobinett.androidui;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.Tab;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.TabHost;
import android.widget.TextView;
import android.view.View;
public class TabLayoutActivity extends AppCompatActivity {

    /*
    protected void tabClick(String bodyText){
        final TextView main_body = (TextView) findViewById(R.id.text_body);
        main_body.setText(bodyText);
    }*/
/*
    private View.OnClickListener tabClick(int bodyText) {
        TextView main_body = (TextView) findViewById(R.id.text_body);
        main_body.setText(bodyText);
    }
    */
    /*
    public void tab2Click(View view){
        final TextView main_body = (TextView) findViewById(R.id.text_body);
        main_body.setText(R.string.tab_2_text);
    }
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        /*
        TabItem new_tab_1 = new TabItem(getCurrentFocus().getContext());
        //tab_1.setOnClickListener(tabClick(R.string.tab_1_text));
*/
        final TextView tab_activity_body = (TextView) findViewById(R.id.text_body);
        final TabLayout tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        Tab tab_2 = tab_layout.getTabAt(1);
        tab_2.select();
        
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
                TextView tab_body = (TextView) tab.getTag();
                tab_activity_body.setText(tab_body.getText());
            }

            @Override
            public void onTabUnselected(Tab tab) {
            }

            @Override
            public void onTabReselected(Tab tab) {

            }
        });

        /*initialize body*/
        //final TextView main_body = (TextView) findViewById(R.id.text_body);
        //main_body.setText(R.string.tab_1_text);

        /*set body based on tab this is clicked*/

        /*
        TabItem tab_1 = (TabItem) findViewById(R.id.tab_1);
        tab_1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                main_body.setText(R.string.tab_1_text);
            }
        });
        TabItem tab_2 = (TabItem) findViewById(R.id.tab_2);
        tab_2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                main_body.setText(R.string.tab_2_text);
            }
        });

        TabItem tab_3 = (TabItem) findViewById(R.id.tab_3);
        tab_3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                main_body.setText(R.string.tab_3_text);
            }
        });
*/
    }

}
