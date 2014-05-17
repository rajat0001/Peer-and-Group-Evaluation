package com.example.calculator;

import android.support.v7.app.ActionBarActivity;


import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
   Integer count ,n1,n2;
	String s1,s2;
	Button add,sub,mul,div;
	TextView display;
	EditText d1,d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        

       
        count=0;
        add=(Button)findViewById(R.id.add);
       
        sub=(Button)findViewById(R.id.sub);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.div);
        
        
        
        display=(TextView)findViewById(R.id.Textview);
        d1=(EditText)findViewById(R.id.editText1);
        d2=(EditText)findViewById(R.id.editText2);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
		        s1=d1.getText().toString();
		        n1=Integer.parseInt(s1);
		        
		        s2=d2.getText().toString();
		        n2=Integer.parseInt(s2);
				
				count=n1+n2;
				
				display.setText("result is:"+count.toString());
			
				
			}

		
		});
        
    sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				s1=d1.getText().toString();
		        n1=Integer.parseInt(s1);
		        
		        s2=d2.getText().toString();
		        n2=Integer.parseInt(s2);
				count=n1-n2;
				
				display.setText("result is:"+(count));
				
			}
		});
    mul.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		s1=d1.getText().toString();
        n1=Integer.parseInt(s1);
        
        s2=d2.getText().toString();
        n2=Integer.parseInt(s2);
		count=n1*n2;
		display.setText("result is:"+count);
		
	}
      });
     div.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		s1=d1.getText().toString();
        n1=Integer.parseInt(s1);
        
        s2=d2.getText().toString();
        n2=Integer.parseInt(s2);
		count=n1/n2;
		display.setText("result is:"+count);
		
	}
    });

      

        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
