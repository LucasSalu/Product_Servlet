package Servlet;

public class Product {
	
	private Long id;
	private Long cod;
	private String descricao;
	private Double valor;
	
	public Product(Long id, Long cod, String descricao, Double valor) {
		this.id = id;
		this.cod = cod;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Product() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCod() {
		return cod;
	}
	public void setCod(Long cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	

}
