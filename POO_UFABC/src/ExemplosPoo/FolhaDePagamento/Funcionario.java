package ExemplosPoo.FolhaDePagamento;
//todo: validar as propriedades quando necessário.
public class Funcionario {
    protected String nomeCompleto;
    protected String cpf;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected double planoSaude;
    protected double valeTransporte;
    protected double valeAlimentação;
    protected double previdencia;
    protected double salarioBase;

    public Funcionario(String nomeCompleto, String cpf, String telefone, String email,
                       String endereco, double planoSaude, double valeTransporte, double valeAlimentação, double previdencia, double salarioBase) {
        this.nomeCompleto = nomeCompleto;
        setCpf(cpf);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.planoSaude = planoSaude;
        this.valeTransporte = valeTransporte;
        this.valeAlimentação = valeAlimentação;
        this.previdencia = previdencia;
        this.salarioBase = salarioBase;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null & !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public double getValeAlimentação() {
        return valeAlimentação;
    }

    public void setValeAlimentação(double valeAlimentação) {
        this.valeAlimentação = valeAlimentação;
    }

    public double getPrevidencia() {
        return previdencia;
    }

    public void setPrevidencia(double previdencia) {
        this.previdencia = previdencia;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    protected double getAdicionais() {
        return getValeAlimentação();
    }

    protected  double getDescontos() {
        return  getValeTransporte() + getPlanoSaude() + getPrevidencia();
    }

    protected double getSalarioBruto() {
        return getSalarioBase() + getAdicionais();
    }

    protected double getSalarioLiquido() {
        return  getSalarioBruto() - getDescontos();
    }

    @Override
    public String toString() {
        return String.format("nome: %s\n", getNomeCompleto())
                + String.format("CPF: %s\n", getCpf())
                + String.format("Telefone: %s\n", getTelefone())
                + String.format("Emial: %s\n", getEmail())
                + String.format("Endereço: %s\n", getEndereco())
                + String.format("Plano de Saude: %.2f\n", getPlanoSaude())
                + String.format("Vale Transporte: %.2f\n", getValeTransporte())
                + String.format("Vale alimentação: %.2f\n", getValeAlimentação())
                + String.format("Salario Base: %.2f\n", getSalarioBase())
                + String.format(": %.2f\n", getEndereco());
    }
}

