package classe.executavel;

import classes.modelo.Luta;
import classes.modelo.Lutador;

public class ClasseExecutavel {

	public static void main(String[] args) {
		 	Lutador l[] = new Lutador[12];
	        
	        l[0] = new Lutador("Mickey","USA", 30, 16, 3, 3,1.71f, 68.7f);
	        
	        l[0].status(); //Testa status
	        l[0].apresentar(); //Testa apresentar
	        
	        l[1] = new Lutador("Donald","USA", 31, 11, 2, 1,1.75f, 67.6f);
	        l[2] = new Lutador("Pateta","Canadá", 33, 16, 3, 2,1.85f, 65.5f);
	        l[3] = new Lutador("Zé Carioca","Brasil", 9, 11, 4, 3,1.70f, 69.4f);
	        l[4] = new Lutador("Pluto","Russia", 27, 17, 5, 4,1.72f, 70f);
	        l[5] = new Lutador("Gaginho","Inglaterra", 20, 11, 1, 1,1.80f, 73.3f);
	        l[6] = new Lutador("Fragola","Chile", 37, 18, 2, 2,1.75f, 81.2f);
	        l[7] = new Lutador("Pio-Pio","Africa do Sul", 13, 3, 3, 1,1.85f, 83.1f);
	        l[8] = new Lutador("Bafo de Onça","Japão", 25, 11, 1, 1,1.90f, 90.9f);
	        l[9] = new Lutador("Grilo Falante","Alemanhã", 15, 2, 2, 1,1.92f, 102.8f);
	        l[10] = new Lutador("Horácio","Argentina", 29, 14, 3, 3,1.93f, 120f);
	        l[11] = new Lutador("Pepé Le Pew","França", 32, 21, 4, 4,1.97f, 111.7f);
	        
	        Luta UF = new Luta();
	        //Testa marcar luta
	        UF.marcarLuta(l[0], l[2]);
	        //Testa lutas
	        UF.lutar();
	        //Testa status
	        l[0].status();
	        l[2].status();

	}

}
