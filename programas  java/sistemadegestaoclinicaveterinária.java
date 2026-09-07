import java.util.ArrayList;

public class sistemadegestaoclinicaveterinária {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Clínica Amigo Animal");
        
        Cliente cliente1 = new Cliente("Lucas", "993.127.445-31", "11942460928");
        clinica.cadastrarCliente(cliente1);
        
        Cliente cliente2 = new Cliente("Gabriel", "443.293.170-80", "1122468991");
        clinica.cadastrarCliente(cliente2);

        Cliente cliente3 = new Cliente("Mariana", "544.370.291-40", "1165329047");
        clinica.cadastrarCliente(cliente3);

        Veterinario veterinario1 = new Veterinario("Carlos", "333.987.546-90", "1136789017", "CRMV-SP-12345", "Clínico Geral");
        clinica.cadastrarVeterinario(veterinario1);

        Veterinario veterinario2 = new Veterinario("Ana", "887.223.579-12", "1133960911", "CRMV-SP-67890", "Cirurgia Veterinária");
        clinica.cadastrarVeterinario(veterinario2);

        Animal animal1 = new Cachorro("Thor", 5, 28.5, cliente1, "Labrador");
        cliente1.adicionarAnimal(animal1);

        Animal animal2 = new Gato("Luna", 3, 4.2, cliente1, true);
        cliente1.adicionarAnimal(animal2);

        Animal animal3 = new Cachorro("Max", 7, 19.8, cliente2, "Beagle");
        cliente2.adicionarAnimal(animal3);
        
        Animal animal4 = new Gato("Mel", 2, 3.7, cliente2, false);
        cliente2.adicionarAnimal(animal4);

        Animal animal5 = new Cachorro("Bob", 4, 12.3, cliente3, "Poodle");
        cliente3.adicionarAnimal(animal5);

        Consulta consulta1 = new Consulta(1, animal1, veterinario1, "10/09/2026", "09:00", "Vacinação", 120.00);
        clinica.cadastrarConsulta(consulta1);
        consulta1.realizarConsulta("Vacinação aplicada com sucesso.");

        Consulta consulta2 = new Consulta(2, animal2, veterinario2, "10/09/2026", "10:30", "Avaliação de saúde", 150.00);
        clinica.cadastrarConsulta(consulta2);
        consulta2.realizarConsulta("Animal saudável.");

        Consulta consulta3 = new Consulta(3, animal3, veterinario1, "11/09/2026", "14:00", "Problemas digestivos", 200.00);
        clinica.cadastrarConsulta(consulta3);
        consulta3.realizarConsulta("Tratamento iniciado.");

        Consulta consulta4 = new Consulta(4, animal4, veterinario2, "11/09/2026", "15:30", "Consulta de rotina", 100.00);
        clinica.cadastrarConsulta(consulta4);

        Consulta consulta5 = new Consulta(5, animal5, veterinario1, "12/09/2026", "11:00", "Problema na pata", 180.00);
        clinica.cadastrarConsulta(consulta5);

        System.out.println("===== CLIENTES =====");
        clinica.listarClientes();

        System.out.println("\n===== VETERINÁRIOS =====");
        clinica.listarVeterinarios();

        System.out.println("\n===== CONSULTAS =====");
        clinica.listarConsultas();

        System.out.println("\n===== ESTATÍSTICAS =====");
        clinica.exibirEstatisticas();

        System.out.println("\n===== SONS DOS ANIMAIS =====");
        clinica.ouvirAnimais();

        System.out.println("\n===== TESTE DE BUSCAS =====");

        Cliente clienteEncontrado = clinica.buscarCliente("993.127.445-31");

        if (clienteEncontrado != null) {
        System.out.println("Cliente encontrado:");
        clienteEncontrado.exibirInformacoes();
        } else {
        System.out.println("Cliente não encontrado.");
        }


        Veterinario veterinarioEncontrado = clinica.buscarVeterinario("CRMV-SP-67890");

        if (veterinarioEncontrado != null) {
        System.out.println("Veterinário encontrado:");
        veterinarioEncontrado.exibirInformacoes();
        } else {
        System.out.println("Veterinário não encontrado.");
        }


        Consulta consultaEncontrada = clinica.buscarConsulta(3);

        if (consultaEncontrada != null) {
        System.out.println("Consulta encontrada:");
        consultaEncontrada.exibirConsulta();
        } else {
        System.out.println("Consulta não encontrada.");
        }

        System.out.println("\n===== BUSCAR CLIENTE =====");

        Cliente clienteaEncontrar = clinica.buscarCliente("993.127.445-31");

        if (clienteaEncontrar != null) {
            clienteaEncontrar.exibirInformacoes();
        } else {
            System.out.println("\033[31mCliente não encontrado.\033[m");
        }

        System.out.println("===== BUSCAR VETERINÁRIO =====");

        Veterinario veterinarioaEncontrar = clinica.buscarVeterinario("CRMV-SP-67890");

        if (veterinarioaEncontrar != null) {
            veterinarioaEncontrar.exibirInformacoes();
        } else {
            System.out.println("\033[31mVeterinário não encontrado.\033[m");
        }

