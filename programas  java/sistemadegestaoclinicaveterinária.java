import java.util.ArrayList;

public class sistemadegestaoclinicaveterinária {
    public static void main(String[] args) {

    }
}

abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone; }
    public String obterNome () {
        return nome;
    }
    public String obterCpf() {
        return cpf;
    }
    public String obterTelefone() {
        return telefone;
    }
    public void alterarPessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public abstract void exibirInformacoes();
}

class Cliente extends Pessoa {
    private ArrayList<Animal> animais;
    
}

class Veterinario extends Pessoa {

}

abstract class Animal {

    
}

class Cachorro extends Animal {

}

class Gato extends Animal {

}

class Consulta {

}

class Clinica {

}