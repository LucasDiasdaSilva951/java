public class animais {
    public static class Animal {
        private String nome;
        public String obterNomeAnimal() {
            return nome;
        }
        public void alterarNomeAnimal(String nome) {
            this.nome = nome;
        }
        public static String comer() {
            return " está comendo.";
        }
    }
    public static void main(String[] args) {
        System.out.println();        
        Animal animal = new Animal();
        animal.nome = "Cachorro";
        System.out.println("Animal 1: " + animal.obterNomeAnimal());
        System.out.println("O " + animal.obterNomeAnimal() + Animal.comer());
        System.out.println();
        animal.alterarNomeAnimal("Leão"); 
        System.out.println("Animal 2: " + animal.obterNomeAnimal());
        System.out.println("O " + animal.obterNomeAnimal() + Animal.comer());   
        System.out.println();
    }
}
