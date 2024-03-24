// Classe Principal no package view
package view;

import controller.ConverteController;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        ConverteController controller = new ConverteController();

        // Solicita ao usuário inserir um número decimal
        System.out.println("Insira um número decimal (limite máximo 1000):");
        int decimal = scanner.nextInt();

        // Verifica se o número está dentro do limite
        if (decimal < 0 || decimal > 1000) {
            System.out.println("Número fora do limite permitido.");
        } else {
            // Converte decimal para binário e exibe o resultado
            String binario = controller.decToBin(decimal);
            System.out.println("O número " + decimal + " em binário é: " + binario);
        }
    }
}
