public class produtotestepoo {
    String nome;
    double preco;
    int quantidade;
    public produtotestepoo(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removerEstoque (int quantidade) {
        if (quantidade <= this.quantidade) {
           this.quantidade -= quantidade; 
        }
        else {
            System.out.println("\033[31mQuantidade insuficiente no estoque!\033[m");
        }
    }
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    public static void main(String[] args) {
        produtotestepoo produto = new produtotestepoo("Celular", 2000.00, 30);
        produtotestepoo produto2 = new produtotestepoo ("Computador", 5000.00, 45);
        produto.adicionarEstoque(15);
        produto2.adicionarEstoque(10);
        produto.removerEstoque(30);
        produto2.removerEstoque(45);
        System.out.println("================ PRODUTOS CADASTRADOS ================");
        produto.mostrarProduto();
        System.out.println("Valor total: " + produto.calcularValorTotal());
        System.out.println("=====================================================");
        produto2.mostrarProduto();
        System.out.println("Valor total: " + produto2.calcularValorTotal());
        System.out.println("=====================================================");
    }
}
