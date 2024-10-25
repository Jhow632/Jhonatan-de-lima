public class Turma {
    // atributos
    private String nome;
    private String curso;
    private int quantidadeDeAluno;
    private int serie;
    // método construtor
    public Turma(String n, String c, int q, int s) {
    nome = n;
    curso = c;
    quantidadeDeAluno = q;
    serie = s;
    }
    // métodos de acesso
    public String getNome() {
    return nome;
    }
    public String getCurso() {
    return curso;
    }
    public int getQuantidadeDeAluno() {
    return quantidadeDeAluno;
    }
    public int getSerie() {
    return serie;
    }
    // métodos modificadores
    public void setNome(String n) {
    nome = n;
    }
    public void setCurso(String c) {
    curso = c;
    }
    public void setQuantidadeDeAluno(int q) {
    quantidadeDeAluno = q;
    }
    public void setSerie(int s) {
    serie = s;
    }
}