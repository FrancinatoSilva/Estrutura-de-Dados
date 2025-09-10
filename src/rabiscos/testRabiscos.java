package rabiscos;

import java.util.Scanner;

public class testRabiscos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao testRabisco, abaixo informe o temanho do vetor");
        VetorRabisco vetor = new VetorRabisco(sc.nextInt());

        System.out.print("Insira algum elemento no vetor:");
        vetor.adicionar(sc.nextLine());



        sc.close();
    }
}
