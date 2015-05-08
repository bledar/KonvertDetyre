package com.konvertdetyr;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class Menuja extends Activity {

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
	}
	
      public void hap_KmToMilje (View view){
    	  Intent km_intent = new Intent(this, KmToMilje.class);	
    	  startActivity(km_intent);
			
			
		}
      public void hap_CelciusToFarenheit (View view){
    	  Intent celcius_intent = new Intent(this, CelciusToFarenheit.class);	
    	  startActivity(celcius_intent);
			
			
		}
      
      public void hap_KgToPound (View view){
    	  Intent kg_intent = new Intent(this, KgToPound.class);	
    	  startActivity(kg_intent);
			
			
		}
      public void hap_InchToCentimeter (View view){
    	  Intent kg_intent = new Intent(this, InchToCm.class);	
    	  startActivity(kg_intent);
			
			
		}
		 public void hap_MeterToFoot (View view){
	    	  Intent kg_intent = new Intent(this,MeterToFoot.class);	
	    	  startActivity(kg_intent);
				
				
			}
		 
		 public void hap_InchToFoot (View view){
	    	  Intent kg_intent = new Intent(this,InchToFoot.class);	
	    	  startActivity(kg_intent);
				
				
			}
		 public void hap_AutorMenu (View view){
	    	  Intent kg_intent = new Intent(this,AutoriMenu.class);	
	    	  startActivity(kg_intent);
				
				
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
