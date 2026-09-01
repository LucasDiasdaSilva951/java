public class pessoas {
    public static class Pessoa {
        private String nome;
        private int idade;
    public String obterNomePessoa() {
        return nome;
    }
    public void alterarNomeAluno(String nome) {
        this.nome = nome;
    }
    public int obterIdade () {
        return idade;
    }
    public void alterarIdadeAluno (int idade) {
        this.idade = idade;
    }
    }
    public static class Curso {
        private String curso;
        public String obterCurso() {
            return curso;
        }
        public void alterarCursoAluno(String curso) {
            this.curso = curso;
        }
        public static String estudar() {
            return " está estudando ";
        }
    }
    public static void main(String[] args) {
        System.out.println();
        Pessoa aluno = new Pessoa();
        Curso curso = new Curso();
        aluno.nome = "Lucas";
        aluno.idade = 20;
        curso.curso = "Engenharia de Software";
        System.out.println("O " + aluno.obterNomePessoa() + Curso.estudar() + curso.obterCurso() + ".");
        System.out.println();
    }
}
