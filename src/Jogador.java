package Stream;

public class Jogador {
	private String nomeJogador;
	private Tipo tipo;

	public Jogador(String nomeJogador, Tipo tipo) {
		this.nomeJogador = nomeJogador;
		this.setTipo(tipo);
		// TODO Auto-generated constructor stub
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	

}
