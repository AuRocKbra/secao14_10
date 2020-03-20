package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastosSaude;
	
	public PessoaFisica(String nomeContrbuinte, Double rendaAnual, Double gastosSaude) {
		super(nomeContrbuinte, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double impostoAPagar() {
		if(this.getRendaAnual()<20000.00) {
			return this.getRendaAnual()*0.15-getValorSaude(this.gastosSaude);
		}
		else {
			return this.getRendaAnual()*0.25-getValorSaude(this.gastosSaude);
		}
	}
	
	private Double getValorSaude(Double valorSaude) {
		if(valorSaude>0.00) {
			return this.gastosSaude*0.5;
		}
		else {
			return 0.0;
		}
	}
}
