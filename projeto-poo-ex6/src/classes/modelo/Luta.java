package classes.modelo;

import java.util.Random;

/**
 *
 * @author rodrigo
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Especiais
    public Lutador getDesafiado(){
        return desafiado;
    
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {    
        this.aprovada = aprovada;
    }

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        //Condições para marcar a luta
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            //Apresentação dos lutadores
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            
            //Sorteio(Importe java.util.Random)
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0 1 2
            System.out.println("=== RESULTADO ===");
            switch(vencedor){
                case 0://Empate
                    System.out.println("Empatou!");
                    //Atualiza cartel
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://Desafiado vence
                    System.out.println("Venceu o "+this.desafiado.getNome());
                    //Atualiza cartel
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://Desafiante vence
                    System.out.println("Venceu o "+this.desafiante.getNome());
                    //Atualiza cartel
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("=================================");
        
        }else{
            System.out.println("A luta não pode ancontecer!!");
        
        }
    
    }
    
}
