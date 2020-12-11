
public class Produtos {

	private String tipo;
	private String nome;
	private double preco;
	private double peso; //relacionar o peso ao preço
	
	public Produtos() {
		
	}
	
	public Produtos(String tipo, String nome, double preco, double peso) {
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String detalhes() {
		return "Detalhes do Produto" + "\nTipo:" + this.getTipo() + "\n Nome:" + this.getNome()
		+ "\nPreço:" + this.getPreco() + "\nPeso:" + this.getPeso();
	}
	
	

	
}