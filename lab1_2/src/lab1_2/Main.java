package lab1_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab1_2 : ±Ë¿±º≠");
		Scanner s=new Scanner(System.in);
		int i[]=new int[10];
		for(int a=0;a<10;a++) {
			i[a]=s.nextInt();
		}
		System.out.println("Serch Integer:");
		int b=s.nextInt();
		for(int a=0;a<10;a++) {
			if (i[a]==b) {
				System.out.println("Integer's index:"+a);
				break;
			}
			if(a==9) {
				System.out.println("-1");
			}
		}
	}

}
