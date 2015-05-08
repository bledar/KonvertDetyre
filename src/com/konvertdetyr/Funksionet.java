package com.konvertdetyr;

public class Funksionet {
	
	//metoda qe konverton nga kilometer ne milje
	float kmToMilje(float x){
		final float c=0.621371f;//costantja qe shumezohet me km
		
		float milje=x * c;
		
		return(milje);
	}

	//metoda qe konverton nga grad celcius ne grade fahrenheit
	float CelcusToFahrenheit(float x){
	
		
		float temp=((x*9)/5)+32;
		
		return(temp);
	}
	
	//kjo metode konverton ng kilogram ne pound 
	float KgToPounds(float x){
		
	final float c=2.2046f;
		
		float mas=x*c;
		
		return(mas);
	}
	
	//kthen nga meter ne foot
	float MeterToFeet(float x){
		
		final float c=3.2808f;
			
			float meter=x*c;
			
			return(meter);
		}
	
	//konveron inch ne centimeter
float InchToCm(float x){
		
		final float c=0.3937f;
			
			float cm=x/c;
			
			return(cm);
		}

//kthen inch ne foot
float InchToFoot(float x){
	
	final float c=0.083333f;
		
		float foot=x*c;
		
		return(foot);
	}

//kjo metode afishon menun kryesore te programit
void afisho(){
	System.out.println("\n\nZgjidhni nje nga opsionet per konvertim\n" );
	System.out.println("1. Konvertoni Km -> Milje");
	System.out.println("2. Konvertoni Celcius -> Fahrenheit");
	System.out.println("3. Konvertoni Kg -> Pound");
	System.out.println("4. Konvertoni Meter -> Foot");
	System.out.println("5. Konvertoni Inch -> Centimeter");
	System.out.println("6. Konvertoni Inch -> Foot");
	System.out.println("0. zero per te dale");

}
	
}
//constantet e perdorura

//0.621371
//2.2046
//3.2808
//0.3937
//0.083333