package com.example.drivetomsu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //defining the variables
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting the variables
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
    }

    public void process(View view){

        Intent intent=null, chooser=null;

        //if the button is clicked launch google maps
        if(view.getId()==R.id.button){
        intent=new Intent(Intent.ACTION_VIEW);

        //setting the latitude and longitude for montclair state university
        intent.setData(Uri.parse("geo:40.862322, -74.198140"));

        //launching google maps
        chooser=Intent.createChooser(intent,"Launch Maps");

        //starting the google maps
        startActivity(chooser);
        }


    }

}
