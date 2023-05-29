package decorator;

import java.util.Random;

import personagem.Personagem;

public class ForcaDecorator implements DecoratorPersonagem {

	private Personagem personagem;
	private Random random = new Random();
	
	public ForcaDecorator() {
		
	}
	
	public ForcaDecorator(Personagem personagem) {
		this.personagem = personagem;
	}
	
	@Override
	public void aumentarAtributos() {
	    int numeroAleatorio = random.nextInt(20) + 1;

	    System.out.println("Você foi agraciado com +" + numeroAleatorio + " de Força!");

	    int buffAtaque = personagem.getAtaque() + numeroAleatorio;
	    personagem.setAtaque(buffAtaque);
	}
	
	@Override
	public void aumentarAtributosBoss() {
	    int numeroAleatorio = random.nextInt(20) + 1;

	    System.out.println("O chefe foi agraciado com +" + numeroAleatorio + " de Força!");

	    int buffAtaque = personagem.getAtaque() + numeroAleatorio;
	    personagem.setAtaque(buffAtaque);
	}
	
}
