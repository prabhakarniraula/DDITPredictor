
package com.ddit.predictor;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
//import com.ddit.predictor.R;
//import com.rey.material.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

//import com.example.bhaskar.ddit_results.R;


public class MainActivity extends AppCompatActivity {

    //MyAdapter myAdapter;
    private String from;
    private String rid;
    public int i ;

    private Toolbar toolbar;

    public static final int RECORD_ENTRY_REQUEST_CODE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

            // Set our view from the "main" layout resource
            setContentView(R.layout.activity_main);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            //Toolbar will now take on default actionbar characteristics
            setContentView(R.layout.activity_main);

        try {
           // findViewById(R.id.verticle_layout).setVisibility(View.GONE);



            setTitle("DDIT Predictor");
            RadioGroup rg = (RadioGroup)findViewById(R.id.radiotype);
            rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if(i==R.id.outof100)
                    {
                        ((EditText)findViewById(R.id.practical)).setVisibility(View.GONE);
                        (findViewById(R.id.pracv)).setVisibility(View.GONE);
                    }
                    else
                    {
                        ((EditText)findViewById(R.id.practical)).setVisibility(View.VISIBLE);
                        (findViewById(R.id.pracv)).setVisibility(View.VISIBLE);
                    }
                }
            });


        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, ""+e, Toast.LENGTH_LONG).show();

        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

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
        if (id == R.id.action_about) {

            Intent i = new Intent(this,About.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.rateus){
            Uri uri = Uri.parse("market://details?id="+ getApplicationContext().getPackageName());
            Intent goToMarket = new Intent(Intent.ACTION_VIEW,uri);
            try{
                startActivity(goToMarket);
            }catch (ActivityNotFoundException e){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName())));
            }
        }

        if(id== R.id.help)
        {
            Intent i = new Intent(this,Help.class);
            startActivity(i);

            return true;
        }

        if(id == R.id.action_reset){
            // EditText sessional1 =
            ((EditText) findViewById(R.id.sessional1)).setText("");
            //EditText sessional2 =
            ((EditText) findViewById(R.id.sessional2)).setText("");
            //EditText sessional3 =
            ((EditText) findViewById(R.id.sessional3)).setText("");
            //EditText lab =
            ((EditText) findViewById(R.id.practical)).setText("");
            //EditText ext =
            //((EditText) findViewById(R.id.external)).setText("");
            //EditText ptr =
            ((EditText) findViewById(R.id.pointertext)).setText("");

        }


        return super.onOptionsItemSelected(item);
    }


    public void onAdd(View view){
        try {

            int m1 = 0, m2 = 0, m3 = 0, m4 = 0, mlab = 0, mext = 0;
            int selected=0;
            EditText sessional1 = ((EditText) findViewById(R.id.sessional1));
            EditText sessional2 = ((EditText) findViewById(R.id.sessional2));
            EditText sessional3 = ((EditText) findViewById(R.id.sessional3));
            EditText lab = ((EditText) findViewById(R.id.practical));
            //
            // EditText ext = ((EditText) findViewById(R.id.external));
            RadioGroup type = (RadioGroup) findViewById(R.id.radiotype);
            EditText ptr = ((EditText) findViewById(R.id.pointertext));
            boolean flag = ((RadioButton) findViewById(type.getCheckedRadioButtonId())).getText().toString().equalsIgnoreCase("100") ? true : false;

  //          Toast.makeText(MainActivity.this, "Onadd0", Toast.LENGTH_SHORT).show();
            if (i == 0) {
//                Toast.makeText(MainActivity.this, "Onadd0.1", Toast.LENGTH_SHORT).show();

                m1 = Integer.parseInt(sessional1.getText().toString());
             //   Toast.makeText(MainActivity.this, "Onadd0.2", Toast.LENGTH_SHORT).show();
                m2 = Integer.parseInt(sessional2.getText().toString());
           //     Toast.makeText(MainActivity.this, "Onadd0.3", Toast.LENGTH_SHORT).show();
                m3 = Integer.parseInt(sessional3.getText().toString());
                //Toast.makeText(MainActivity.this, "Onadd0.4", Toast.LENGTH_SHORT).show();
              if(!flag) {
                  m4 = mlab = Integer.parseInt(lab.getText().toString());
              }
                else {
                  m4 = mlab = 0;
              }
                //Toast.makeText(MainActivity.this, "Onadd0.5", Toast.LENGTH_SHORT).show();
                mext = 0;//Integer.parseInt(ext.getText().toString());
                //Toast.makeText(MainActivity.this, "Onadd0.6", Toast.LENGTH_SHORT).show();

                selected = Integer.parseInt(ptr.getText().toString());
              //  Toast.makeText(MainActivity.this, "Onadd0.7", Toast.LENGTH_SHORT).show();

            }



            predictor p = new predictor(this, i, (10-selected), flag, m1, m2, m3, m4, mlab, mext,flag);
            p.predict();
            String ans = p.getAns();
            if(!ans.isEmpty()) {
                String content = "";
                //Toast.makeText(MainActivity.this, "Onadd1", Toast.LENGTH_SHORT).show();
                if (i == 0) {
                    //      Toast.makeText(MainActivity.this, "Onadd2", Toast.LENGTH_SHORT).show();
                    if(flag){
                        content =
                                (getResources().getString(R.string.sessional1_regular)) + "\t" + m1 + "\n"
                                        + (getResources().getString(R.string.sessional2_regular)) + "\t" + m2 + "\n"
                                        + (getResources().getString(R.string.sessional3_regular)) + "\t" + m3 + "\n"
                                        + (getResources().getString(R.string.ptr_regular)) + "\t" + (selected) + "\n\n"
                                        + (Html.fromHtml(String.format(getResources().getString(R.string.ext_bold)))) + "\t" + ans + "\n"
                        ;

                    }
                    else {
                        content =
                                (getResources().getString(R.string.sessional1_regular)) + "\t" + m1 + "\n"
                                        + (getResources().getString(R.string.sessional2_regular)) + "\t" + m2 + "\n"
                                        + (getResources().getString(R.string.sessional3_regular)) + "\t" + m3 + "\n"
                                        + (getResources().getString(R.string.practical_regular)) + "\t" + m4 + "\n"
                                        + (getResources().getString(R.string.ptr_regular)) + "\t" + (selected) + "\n\n"
                                        + (Html.fromHtml(String.format(getResources().getString(R.string.ext_bold)))) + "\t" + ans + "\n"
                        ;
                    }
                }
                new MaterialDialog.Builder(this)
                        .title("Prediction")
                        .content(content)
                        .positiveText("OK")
                        .cancelable(false)
                        .show();
            }
           // Toast.makeText(MainActivity.this, "Onadd8", Toast.LENGTH_SHORT).show();
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(MainActivity.this, "Please Add the Proper Values.", Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "Error Occured : "+ e, Toast.LENGTH_LONG).show();

        }
    }






}
