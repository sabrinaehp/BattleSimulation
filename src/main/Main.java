package main;

import batalha.Batalha;
import personagem.Personagem;

public class Main {

	public static void main(String[] args) {
		
		Personagem boss = new Personagem("Chefe");
		Personagem player = new Personagem();
		player.nomePersonagem();
		Batalha batalha = new Batalha(boss, player);

		batalha.round();
		
	}

}
