package ro.adi.mesajController;

import java.util.ArrayList;

public class Prim {

	
	public ArrayList<String> listaNrPrime(int x){
		
		ArrayList<String> lista= new ArrayList<String>();
		for(int i=1;i<x;i++){
			
			if(i%1==0 && i%i==0 && i%2!=0){
				
				
					
					lista.add(i+"");
				
			}
			
			
			
		}
		
		return lista;
		
		
	}
	
	
	
	
	
	
}
