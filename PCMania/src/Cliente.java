public class Cliente {
    public String nome;
    public long cpf;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(Computador[] computadores) {
        float total = 0;
        for (Computador pc : computadores) {
            if (pc != null) {
                total += pc.preco;
            }
        }
        return total;
    }
}
