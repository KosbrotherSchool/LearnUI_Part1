package com.example.learnui_part1;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Button button;
	private TextView textview;
	private EditText edittext;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById (R.id.main_button);
        textview = (TextView) findViewById(R.id.main_textview);
        edittext = (EditText) findViewById(R.id.main_edittext);
        
        button.setOnClickListener(new Button.OnClickListener(){ 
            @Override
            public void onClick(View v) {
            	// add action here
            	String edittext_string = edittext.getText().toString();
                edittext.clearComposingText();
                textview.setText(edittext_string);
            }         

        });
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
