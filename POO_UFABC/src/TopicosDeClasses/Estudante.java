package TopicosDeClasses;

/**
 * Modelo de estudante universitario.
 */
public class Estudante {
    private String nome;
    private String ra;
    private double[] notas;

    //Construtor provado é bom para criar classes estaticas
    /**
     * Construtor de Estudante.
     * @param nome O nome completo do estudante.
     * @param ra O Registro acadêmico no formato da UFABC.
     * @param notas A lista de notas obtidas pelo estudante.
     */
    public Estudante(String nome, String ra, double[] notas) {
        this.nome=nome;
        this.ra = ra;
        this.notas = notas;
    }

    /**
     * Valida o formato de RA conforme regras de UFABC.
     * @param ra o RA.
     */
    private void validaRa(String ra) {
        if (!ra.matches("//d{11}")) {
            throw new IllegalArgumentException("RA deve ter 11 dígitos");
        }
    }

    /**
     * Consulta o nome do estudante.
     *
     * @return o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do estudante.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * Soma todas as notas do Array notas
     *
     * @return o somatório das notas
     */
    private double somaNOtas() {
        double sum = 0.0;

        for (var nota:notas) {
            sum += nota;
        }
        return sum;
    }

    /**
     * Consulta a média atualizada do aluno.
     *
     * @return média do aluno
     */
    public double getMedia() {
        if (notas.length ==0) {
            return 0.0;
        }
        return somaNOtas() / notas.length;
    }
}
