package exportador;

public class Produto {
	
	private static int ultimoId = 0;
	
	private int id;
	private String decricao;
	private String marca;
	private String modelo;
	private int estoque;
	
	public Produto(){
        this.id = ++ultimoId;
    }
	
	public Produto(String descricao, String marca, String modelo, int estoque) {
		
		this();
		this.decricao = descricao;
		this.marca = marca;
		this.modelo = modelo;
		this.estoque = estoque;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDecricao() {
		return decricao;
	}
	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	

}
