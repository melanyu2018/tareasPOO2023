package Tarea1y2;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Ingrese un número de lados: ");
		int n= scan.nextInt();
		
		for(int i=0;i<n;i++) {
			
			if(i==0 || i==n-1) {
				for(int j=0;j<n;j++) {
					System.out.print("*");
				}
			}
			
			else {
				for(int j=0;j<n;j++) {
					if(j==0 || j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.print("\n");
			
		}

	}

}
