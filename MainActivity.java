package com.example.calculator;

import android.os.Bundle;
import android.content.Intent;		// We need Intent to create a bridge between 2 activities
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;		// for using the EditText class


public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "com.example.calculator.MESSAGE"; // key is a public constant


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
  public void sendMessage(View v)					// onClick()
   {
	   Intent intent = new Intent(this, DisplayMessageActivity.class);
	   EditText num1 = (EditText) findViewById(R.id.edit_message); // getting the 1st number
	   EditText num2= (EditText) findViewById(R.id.edit_message_2);	// getting the 2nd number
	   String message1 = num1.getText().toString();
	   String message2 = num2.getText().toString();
	   Integer n1= Integer.parseInt(message1);  	// obtaining the 1st number
	   Integer n2= Integer.parseInt(message2);		// obtaining the 2nd number
	   Integer n3=n1+n2;							// adding the 2 numbers
	   String result=n3.toString();			        // converting the result back to string
	   intent.putExtra(EXTRA_MESSAGE, result);		// a key-value pair
	   startActivity(intent);
   }
    
}
