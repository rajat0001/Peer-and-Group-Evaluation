package com.example.test2;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Test2 extends Activity  implements OnClickListener{
	EditText editText1;
	EditText editText2;
	Button Add;
	Button Sub;
	Button Mul;
	Button Divide;
	TextView textView2;
	String op = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        editText1 = (EditText) findViewById(R.id.editText1);
	    editText2 = (EditText) findViewById(R.id.editText2);

	    Add = (Button) findViewById(R.id.Add);
	    Sub = (Button) findViewById(R.id.Sub);
	    Mul = (Button) findViewById(R.id.Mul);
	    Divide = (Button) findViewById(R.id.Divide);

	    textView2 = (TextView) findViewById(R.id.textView2);
	    Add.setOnClickListener((OnClickListener) this);
	    Sub.setOnClickListener(this);
	    Mul.setOnClickListener(this);
	    Divide.setOnClickListener(this);
    }
    @Override
	  public void onClick(View v) {
    	 float num1 = 0;
 	    float num2 = 0;
 	    float result = 0;
 	   if (TextUtils.isEmpty(editText1.getText().toString())
 		        || TextUtils.isEmpty(editText2.getText().toString())) {
 		      return;
 		    }   
 	  num1 = Float.parseFloat(editText1.getText().toString());
	    num2 = Float.parseFloat(editText2.getText().toString());
	    switch (v.getId()) {
	    case R.id.Add:
	      op = "+";
	      result = num1 + num2;
	      break;
	    case R.id.Sub:
	      op = "-";
	      result = num1 - num2;
	      break;
	    case R.id.Mul:
	      op = "*";
	      result = num1 * num2;
	      break;
	    case R.id.Divide:
	      op = "/";
	      result = num1 / num2;
	      break;
	    default:
	      break;
	    }
	    textView2.setText(num1 + " " + op + " " + num2 + " = " + result);
}
}