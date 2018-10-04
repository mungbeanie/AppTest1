package com.example.dee.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    // ======================================================================================== //
    // =====================================CODE=============================================== //
    int counter = 0;

    public void buttonOnClick(View v) {
        // do something when the button is clicked
        counter++;
        Button butt=(Button) v;
        butt.setText("I've Been Clicked!");
        String counter_string = Integer.toString(counter);
        TextView myText = (TextView) findViewById(R.id.myText);
        myText.setText(counter_string);
        TextView bmitext = (TextView) findViewById(R.id.BMItextbox);
        EditText height = (EditText)findViewById(R.id.height_text);
        EditText weight = (EditText)findViewById(R.id.weight_text);
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();
        float heightValue = Float.parseFloat(heightStr) / 100;
        float weightValue = Float.parseFloat(weightStr);
        float bmi = weightValue / (heightValue * heightValue);
        bmitext.setText(Float.toString(bmi));
    }
}
