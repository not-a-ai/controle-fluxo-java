package Contador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		int parametroUm = 0;
		int parametroDois = 0;
		try {
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();
			try {
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				exception.getMessage();
			}
		
		} catch(InputMismatchException e) {
			System.out.println("Os campos devem ser numéricos.");
		}
		
	}
		
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i < contagem; i++) {
			System.out.println("Imprimindo o número " + (i+1));
		}
	}
}