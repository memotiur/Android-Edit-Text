package com.example.android.edittext;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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
    public void result(View view){
        EditText numberTwo=(EditText)findViewById(R.id.secondNumber);
        EditText numberOne=(EditText)findViewById(R.id.firstNumber);
        String value1=numberOne.getText().toString();
        String value2=numberTwo.getText().toString();
        int valueOne=Integer.parseInt(value1);
        int valuetwo=Integer.parseInt(value2);
        int sum=valueOne+valuetwo;
        TextView txt=(TextView)findViewById(R.id.result);
        txt.setText(String.valueOf(sum));

    }

}
