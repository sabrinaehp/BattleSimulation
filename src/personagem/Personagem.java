package personagem;

import java.util.Scanner;

public class Personagem {
	
	private String nome;
	private Integer vida = 100;
	private Integer ataque = 100;
	private Integer defesa = 50;
	
	public Personagem() {
		
	}
	
	public Personagem(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public String toString() {
		return "---------------------------------\n"
				+ "Atributos do personagem:\n\n"
				+ "Nome: " + nome +
				"\nVida: " + vida +
				"\nAtaque: " + ataque +
				"\nDefesa: " + defesa +
				"\n";
	}
	
	public void nomePersonagem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do seu personagem: ");
		nome = sc.nextLine();
		System.out.println();
	}
	
}
