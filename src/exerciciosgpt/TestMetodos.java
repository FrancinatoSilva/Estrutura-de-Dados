package exerciciosgpt;

public class TestMetodos {
    public static void main(String[] args) {

    VetorDia1 vet = new VetorDia1(12);


    vet.adiciona("pao");
    vet.adiciona("suco");
    vet.adiciona("arroz");
    vet.adiciona("manteiga");
    vet.adiciona("alho");
    vet.adiciona("melancia");
    vet.adiciona("limao");
    vet.adiciona("maracuja");
    vet.adiciona("chocolate");
    vet.adiciona("sal");
    vet.adiciona("ovo");
    vet.adiciona("agua");

    System.out.println(vet.buscarElemento(0));
    System.out.println(vet.verificarExistencia("suco"));




    }
}
