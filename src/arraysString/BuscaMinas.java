package arraysString;

import java.util.Scanner;

public class BuscaMinas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int filas = in.nextInt(), columnas = in.nextInt();
		while (filas!=0 || columnas!=0) {
			char[][] tablero = new char[filas][columnas];
			for (int i = 0; i < filas; i++) {
				tablero[i] = in.next().toCharArray();
			}
			int posX = in.nextInt(), posY = in.nextInt();
			if (tablero[posX-1][posY-1]=='*') {
				System.out.println("ES BOMBA");
			}else
				System.out.println("NO ES BOMBA");
			System.out.println("---");
			
			filas = in.nextInt(); 
			columnas = in.nextInt();
		}

	}

}
