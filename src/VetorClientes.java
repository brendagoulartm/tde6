public class VetorClientes {
    private Cliente[] clientes;
    private int tamanhoAtual;

    // Construtor que define o tamanho fixo do vetor
    public VetorClientes(int capacidade) {
        this.clientes = new Cliente[capacidade];
        this.tamanhoAtual = 0;
    }

    // Método para adicionar um cliente ao vetor
    public boolean adicionar(Cliente cliente) {
        if (tamanhoAtual < clientes.length) {
            clientes[tamanhoAtual] = cliente;
            tamanhoAtual++;
            return true;
        } else {
            System.out.println("Vetor está cheio. Não é possível adicionar mais clientes.");
            return false;
        }
    }

    // Método para listar todos os clientes
    public void listarClientes() {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(clientes[i]);
        }
    }

    // Método para buscar cliente pelo nome
    public Cliente buscarClientePorNome(String nome) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (clientes[i].getNome().equalsIgnoreCase(nome)) {
                return clientes[i];
            }
        }
        return null; // Cliente não encontrado
    }

    // Método para filtrar clientes por domínio de email
    public void filtrarClientesPorDominio(String dominio) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (clientes[i].getEmail().endsWith(dominio)) {
                System.out.println(clientes[i]);
            }
        }
    }

    // Método para alterar um cliente em uma posição específica
    public boolean alterarCliente(int indice, Cliente novoCliente) {
        if (indice >= 0 && indice < tamanhoAtual) {
            clientes[indice] = novoCliente;
            return true;
        } else {
            System.out.println("Índice inválido.");
            return false;
        }
    }

    // Método para remover um cliente de uma posição específica
    public boolean removerCliente(int indice) {
        if (indice >= 0 && indice < tamanhoAtual) {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            clientes[tamanhoAtual - 1] = null;
            tamanhoAtual--;
            return true;
        } else {
            System.out.println("Índice inválido.");
            return false;
        }
    }
}
