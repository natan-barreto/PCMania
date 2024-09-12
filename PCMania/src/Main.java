import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Dados do cliente
        System.out.println("Informe o nome do cliente: ");
        String nomedoCliente = entrada.nextLine();

        System.out.println("Informe o CPF do cliente: ");
        long cpfdoCliente = entrada.nextLong();

        Cliente cliente = new Cliente(nomedoCliente, cpfdoCliente);

        Computador[] computadores = new Computador[3];
        computadores[0] = new Computador("Positivo", 43,
                new SistemaOperacional( 32, "Linux Ubuntu"),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new MemoriaUSB("Pen-drive", 16));

        computadores[1] = new Computador("Acer", 43+1234,
                new SistemaOperacional(64,"Windows 8"),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new MemoriaUSB("Pen-drive", 32));

        computadores[2] = new Computador("Vaio", 43+5678,
                new SistemaOperacional(64,"Windows 10"),
                new HardwareBasico[] {
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new MemoriaUSB("HD Externo", 1000));





        Computador[] carrinho = new Computador[10];
        int indice = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Escolha uma promoção (1, 2, 3) ou 0 para finalizar: ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                carrinho[indice++] = computadores[opcao - 1];
            }
        }

        System.out.println("Cliente: " + cliente.nome + " CPF: " + cliente.cpf);
        for (Computador pc : carrinho) {
            if (pc != null) {
                pc.mostraPCConfigs();
            }
        }

        System.out.println("Total da compra: R$" + cliente.calculaTotalCompra(carrinho));
    }
}