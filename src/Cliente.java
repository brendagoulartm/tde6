public class Cliente {
    private String nome;
    private String telefone;
    private String email;

    // Construtor
    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Cliente [Nome=" + nome + ", Telefone=" + telefone + ", Email=" + email + "]";
    }
}
