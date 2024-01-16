public class Projeto {
    private Funcionario desenvolvedor;
    private char nivel;
    private boolean aprovado;
    private boolean finalizado;

    public Projeto(Funcionario desenvolvedor, char nivel) {
        this.desenvolvedor = desenvolvedor;
        this.nivel = nivel;
        this.aprovado = verificarAprovacao();
        this.finalizado = false;
    }

    private boolean verificarAprovacao() {
        if (desenvolvedor.getNivel() == 'S' && nivel == 'D') {
            return true;
        } else if (desenvolvedor.getNivel() == 'P' && nivel == 'M') {
            return true;
        } else return desenvolvedor.getNivel() == 'J' && nivel == 'F';
    }

    public void iniciarProjeto() {
        if (desenvolvedor.getSituacao() == 'A' && aprovado) {
            System.out.println("Projeto iniciado com sucesso.");
        } else {
            System.out.println("Não foi possível iniciar o projeto. Verifique as condições.");
        }
    }

    public void encerrarProjeto() {
        finalizado = true;
        desenvolvedor.finalizarProjeto();
    }
}
