package ola_mundo;

import java.util.Scanner;

public class Eclipse_Novo {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 //tentando algo
			
	        int op= 0;
	        float j, c, i,n;
	        
	        
			do {
				
				System.out.print("[1.Juros]  ");
				System.out.print("[2.Capital]  ");
				System.out.print("[3.Taxa]  ");
				System.out.print("[4.Prazo]  ");
				System.out.print("[5.Sair]\n");
		
				System.out.print("\nOpção = ");
				op = entrada.nextInt();
				
				if(op == 1) { //j = c.i.n/100
					System.out.println("\t\t\t Juros Simples - Juros\n");
					System.out.println("Formula: J=c.i.n/100");
					System.out.print("\nCapital: R$ ");
					c= entrada.nextFloat();
					System.out.print("Taxa: ");
					i= entrada.nextFloat();
					System.out.print("Periodo: ");
					n= entrada.nextFloat();
					
					j= c*i*n/100;
					
					System.out.printf("Juros de: R$ %.2f ",j);
					/*System.out.println(".......................................................................");
					System.out.println(".Capital: R$ "+ c + "| Taxa: "+ i+"%"+ "| Periodo: "+ n + "| Total de Juros: "+ j+" .");
					System.out.println(".......................................................................");
					*/
					System.out.println("\n\n");
				}
			}
			while( op != 5);
			entrada.close();
			
			}
	}					
					
					
					
					
					


