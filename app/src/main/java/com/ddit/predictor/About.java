package com.ddit.predictor;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        String[] array = {"Prabhakar Niraula (CE Sem 5)","Tanmay Naik (CE Sem 5)","Darshil Parikh (CE Sem 5)"};
        TextView f = (TextView)findViewById(R.id.firsttext);
        TextView s = (TextView)findViewById(R.id.secondtext);
        TextView th = (TextView)findViewById(R.id.thirdtext);
        TextView t = (TextView)findViewById(R.id.mylink);
        t.setMovementMethod(LinkMovementMethod.getInstance());

        if(System.currentTimeMillis()%3 == 0)
        {
            f.setText(array[0]);

            if(System.currentTimeMillis()%2==0)
            {
                s.setText(array[1]);
                th.setText(array[2]);
            }
            else
            {
                s.setText(array[2]);
                th.setText(array[1]);
            }
        }
        else if(System.currentTimeMillis()%3==1)
        {

            f.setText(array[1]);

            if(System.currentTimeMillis()%2==0)
            {
                s.setText(array[0]);
                th.setText(array[2]);
            }
            else
            {
                s.setText(array[2]);
                th.setText(array[0]);
            }
        }
        else
        {

            f.setText(array[2]);

            if(System.currentTimeMillis()%2==0)
            {
                s.setText(array[0]);
                th.setText(array[1]);
            }
            else
            {
                s.setText(array[1]);
                th.setText(array[0]);
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_about, menu);
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
