// Classe ConverteController no package controller
package controller;

import br.edu.fateczl.pilhainteiros.Pilha;

public class ConverteController {
    private Pilha pilha;

    public ConverteController() {
        pilha = new Pilha();
    }

    // Método para converter decimal para binário
    public String decToBin(int decimal) {
        StringBuilder binario = new StringBuilder();

        // Caso o número decimal seja 0
        if (decimal == 0) {
            return "0";
        }

        // Realiza as divisões sucessivas e empilha os restos
        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto);
            decimal /= 2;
        }

        // Desempilha os restos e forma a representação binária
        while (!pilha.isEmpty()) {
            try {
                binario.append(pilha.pop());
            } catch (Exception e) {
                e.printStackTrace(); // Trate melhor os erros em um cenário real
            }
        }

        return binario.toString();
    }
}
