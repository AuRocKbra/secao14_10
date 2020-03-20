package entities;

public abstract class Contribuinte {
	private String nomeContrbuinte;
	private Double rendaAnual;
	
	public Contribuinte() {
		
	}

	public Contribuinte(String nomeContrbuinte, Double rendaAnual) {
		this.nomeContrbuinte = nomeContrbuinte;
		this.rendaAnual = rendaAnual;
	}

	public String getNomeContrbuinte() {
		return nomeContrbuinte;
	}

	public void setNomeContrbuinte(String nomeContrbuinte) {
		this.nomeContrbuinte = nomeContrbuinte;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double impostoAPagar();
}
