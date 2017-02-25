
public class Main {
	public static void main(String[] args){
		
		
				// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
		
		
				//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
				int nr1 = 7;
				int nr2 = 3;
				System.out.println(nr1 + nr2);		
				
				//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
				double a= 1.25;
				double b= 2.5;
				double c= 3;
				double d= 2.90;
				double inmultire= a*b*c*d;
				System.out.println(inmultire);				
				
				//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
				
				int nr7=11;
				int nr8=26;
				int cat=nr7 / nr8;
				int rest=nr7 % nr8;
				System.out.println("catul este " + cat +  " si restul este " + rest);
				
				
				//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
				
				int nr5 = 5;
				int nr9 = 7;
				int nr10 = -9;
				int suma = (nr5+nr9) * nr10;
				System.out.println(suma);
				
				//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
				String nume = "loredana";
				String curs = "java";
			    System.out.println(" ma numesc " + nume + " si invat " + curs);	
				
				//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
			    
			    int int1 = 25;
			    int int2 = 25;
			    if  (int1 > int2) {
			    	
			    	
			    	System.out.println(int1);
			    	
			    }
			    else {
			    	System.out.println(int2);	
			    }
			    
			    
			    
			    
				
				
				//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
			
			    double latura= 5.2;
			    int h= 3;
			    double aria=(h*latura)/2;
			    System.out.println(aria);
			
			    
			    
			    
//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
				
			    int numarMare= 10;
			    int numarMic=5;
			    
			    if (numarMare>numarMic){
			    	System.out.println("Numarul "+numarMare+" este mai mare decat numarul "+numarMic);
			    
			    }
			    else {
			    	System.out.println("Numarul "+numarMic+" este mai mare decat numarul "+numarMare);
				    
			    }
			    
				
				//Exemplul 7: Declarati o variabila de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
				boolean ok=false;
				
			    if(numarMare == numarMic){
			    	ok=true;
				}
			    
				if(ok == true){
					System.out.println("Fals");
				}
				else {
					System.out.println("Adevarat $$$ valoare");
				}
					
				
				
				
				//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
				
				int u = 5;
				int o = 3;
				int rezultat = 1;
				for ( int x = 1; x <= o; x = x + 1){
					rezultat = rezultat * u;
					
				}
				System.out.println(rezultat);
				
				
				
				
				//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
				int nrint = 125;
				int par = 0;
				for (int x = 2; x < nrint; x = x + 2 ){
					par =  x;
					
				}
				System.out.println(par);
				//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
				int suma1 = 3 + 1240191;
				switch(suma1){
				case 4:  //echivalent cu if(suma1 == 4)
					System.out.println("Numerele sunt bune");
					break;
				case 8:  //echivalent cu if(suma1 == 8)
					System.out.println("Numerele sunt okay");
					break;
				case -1:
					System.out.println("CEVA");
					break;
				default:  //echivalent cu else
					System.out.println("Numerele nu sunt bune");
				}
				
				
				
				
				
				//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
				int[] x = new int[8];
				for(int y = 0; y<=7; y=y+1){
					x[y]=y+1;
					System.out.println(x[y]);
				}
		
				//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
				int[] vector = new int[4];
				vector[0] = -1;
				vector[1] = 17;
				vector[2] = 13;
				vector[3] = -69;
				int sum1=0;
				for(int i=0;i<4;i=i+1){
					if(vector[i]>0){
						sum1=sum1+vector[i];
					}
				}
				System.out.println("suma este " +  sum1);
					
				
				
				//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
				
				for(int i = 3 ; i >= 0 ; i = i - 1){
					System.out.println(vector[i]);
					
				}
				
				//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
				
				double[] vector1 =new double[4];
				vector1[0] = 12;
				vector1[1] = 17;
				vector1[2] = 100;
				vector1[3] = 7.5;
				for ( int i=0 ; i<=3; i=i+1){
					System.out.println(vector1[i]);	
				}
				 
				//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
			    //{12 , 17 , 100 , 7.5}
				double max = vector1[0];
				for ( int i=0 ; i<=3; i=i+1){
					if(vector1[i] > max){
						max = vector1[i];
						
					}
				}
				System.out.println(max);
				
				
				//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
				//{cal, masina, calculator, monitor} -> {calului, masinaului, calculatorului, monitorului}
				
				String[] vecc = new String[4];
				vecc[0]= "cal";
				vecc[1]= "masina";
				vecc[2]= "calculator";
				vecc[3]= "monitor";
				for(int i=0; i<=3; i=i+1){
					System.out.println(vecc[i]+"ului");
				
				}
						
				
				//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
				
				
				int[] vector2 = new int[4];
				vector2[0] = -3;
				vector2[1] = 17;
				vector2[2] = 33;
				vector2[3] = -69;
				int gasit= 0;
				
				for(int i= 0;i<=3;i=i+1){
					
					for(int j= 0;j<=3;j=j+1){
						
						if(vector[i]==vector2[j]){
							gasit=gasit+1;
						}
					}
				}
				System.out.println(gasit);
				
//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
				int[][] matrice = new int[2][2];
				for(int i= 0;i<=1;i=i+1){
					
					for(int j= 0;j<=1;j=j+1){
						matrice[i][j]=0;
						matrice[0][1]=1;
						System.out.print(matrice[i][j]+" ");
					}
				System.out.println();	
				}
		
		
		
		
	}
}
