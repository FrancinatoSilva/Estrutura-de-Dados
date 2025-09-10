package rabiscos;

public class VetorRabisco {
    private String[] elementos;
    private int tamanho;

    public VetorRabisco(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.out.println("Não é possível adionar mais elementos");
        return false;
    }


}
