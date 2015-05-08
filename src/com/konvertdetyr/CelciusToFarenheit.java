package com.konvertdetyr;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CelciusToFarenheit extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.celciustofarenheit);
		
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
				    	 float rezultati=llog.CelcusToFahrenheit(lexonr);
				    	 form.format(rezultati);
				    	 String afisho=form.format(rezultati);
				    	 Rez.setText(afisho+" °F");
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
/*Detyre 1
Ndertoni nje program ne java qe :
•	afishon nje menu me opsione
•	menuja permban konvertime mes madhesive te ndryshme :
	nga Km ne Milje
	nga Celsius ne Fahrenheit
	nga Kilogram ne Pound
	nga Meter ne Feet
	nga Inch ne Centimetra
	nga Inch ne Foot

•	lejon perdoruesin te jape nje opsion si zgjedhje te tij
•	pas zgjedhjes se opsionit, perdoruesi shkruan numrin qe do konvertoje
•	programi afishon rezultatin sipas konvertimit te perzgjedhur
VINI RE : Nderfaqja ne konsole te jete iteraktive me perdoruesin, te jepen njoftime pershendetese si dhe sqarime per cdo veprim te perdoruesit. Secila prej ketyre konvertimeve te jete nje metode me vete, ndersa ne main te behen thirrjet perkatese. Mbase eshte me thjeshte qe keto metoda te vendosen si statike, me fjalen celes static.
*/
