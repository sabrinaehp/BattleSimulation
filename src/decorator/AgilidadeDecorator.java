package decorator;

import java.util.Random;

import personagem.Personagem;

public class AgilidadeDecorator implements DecoratorPersonagem{
	
	private Personagem personagem;
	private Random random = new Random();
	
	public AgilidadeDecorator() {
		
	}
	
	public AgilidadeDecorator(Personagem personagem) {
		this.personagem = personagem;
	}

	@Override
	public void aumentarAtributos() {
		
		int numeroAleatorio = random.nextInt(20) + 1;

	    System.out.println("Você foi agraciado com +" + numeroAleatorio + " de Defesa!\n");

	    int buffDefesa = personagem.getDefesa() + numeroAleatorio;
	    personagem.setDefesa(buffDefesa);
		
	}

	@Override
	public void aumentarAtributosBoss() {
		
		int numeroAleatorio = random.nextInt(20) + 1;

	    System.out.println("O chefe foi agraciado com +" + numeroAleatorio + " de Defesa!\n");

	    int buffDefesa = personagem.getDefesa() + numeroAleatorio;
	    personagem.setDefesa(buffDefesa);
	}
}
