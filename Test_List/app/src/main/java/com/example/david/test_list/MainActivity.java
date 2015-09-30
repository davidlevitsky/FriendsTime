package com.example.david.test_list;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Demo> demoList = new ArrayList<Demo>();
        Demo one = new Demo("1");
        Demo two = new Demo("2");
        Demo three = new Demo("3");
        Demo four = new Demo("4");
        Demo five = new Demo("5");
        Demo six = new Demo("6");
        Demo seven = new Demo("7");
        Demo eight = new Demo("8");
        Demo nine = new Demo("9");
        Demo ten = new Demo("10");
        demoList.add(one);
        demoList.add(two);
        demoList.add(three);
        demoList.add(four);
        demoList.add(five);
        demoList.add(six);
        demoList.add(seven);
        demoList.add(eight);
        demoList.add(nine);
        demoList.add(ten);
        DemoAdapter demo = new DemoAdapter(this, demoList);
        ListView listView = (ListView) findViewById(R.id.lvItems);
        listView.setAdapter(demo);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
