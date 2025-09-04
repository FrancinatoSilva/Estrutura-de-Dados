package test;

import array.Vetor;

public class Aula04 {
    public static void main(String[] main) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}
