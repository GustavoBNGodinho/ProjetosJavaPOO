package ExemplosPoo.Loja;

public class Cliente {
    private String nome;
    private String email;
    private boolean fidelidade;
    public Cliente(String email, String nome) {
        this.email = email;
        this.nome = nome;
        this.fidelidade = fidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void fidelizar() {
        fidelidade = true;
    }

    public boolean isFidelidade() {
        return fidelidade;
    }

    public void desfidelizar() {
        fidelidade = false;
    }
}
