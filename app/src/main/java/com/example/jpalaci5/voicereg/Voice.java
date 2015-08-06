package com.example.jpalaci5.voicereg;


import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Voice extends ActionBarActivity implements View.OnClickListener {

 // EditText lv;

  //static final int REQUEST_OK = 1;

    protected static final int REQUEST_OK  = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        findViewById(R.id.button1).setOnClickListener(this);
     //   lv = (EditText) findViewById(R.id.lvVoiceReturn);
      //  Button b = (Button) findViewById(R.id.bVoice);
      //  b.setOnClickListener(this);

    }

//    @Override
//    public void onClick(View v) {
//        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//
//        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "TALK UP !!");
//        startActivityForResult(i, RESULT_OK);
//
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == RESULT_OK && resultCode == RESULT_OK) {
//            ArrayList<String> thingsYouSaid = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//            ((TextView)findViewById(R.id.text1)).setText(thingsYouSaid.get(0));
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }



        public void onClick(View v) {

        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "TALK UP !!");
       startActivityForResult(i, REQUEST_OK);
}


    @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RESULT_OK && resultCode == RESULT_OK){
          ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if(result.size() > 0) Toast.makeText(this,result.get(0), Toast.LENGTH_LONG).show();

        }
        super.onActivityResult(requestCode, resultCode, data);
   }
}



