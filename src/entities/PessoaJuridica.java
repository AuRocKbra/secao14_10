package entities;

public class PessoaJuridica extends Contribuinte{
	private Integer quantidadeDeFuncionarios;
	
	public PessoaJuridica(String nomeContrbuinte, Double rendaAnual, Integer quantidadeDeFuncionarios) {
		super(nomeContrbuinte, rendaAnual);
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

	public Integer getQuantidadeDeFuncionarios() {
		return quantidadeDeFuncionarios;
	}

	public void setQuantidadeDeFuncionarios(Integer quantidadeDeFuncionarios) {
		this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
	}

	@Override
	public Double impostoAPagar() {
		if(this.getQuantidadeDeFuncionarios()>10) {
			return this.getRendaAnual()*0.14;
		}
		else {
			return this.getRendaAnual()*0.16;
		}
	}
	
}
