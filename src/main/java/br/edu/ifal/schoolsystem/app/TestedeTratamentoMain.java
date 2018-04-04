package br.edu.ifal.schoolsystem.app;

public class TestedeTratamentoMain {
	public static void main (String[] args) {
		
		try {
			int n1 =  5;
			int n2 = 0;
			int n3;
			n3 = n1/n2;
			System.out.println("Ressultado:" + n3);
		} catch (Exception e) {
			System.out.println("A divisão por zero não é definida");
		}
		
		System.out.println("..Continuando");

	}
}
