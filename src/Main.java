public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        System.out.println("Valor final do produto para pessoa física é: " + pessoaFisica.calcularDesconto());

        System.out.println("Valor final do produto para pessoa juridica é: " + pessoaJuridica.calcularDesconto());
    }
}
