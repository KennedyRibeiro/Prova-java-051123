public class Funcionario {
    private String nome;
    private int anosDeExperiencia;
    private char funcao;
    private char nivel;
    private String endereco;
    private String telefone;
    private String cidade;
    private double salario;
    private int projetosExecutados;
    private char situacao;

    public Funcionario(String nome, int anosDeExperiencia, char funcao, String endereco,
                       String telefone, String cidade, double salario, int projetosExecutados,
                       char situacao) {
        this.nome = nome;
        this.anosDeExperiencia = anosDeExperiencia;
        this.funcao = funcao;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cidade = cidade;
        this.salario = salario;
        this.projetosExecutados = projetosExecutados;
        this.situacao = situacao;
        calcularNivel();
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
        calcularNivel();
    }

    private void calcularNivel() {
        if (anosDeExperiencia >= 0 && anosDeExperiencia <= 3) {
            nivel = 'J'; // Júnior
        } else if (anosDeExperiencia >= 4 && anosDeExperiencia <= 6) {
            nivel = 'P'; // Pleno
        } else {
            nivel = 'S'; // Sênior
        }
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Nível: " + nivel);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cidade: " + cidade);
        System.out.println("Salário: " + salario);
        System.out.println("Projetos Executados: " + projetosExecutados);
        System.out.println("Situação: " + situacao);
    }

    public void finalizarProjeto() {
        projetosExecutados++;
    }
    
        public char getNivel() {
        return nivel;
    }

    public char getSituacao() {
        return situacao;
    }
}

