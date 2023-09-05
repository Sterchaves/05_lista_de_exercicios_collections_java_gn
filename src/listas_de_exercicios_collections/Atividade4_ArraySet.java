package listas_de_exercicios_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade4_ArraySet {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		HashSet<Double> notas = new HashSet<Double>(); //Tentei colocar apenar o "set", mas só aceitou o harshset.
		int number;
		boolean encontrado = false;
		
		while(notas.size() < 10) {
		System.out.println("\nDigite um número: ");
		notas.add(scanner.nextDouble());	
		
		}
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		number = scanner.nextInt();
		
        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()) {
            Double nota = iterator.next();
            if (number == nota) {
                System.out.println("O número " + number + " está localizado na posição.");
                encontrado = true;
            }
        }
		
		if(!encontrado) {
			System.out.println("\nO número "  +number+ " não foi encontrado!");
		};
	}
}
