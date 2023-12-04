package Tarea1y2;

import java.util.Scanner;

public class Tarea1v2 {

public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("(V2) Ingrese un número de lados: ");
		int n= scan.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1) {
					System.out.print("*");
				}
				if(j==0 || j==n-1) { //else if
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			
			/*
			
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
			*/
			
		}

	}

}
