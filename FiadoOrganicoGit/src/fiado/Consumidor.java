package fiado;

public class Consumidor {
	
	//ATRIBUTOS
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	
	//CONSTRUTOR
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10];
	}
	
	//GETTER E SETTER
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	

}
