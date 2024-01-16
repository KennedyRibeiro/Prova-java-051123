public class Prova0512 {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("Kennedy", 2, 'D', "Rua João Adami", "998930088", "SRS", 5000.0, 3, 'A');
        Funcionario funcionario2 = new Funcionario("Anna Laura", 5, 'O', "Rua Irene Castelo", "997586651", "P.A", 6000.0, 5, 'A');

        System.out.println("Dados do Funcionário 1:");
        funcionario1.mostrarDados();

        System.out.println("\nDados do Funcionário 2:");
        funcionario2.mostrarDados();

        Projeto projeto1 = new Projeto(funcionario1, 'D');
        Projeto projeto2 = new Projeto(funcionario2, 'M');

        projeto1.iniciarProjeto();
        projeto1.encerrarProjeto();

        projeto2.iniciarProjeto();
        projeto2.encerrarProjeto();

        System.out.println("\nDados do Funcionário 1 após encerrar o projeto 1:");
        funcionario1.mostrarDados();

        System.out.println("\nDados do Funcionário 2 após encerrar o projeto 2:");
        funcionario2.mostrarDados();
    }
}
