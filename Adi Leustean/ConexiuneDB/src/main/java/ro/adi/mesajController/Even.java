package ro.adi.mesajController;

import java.util.ArrayList;

public class Even {

	
	public ArrayList<String> listaNrPare(int x, int y){
		
		ArrayList<String> lista= new ArrayList<String>();
		
		for(int i=x;i<=y;i++){
			
			if(i%2==0){ lista.add(i+"");}
			
			
			
			
		}
		
		return lista;
		
		
	}
	
	
}
