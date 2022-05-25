public class PessoaFisica implements TipoPessoa{

    public PessoaFisica() {    
    }

    @Override
    public double calcularDesconto() {
        return valor * 0.90;
    } 
}
