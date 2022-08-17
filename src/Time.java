package Stream;

import java.util.ArrayList;

public class Time {
	private String time;
	private ArrayList<Jogador> jogador;

	public Time(String time, ArrayList<Jogador> jogador) {
		this.time = time;
		this.setJogador(jogador);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(ArrayList<Jogador> jogador) {
		this.jogador = jogador;
	}

	public String getTime() {
		return time;
	}

	
	

}
