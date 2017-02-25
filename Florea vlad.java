package sesion2;

public class Main {

	public static void main(String[] args) {
		//
		// In acest exemplu vom exersa lucrul cu primitivele din limbajul Java, cu operatiile de baza, cu conditionalele, cu structurile repetitive si cu vectorii
		
				//Exemplul 1: Declarati 2 numere intregi si afisati suma lor
				
		int nr1=7;
		int nr2=3;
		int sum=nr1+nr2;
		System.out.println(sum);
				
				//Exemplul 2: Declarati 4 numere reale si afisati rezultatul inmultirii lor
				
				
				//Exemplul 2b: Declarati 2 numere intregi si afisati catul si restul impartirii lor
				
				
				//Exemplul 3: Declarati 2 numere intregi pozitive si unul negativ si afisati rezultatul adunarii primelor 2, inmultit cu al treilea numar (cel negativ)
				int nr10=5;
				int nr11=7;
				int nr12=-9;
				System.out.println((nr10+nr11)*nr12);
		
				//Exemplul 4: Declarati 2 variabile de tip String si concatenati-le, astfel incat sa afisati textul "Ma numesc " + nume + " si invat " + curs
				 
				String nume="Vlad";
				String curs="java";
				System.out.println("Ma numesc " + nume + " si invat " + " java");
				
				
				//Exemplul 5: Declarati 2 numere intregi si afisati-l pe cel mai mare
				int nr13=2012;
				int nr14=1234123;
				if(nr13>nr14)
				{
					System.out.println("Numarul mai mare este" + nr13);
				}
				else{
					System.out.println("Numarul mai mare este " + nr14);
				}
				
				
				//Exemplul 5b: Declarati 2 numere intregi pozitive care reprezinta lungimile laturilor unui triunghi dreptunghic. Calculati si afisati aria acestuia
				
				int cateta1=9;
				int cateta2=25;
				System.out.println("Aria triunghiuliu este " + cateta1*cateta2/2);
				
				//Exemplul 6: Declarati 2 numere intregi si afisati textul "Numarul " + nr1 " este mai mare decat numarul " + nr2, in functie de relatia dintre cele 2
				int num1=1012;
				int num2=1012;
				if(num1>num2){
					System.out.println("Numarul " + num1 + " este mai mare decat numarul " + num2);
				}
					else{
						System.out.println("NUmarul " + num2 + " este mai mare decat numarul " + num1);
				}
				
				
				//Exemplul 7: Declarati o variabila de tip boolean care sa fie true daca cele doua numere declarate in exemplul anterior sunt egale
				
				boolean vlad=false;
				
				if(num1==num2){
					vlad=true;
				}
				
				System.out.println(vlad);
				
				//Exemplul 8: Determinati si afisati rezultatul ridicarii la putere a doua numere intregi (declarate de voi), folosind operatiunea "for"
		        //int y=5;
				//int z=4;
				//int rezultat =1;
				
			//de refacut
				
				
				
				//Exemplul 8b: Declarati un numar intreg si gasiti si afisati, printr-o instructiune repetitiva si una de decizie, cel mai mare numar par, mai mic sau egal cu cel initial
				int nrVer=125;
				int y;
				for(int x1=1;x1<=nrVer;x1++){
					if(x1%2==0)
					{
						y=x1;
						if(y>=nrVer-2){
						System.out.println("cel mai mare numar par este " + y);
						}
					}
					
				}
				
				//Exemplul 9: Declarati 2 numere intregi si verificati rezultatul adunarii lor astfel: daca este 4, atunci afisati "Numerele sunt bune", daca este 8, afisati "Numerele sunt okay", iar in orice alt caz afisati "Numere nu sunt bune"
				int suma1=3+5;
				switch(suma1){
				case 4://echivalent cu if(suma1==4)
					System.out.println("numerele sunt bune");
					break;
				case 8: //echivalent cu if(suma==8)
					System.out.println("NUmerele sunt ok");
					break;
					default:
				}
				
				
				//Exemplul 10: Declarati un vector de numere intregi de dimensiune 8. Adaugati, utilizand o instructiune repetitiva, numerele de la 1 la 8, in ordine crescatoare
				int[] x=new int[8];
				for(int i=0;i<8;i++){
					x[i]=i+1;
					System.out.println(x[i]);
				}
				
					
				//Exemplul 10b: Declarati un vector cu 4 elemente (2 negative si 2 pozitive), calculati si afisati suma elementelor pozitive
				
				int[] v=new int[4];
				v[0]=-1;
				v[1]=17;
				v[2]=13;
				v[3]=-69;
				int sum1=0;
				for(int i=0;i<4;i++){
					if(v[i]>0){
						sum1=sum1+v[i];
					}
					
				}
					System.out.println(" suma este " + sum1);
					
				//Exemplul 10c: Afisati vectorul declarat anterior. Apoi afisati-l in ordinea inversa a elementelor (utilizand o instructiune repetitiva)
				for(int i=3;i>=0;i--){
					System.out.println("v["+i+"]= "  + v[i]);
				}
					
					
				//Exemplul 11: Declarati un vector de numere reale de dimensiune 4. Adaugati manual 4 elemente in acest vector si afisati-l.
				double[] v1=new double[4];
				v1[0]=56.84;
				v1[1]=31.5;
				v1[2]=2.9;
				v1[3]=12.98;
				for(int i=0;i<=3;i++)
				{
					System.out.println( "v1["+i+"]=" +  v1[i]);
				}
				//Exemplul 12: Cautati si afisati cel mai mare element din vectorul declarat anterior.
				double max=v1[0];
				for(int i=0;i<4;i++){
					if(v1[i]>max){
						max=v1[i];
					}
				}
				System.out.println("maximul este " + max);
				
				
				//Exemplul 13: Declarati un vector de obiecte de tip String, de orice dimensiune, populati-o cu cuvinte random si, utilizand o instructiune repetitiva, adaugati, la finalul fiecarui cuvant, sufixul "ului"
				//{cal masin calculator  monitor}--{calu-ului masina-ului calculator-ului]} 
				String[] v2=new String[4];
				v2[0]="cal";
				v2[1]="masina";
				v2[2]="calculator";
				v2[3]="monitor";
				for(int i=0;i<4;i++){
					System.out.println(v2[i] + "ului");
					
				}
				
				//Exemplul 14: Declarati doi vectori de minim 3 numere intregi si, utilizand instructiuni repetitive si decizionale, afisati pe ecran cate elemente au in comun
				int v3[]=new int[3];
				v3[0]=22;
				v3[1]=12;
				v3[2]=1;
				int v4[]=new int[3];
				v4[0]=18;
				v4[1]=22;
				v4[2]=1;
				int gasit=0;
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++)
					{
						if(v3[i]==v4[j]){
							gasit=gasit+1;
							
						}
					}
				}
				System.out.println("un element comun este " + gasit);
						
						
				
				
				
				//Exemplul 15: Declarati o matrice patratica de numere intregi (2,2) si populati-o cu valori de 0. Apoi setati valoarea de pe pozitia 1,2 sa fie 1
		//Rezolvare exercitiul 1
				
				int[][] c=new int[2][2];
				for(int k=0;k<2;k++){
					for(int q=0; q<2;q++){
						c[k][q]=0;
						c[0][1]=1;
						System.out.println(c[k][q]);
					}
				}
				
		
		
		
		
		
		
		
		
		
	}

}
