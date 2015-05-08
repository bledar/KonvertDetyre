package com.konvertdetyr;

import java.text.DecimalFormat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KgToPound extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kgtopound);
		final TextView Rez=(TextView) findViewById(R.id.dalja);
		final Button Konverto=(Button) findViewById(R.id.Konverto);
		final EditText lexo=(EditText) findViewById(R.id.lexo);
		final Funksionet llog=new Funksionet();
		final DecimalFormat form=new DecimalFormat("00.00");
		Konverto.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if (lexo.getText().toString().matches("")){
					Toast.makeText(getApplicationContext(), "SHKUANI NJË NUMËR",Toast.LENGTH_LONG).show();
				}
				
				else{
				     float lexonr=Float.parseFloat(lexo.getText().toString());
				
				     if (lexonr>9999){
				    	 
				    	 Toast.makeText(getApplicationContext(), "PROVO NJË NUMËR MË TË VOGËL",Toast.LENGTH_LONG).show();
				     }
				
				
				     else{
				    	 float rezultati=llog.KgToPounds(lexonr);				    	 form.format(rezultati);
				    	 String afisho=form.format(rezultati);
				    	 Rez.setText(afisho+" pound");
				     	}    
							      
					 }
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		  MenuInflater inflater = getMenuInflater();
		  inflater.inflate(R.menu.main, menu);
		  return true;
		}
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    // Handle item selection
		
		    switch (item.getItemId()) {
		    case R.id.action_settings:            
		        startActivity(new Intent("com.konvertdetyr.AUTORIMENU"));
		        return true;        
		    default:
		        return super.onOptionsItemSelected(item);
		    }
		   }

}
