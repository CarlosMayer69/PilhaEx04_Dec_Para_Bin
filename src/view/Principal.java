// Classe Principal no package view
package view;

import controller.ConverteController;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        ConverteController controller = new ConverteController();

        // Solicita ao usu�rio inserir um n�mero decimal
        System.out.println("Insira um n�mero decimal (limite m�ximo 1000):");
        int decimal = scanner.nextInt();

        // Verifica se o n�mero est� dentro do limite
        if (decimal < 0 || decimal > 1000) {
            System.out.println("N�mero fora do limite permitido.");
        } else {
            // Converte decimal para bin�rio e exibe o resultado
            String binario = controller.decToBin(decimal);
            System.out.println("O n�mero " + decimal + " em bin�rio �: " + binario);
        }
    }
}
