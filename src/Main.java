public class Main {
    public static void main(String[] args) {
        // Criando um vetor com capacidade para 20 clientes
        VetorClientes vetor = new VetorClientes(20);

        // Inserindo 30 clientes no vetor
        for (int i = 1; i <= 30; i++) {
            Cliente cliente = new Cliente("Cliente " + i, "0000-000" + i, "cliente" + i + "@exemplo.com");
            vetor.adicionar(cliente);
        }

        // Alterando um cliente na posição 5
        Cliente novoCliente = new Cliente("Cliente Alterado", "1111-1111", "alterado@exemplo.com");
        vetor.alterarCliente(5, novoCliente);

        // Removendo um cliente da posição 3
        vetor.removerCliente(3);

        // Listando todos os clientes armazenados
        vetor.listarClientes();

        // Buscando um cliente pelo nome
        Cliente clienteBuscado = vetor.buscarClientePorNome("Cliente 10");
        if (clienteBuscado != null) {
            System.out.println("Cliente encontrado: " + clienteBuscado);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Filtrando clientes por domínio de email
        System.out.println("Clientes com email que termina em '@exemplo.com':");
        vetor.filtrarClientesPorDominio("@exemplo.com");
    }
}
