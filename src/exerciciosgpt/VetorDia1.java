package exerciciosgpt;

public class VetorDia1 {

    private String[] elementos;
    private int tamanho;

    public VetorDia1(int capacidade) {
        // Instancia do vetor elementos, atributo da classe VetorDia1
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        System.out.println("Não é possível adicionar mais elementos.");
        return false;

    }

    public String buscarElemento(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int verificarExistencia(String elemento) {
        for (int i=0; i<this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)) {
                return i;
            }
        }
        return -1;
    }
}