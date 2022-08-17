package Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
	
	public static void jogador() {
		List<Time> times = new ArrayList<>() {{
		    add(new Time (
		        "Gremio",
		        new ArrayList<>() {{
		            add(new Jogador("Gabriel Granco", Tipo.GOLEIRO));
		            add(new Jogador("Rafinha", Tipo.LATERAL));
		            add(new Jogador("Bruno Cortez", Tipo.LATERAL));
		            add(new Jogador("Pedro Geromel", Tipo.ZAGUEIRO));
		            add(new Jogador("Ruan", Tipo.ZAGUEIRO));
		            add(new Jogador("Tiago Santos", Tipo.VOLANTE));
		            add(new Jogador("Lucas Silva", Tipo.VOLANTE));
		            add(new Jogador("Ferreira", Tipo.MEIA));
		            add(new Jogador("Jaminton Campaz", Tipo.MEIA));
		            add(new Jogador("Jhonata Robert", Tipo.MEIA));
		            add(new Jogador("Diego Souza", Tipo.ATACANTE));
		        }}
		    ));
		    add(new Time (
		            "Flamengo",
		            new ArrayList<>() {{
		                add(new Jogador("Hugo Souza", Tipo.GOLEIRO));
		                add(new Jogador("Rodinel", Tipo.LATERAL));
		                add(new Jogador("Ren�", Tipo.LATERAL));
		                add(new Jogador("Gustavo Henrique", Tipo.ZAGUEIRO));
		                add(new Jogador("L�o Pereira", Tipo.ZAGUEIRO));
		                add(new Jogador("Thiago Maia", Tipo.VOLANTE));
		                add(new Jogador("Jo�o Gomes", Tipo.VOLANTE));
		                add(new Jogador("Kenedy", Tipo.MEIA));
		                add(new Jogador("Diego", Tipo.MEIA));
		                add(new Jogador("Vitinho", Tipo.MEIA));
		                add(new Jogador("Vitor Gabriel", Tipo.ATACANTE));
		            }}
		    ));
		}};
		
		times.forEach(time -> time.getJogador().stream()
                .filter(jogador -> jogador.getTipo().equals(Tipo.MEIA))
                .forEach(jogador -> System.out.println(jogador.getNomeJogador() + " - " + jogador.getTipo() + " - " + time.getTime())));
	}
	
	
	public static void main(String[] args) {
		jogador();
	}

}
