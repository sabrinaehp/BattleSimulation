package batalha;

import java.util.Scanner;

import decorator.AgilidadeDecorator;
import decorator.ForcaDecorator;
import personagem.Personagem;

public class Batalha {
	
	Personagem boss;
    Personagem player;
    
    public Batalha() {
    	
    }
    
    public Batalha(Personagem boss, Personagem player) {
    	this.boss = boss;
    	this.player = player;
    }
    
    public void buffs() {
    	
    	ForcaDecorator forcaBoss = new ForcaDecorator(boss);
    	ForcaDecorator forcaPlayer = new ForcaDecorator(player);
    	AgilidadeDecorator defBoss = new AgilidadeDecorator(boss);
    	AgilidadeDecorator defPlayer = new AgilidadeDecorator(player);
    	
    	forcaPlayer.aumentarAtributos();
    	defPlayer.aumentarAtributos();
    	
    	forcaBoss.aumentarAtributosBoss();
    	defBoss.aumentarAtributosBoss();
    }
    
    public void round() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************* BUFFS *************");
        buffs();
    	System.out.println(boss.toString());
    	System.out.println(player.toString());
    	
		sc.nextLine();
    	
        try {
            Thread.sleep(1000); // Atraso de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
        System.out.println("************ BATALHA ************");
    	while (boss.getVida() >0 && player.getVida() >0) {
    		
    		boss.setVida(boss.getVida() - (player.getAtaque() - boss.getDefesa()));
    		System.out.println(player.getNome() + " atingiu o Chefe com " + (player.getAtaque() - boss.getDefesa()) + " de dano!");
    		System.out.println("Vida restante do Chefe: " + boss.getVida());
    		
    		if (boss.getVida() <= 0) {
    			System.out.println();
                System.out.println("O Chefe foi derrotado! Você venceu a batalha!");
                break;
            }
    		
    		System.out.println();
    		player.setVida(player.getVida() - (boss.getAtaque() - player.getDefesa()));
    		System.out.println("O Chefe atingiu " + player.getNome() + " com " + (boss.getAtaque() - player.getDefesa()) + " de dano!");
    		System.out.println("Vida restante do Jogador: " + boss.getVida());
    		System.out.println("------------------------------");
    		
    		if (player.getVida() <= 0) {
    			System.out.println();
                System.out.println("Você foi derrotado! O Chefe venceu a batalha!");
                break;
            }
    		sc.nextLine();
    		
    		clearConsole();
    	}
    	
		if(boss.getVida() <= 0 && player.getVida() <= 0) {
			System.out.println();
			System.out.println("Houve um empate!");
		}
    	
    	sc.close();
    }
    
    public final static void clearConsole(){

    	try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
