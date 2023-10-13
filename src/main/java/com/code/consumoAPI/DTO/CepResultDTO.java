package com.code.consumoAPI.DTO;

public class CepResultDTO {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String uf;
	private String localidade;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	
	public CepResultDTO() {
	}

	public CepResultDTO(String cep, String logradouro, String complemento, String bairro, String uf,
			String localidade, String ibge, String gia, String ddd, String siafi) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.uf = uf;
		this.localidade = localidade;
		this.ibge = ibge;
		this.gia = gia;
		this.ddd = ddd;
		this.siafi = siafi;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getLocalidade() {
		return this.localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiofi(String siofi) {
		this.siafi = siofi;
	}

	@Override
	public String toString() {
		return "CepResultDTO [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", uf=" + uf + ", localidade=" + localidade + ", ibge=" + ibge + ", gia=" + gia + ", ddd=" + ddd
				+ ", siafi=" + siafi + "]";
	}

	
	
}
