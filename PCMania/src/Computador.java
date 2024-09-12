public class Computador {

    public String marca;
    public float preco;
    Cliente cliente;
    MemoriaUSB memoriaUSB;
    HardwareBasico[] hardwareBasico;
    SistemaOperacional sistemaOperacional;

    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBasico[] hardwareBasico, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
        this.hardwareBasico = hardwareBasico;
        this.memoriaUSB = memoriaUSB;
    }


    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo + " bits");

        for (HardwareBasico hw : hardwareBasico) {
            if (hw != null) {
                System.out.println("Hardware: " + hw.nome + " - Capacidade: " + hw.capacidade);
            }
        }
        if (memoriaUSB != null) {
            System.out.println("Memória USB: " + memoriaUSB.nome + " - Capacidade: " + memoriaUSB.capacidade + "Gb");
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
