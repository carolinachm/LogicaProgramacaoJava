/*
 * O que é um vetor? Vetor é uma variavel com a capacidade de armazenar varios registros, varias informaçoes 
 */

public class Vetor {

    void main() {

        // Vetor ou array

        String[] nomes = { "Ana", "Fernando", "Paulo", "Carolina" };

        // Exibir dados
        // System.out.println(nomes[0]);
        // System.out.println(nomes[1]);
        // System.out.println(nomes[2]);
        // System.out.println(nomes[3]);

        for (int indice = 0; indice < 4; indice++) {
            System.out.println(nomes[indice]);
        }

    }

}