        System.out.println("===== BUSCAR CONSULTA =====");

        Consulta consultaAEncontrar = clinica.buscarConsulta(3);

        if (consultaAEncontrar != null) {
            veterinarioaEncontrar.exibirInformacoes();
        } else {
            System.out.println("\033[31mConsulta não encontrada.\033[m");
        }

        System.out.println("===== CANCELAR CONSULTA =====");

        boolean cancelada = clinica.cancelarConsulta(5);

        if (cancelada) {
            System.out.println("\033[32mConsulta cancelada com sucesso!\033[m");
            System.out.println("\n===== CONSULTAS APÓS CANCELAMENTO =====");
            clinica.listarConsultas();
        } else {
            System.out.println("\033[31mConsulta não encontrada.\033[m");
        }   
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
    public Cliente (String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.animais = new ArrayList<>();
    }

    @Override 
    public void exibirInformacoes() {
        System.out.println("Nome da pessoa: " + this.obterNome());
        System.out.println("CPF da pessoa: " + this.obterCpf());
        System.out.println("Telefone da pessoa: " + this.obterTelefone());
        System.out.println();
    }
    
    public void adicionarAnimal (Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal (Animal animal) {
        animais.remove(animal);
    }

    public Animal buscarAnimal (String nome) {
        for (Animal animal : animais) {
            if (animal.obterNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    public void listarAnimais() {
        int cont = 1;
        for (Animal animal : animais) {
            System.out.println("Animal " 
            + cont + ": " + animal);
            cont++;
        }
    }

    public ArrayList<Animal> obterAnimais() {
        return animais;
    }
}

class Veterinario extends Pessoa {
    private String crmv;
    private String especialidade;

    public Veterinario(String nome, String cpf, String telefone, String crmv, String especialidade) {
        super (nome, cpf, telefone);
        this.crmv = crmv;
        this.especialidade = especialidade;
    }
    
    public String obterCrmv() {
        return crmv;
    }

    public String obterEspecialidade() {
        return especialidade;
    }

    public void alterarVeterinario(String crmv, String especialidade) {
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    @Override 
    public void exibirInformacoes() {
        System.out.println("Nome do(a) veterinário: " + this.obterNome());
        System.out.println("Cpf do(a) veterinário " + this.obterNome() + ": " + this.obterCpf());
        System.out.println("Telefone do(a) veterinário " + this.obterNome() + ": " + this.obterTelefone());
        System.out.println("CRMV do(a) veterinário " + this.obterNome() + ": " + this.obterCrmv());
        System.out.println("Especialidade do(a) veterinário " + this.obterNome() + ": " + this.obterEspecialidade());
        System.out.println();
    }
}

abstract class Animal {
    private String nome;
    private int idade;
    private double peso;
    private Cliente dono;

    public Animal(String nome, int idade, double peso, Cliente dono) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
    }

    public String obterNome() {
        return nome;
    }

    public int obterIdade() {
        return idade;
    }

    public double obterPeso() {
        return peso;
    }
    
    public Cliente obterDono() {
        return dono;
    }

    public void alterarAnimal(String nome, int idade, double peso, Cliente dono) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.dono = dono;
    }

    public abstract void emitirSom();

    public void exibirInformacoes() {
        System.out.println("Nome do animal: " + this.obterNome());
        System.out.println("Idade do " + this.obterNome() + ": " + this.obterIdade());
        System.out.println("Peso do " + this.obterNome() + ": " + this.obterPeso());
        System.out.println("Nome do dono: " + this.obterDono().
        obterNome());
        System.out.println();
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro (String nome, int idade, double peso, Cliente dono, String raca) {
        super(nome, idade, peso, dono);
        this.raca = raca;
    }

    public String obterRaca() {
        return raca;
    }

    public void alterarRaca(String raca) {
        this.raca = raca;
    }

    @Override 
    public void emitirSom() {
        System.out.println("AU AU!");
    }
}

class Gato extends Animal {
    private boolean castrado;
    
    public Gato(String nome, int idade, double peso, Cliente dono, boolean castrado) {
        super(nome, idade, peso, dono);
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override 
    public void emitirSom() {
        System.out.println("MIAU MIAU!");
    }
}

class Consulta {
    private int codigo;
    private Animal animal;
    private Veterinario veterinario;
    private String data;
    private String horario;
    private String motivo;
    private String diagnostico;
    private double valor;
    private boolean realizada;

    public Consulta(int codigo, Animal animal, Veterinario veterinario, String data, String horario, String motivo, double valor) {
        this.codigo = codigo;
        this.animal = animal;
        this.veterinario = veterinario;
        this.data = data;
        this.horario = horario;
        this.motivo = motivo;
        this.valor = valor;
        realizada = false;
        diagnostico = "Não informado";
    }

    public int obterCodigo() {
        return codigo;
    }

    public Animal obterAnimal() {
        return animal;
    }

    public Veterinario obterVeterinario() {
        return veterinario;
    }

    public String obterData() {
        return data;
    }

    public String obterHorario() {
        return horario;
    }

    public String obterMotivo() {
        return motivo;
    }

    public String obterDiagnostico() {
        return diagnostico;
    }

    public double obterValor() {
        return valor;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void alterarAnimal (Animal animal) {
        this.animal = animal;
    }

    public void alterarVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void alterarData(String data) {
        this.data = data;
    }

    public void alterarHorario(String horario) {
        this.horario = horario;
    }

    public void alterarMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void alterarDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }    

    public void alterarValor(double valor) {
        this.valor = valor;
    }

    public void realizarConsulta(String diagnostico) {
        if (realizada == false) {
            realizada = true;
            this.diagnostico = diagnostico;
        }
        else {
            System.out.println("\033[31mA consulta já foi realizada!\033[m");
        }
    }

    public void exibirConsulta() {
        System.out.println("Código da consulta: " + this.obterCodigo());
        System.out.println("Animal: " + this.obterAnimal().obterNome());
        System.out.println("Veterinário: " + this.obterVeterinario().obterNome());
        System.out.println("Data: " + this.obterData());
        System.out.println("Horário: " + this.obterHorario());
        System.out.println("Motivo: " + this.obterMotivo());
        System.out.println("Diagnóstico: " + this.obterDiagnostico());
        System.out.println("Valor: R$ " + this.obterValor());
        if (this.isRealizada()) {
            System.out.println("Situação: Realizada");
        } else {
            System.out.println("Situação: Pendente");
        }
        System.out.println();
    }
}

class Clinica {
    private String nome;
    private ArrayList<Cliente> clientes;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Consulta> consultas;

    public Clinica (String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.obterCpf()) == null) {
           clientes.add(cliente); 
        } else {
            System.out.println("\033[31mJá existe um cliente cadastrado com esse CPF!\033[m");
        }
        
    }

    public void cadastrarVeterinario(Veterinario veterinario) {
        if (buscarVeterinario(veterinario.obterCrmv() ) == null) {
        veterinarios.add(veterinario);
        } else {
            System.out.println("\033[31mJá existe um veterinário com esse CRMV!\033[m");
        }
    }

    public void cadastrarConsulta(Consulta consulta) {
        if (buscarConsulta(consulta.obterCodigo()) == null) {
          consultas.add(consulta);  
        } else {
            System.out.println("\033[31mJá existe uma consulta com esse código!\033[m");
        }
        
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.obterCpf().equals(cpf)) {
                return cliente;
            }
        }
    return null;
    }

    public Veterinario buscarVeterinario(String crmv) {
        for (Veterinario veterinario : veterinarios) {
            if (veterinario.obterCrmv().equals(crmv)) {
                return veterinario;
            }
        }
        return null;
    }

    public Consulta buscarConsulta(int codigo) {
        for (Consulta consulta : consultas) {
            if (consulta.obterCodigo() == codigo) {
                return consulta;
            }
        }
        return null;
    }

    public void listarClientes() {
        int cont = 1;
        for (Cliente cliente : clientes) {
            System.out.println("Cliente " + cont + ":");
            cliente.exibirInformacoes();
            cont++;
        }
        
    }

    public void listarVeterinarios() {
        int cont = 1;
        for (Veterinario veterinario : veterinarios) {
            System.out.println("Veterinário " + cont + ":");
            veterinario.exibirInformacoes();
            cont++;
        }
    }

    public void listarConsultas() {
        int cont = 1;
        for (Consulta consulta : consultas) {
            System.out.println("Consulta " + cont + ":");
            consulta.exibirConsulta();
            cont++;
        }
    }

    public boolean cancelarConsulta(int codigo) {
        Consulta consulta = buscarConsulta(codigo);
        if (consulta != null) {
            consultas.remove(consulta);
            return true;
        }
        return false;
    }

    public double calcularFaturamento() {
        double faturamento = 0;
        for (Consulta consulta : consultas) {
            if (consulta.isRealizada()) {
                faturamento += consulta.obterValor();
            }
        }
        return faturamento;
    }

    public void exibirEstatisticas() {
        System.out.println("Quantidade de clientes: São " + clientes.size() + " clientes no total.");
        System.out.println("Quantidade de veterinários: São " + veterinarios.size() + " veterinários no total.");
        int quantidadeAnimais = 0;
        for (Cliente cliente : clientes) {
            quantidadeAnimais += cliente.obterAnimais().size();
        }
        System.out.println("Quantidade de animais: São " + quantidadeAnimais + " animais no total");
        System.out.println("Quantidade de consultas: São " + consultas.size() + " consultas no total.");
        int quantidadeConsultasRealizadas = 0;
        for (Consulta consulta : consultas) {
            if (consulta.isRealizada()) {
                quantidadeConsultasRealizadas += 1;
            }
        }
        System.out.println("Quantidade de consultas realizadas: Foram realizadas " + quantidadeConsultasRealizadas + " consultas no total.");
        System.out.println("Faturamento total: R$ " + calcularFaturamento());
    }

    public void ouvirAnimais() {
        for (Cliente cliente : clientes) {
            for (Animal animal : cliente.obterAnimais()) {
                animal.emitirSom();
            }
            System.out.println();
        }
    }
}