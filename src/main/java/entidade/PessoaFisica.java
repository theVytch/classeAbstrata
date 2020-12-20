package entidade;

public class PessoaFisica extends TaxaPagamento{

    private Double gastoComSaude;

    public PessoaFisica(String name, Double rendaAnual, Double gastoComSaude) {
        super(name, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public Double taxa() {
        if(getRendaAnual() < 20000.0){
            return getRendaAnual() * 15 - gastoComSaude * 0.5 ;
        }else{
            return getRendaAnual() * 0.25 - gastoComSaude *0.5;
        }
    }
}
