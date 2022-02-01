package bloco1;

import java.util.Scanner;

public class IRteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int opc;
		
		IR ir1 = new IR(0,0,0,0,0,0,0);
		
		ir1.menu();
		opc = leia.nextInt();
		
		switch (opc)
		{
		case 1:
			
			ir1.simples();
			ir1.calculo();
			ir1.total();
			
			
			
		
		break;
		
		case 2:
			
			ir1.detalhada();
			ir1.calculo();
			ir1.total();
			
		}
		
		
		
		
	}
	
	

	
	
	
	
	
	
	
}
