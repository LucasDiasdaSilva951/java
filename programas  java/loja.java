import java.util.ArrayList;

public class loja {
    public static class Produto {
        private String nome;
        private double preco;
        private int estoque;
        public Produto (String nome, double preco, int estoque) {
            this.nome = nome;
            this.preco = preco;
            this.estoque = estoque;
        }
        public String obterNomeProduto() {
            return nome;
        }
        public double obterPreçoProduto() {
            return preco;
        }
        public int obterEstoqueProduto() {
            return estoque;
        }
        public void alterarNomeProduto(String nome) {
            this.nome = nome;
        }
        public void alterarPrecoProduto(double preco) {
            this.preco = preco;
        }
        public void alterarEstoqueProduto(int estoque) {
            this.estoque = estoque;
        }
        public double aplicarDescontoPreçoProduto() {
            double novoPreco = preco - (preco * 0.10);
            return novoPreco;
        }
    }
    public static class Cliente {
        private String nomeCliente;
        private String cpf;
        private String email;
        public Cliente (String nomeCliente, String cpf, String email) {
            this.nomeCliente = nomeCliente;
            this.cpf = cpf;
            this.email = email;
        }
        public String obterNomeCliente() {
            return nomeCliente;
        }
        public void alterarNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        } 
        public String obterCpfCliente() {
            return cpf;
        }
        public String obterEmailCliente() {
            return email;
        }
        public void alterarEmailCliente(String email) {
            this.email = email;
        }
    }
    public static class Pedido {
        private Cliente cliente;
        private ArrayList <Produto> listadeprodutos = new ArrayList<>();
        private int numeropedido;
        public Pedido (Cliente cliente, int numeropedido) {
           this.cliente = cliente;
           this.numeropedido = numeropedido; 
        }
        public Cliente obterCliente() {
            return cliente;
        }
        public void alterarCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        public ArrayList<Produto> obterListadeProdutos() {
            return listadeprodutos;
        }
        public int obterNumeroPedido () {
            return numeropedido;
        }
        public double calcularTotal() {
            double total = 0;
            for (Produto valorproduto : listadeprodutos) {
                total += valorproduto.obterPreçoProduto();
            }
            return total;
        }
        public void adicionarProduto(Produto produto) {
            listadeprodutos.add(produto);
        }
    }
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado", 150.0, 10);
        Produto produto2 = new Produto("Mouse", 80.0, 20);
        Cliente cliente1 = new Cliente( "Maria Betânia","12345678901", "mariabetânia350@gmail.com");
        Pedido pedido1 = new Pedido(cliente1, 1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);
        cliente1.alterarNomeCliente("Fabiana");
        cliente1.alterarEmailCliente("fabianacostamelo335@hotmail.com");
        System.out.println();
        System.out.println("Pessoa que realizou o pedido: Cliente " + cliente1.obterNomeCliente());
        System.out.println("Produto 1 com desconto é de R$" + produto1.aplicarDescontoPreçoProduto());
        System.out.println("Preço do Produto 2 com desconto é de R$" + produto2.aplicarDescontoPreçoProduto());
        System.out.println("Valor total das compras: R$" + pedido1.calcularTotal());
        System.out.println();
    }
}
