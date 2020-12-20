package entidade;

public class PessoaJuridica extends TaxaPagamento {

    private Integer numeroDeFuncionario;

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionario) {
        super(name, rendaAnual);
        this.numeroDeFuncionario = numeroDeFuncionario;
    }

    public Integer getNumeroDeFuncionario() {
        return numeroDeFuncionario;
    }

    public void setNumeroDeFuncionario(Integer numeroDeFuncionario) {
        this.numeroDeFuncionario = numeroDeFuncionario;
    }

    @Override
    public Double taxa() {
            if (numeroDeFuncionario > 10) {
                return getRendaAnual() * 0.14;
            } else {
                return getRendaAnual() * 0.16;
            }
    }
}