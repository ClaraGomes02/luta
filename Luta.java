/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;

/**
 *
 * @author clara
 */
public class Luta {
    
//    Atributos.
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
//    Métodos.
    public void marcarLuta(Lutador L1, Lutador L2){
        
        if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
            
        }else{
            
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            
        }
        
    }
    
    public void lutar(){
        
        if (this.getAprovada()){
            
            System.out.println("--- DESAFIANTE ---");
            this.desafiante.apresentar();
            System.out.println("--- DESAFIADO ---");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0,1,2.
            switch(vencedor){
                
                case 0: //Empate.
                    
                    System.out.println("Empatou!");
                    this.desafiado.empatar();
                    this.desafiante.empatar();
                    break;
                
                case 1: //Desafiado.
                    
                    System.out.println(this.desafiado+" venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2: //Desafiante.
                    
                    System.out.println(this.desafiante+" venceu!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
            }
            
        }else{
            
            System.out.println("A luta não pode acontecer.");
            
        }
        
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador DO) {
        this.desafiado = DO;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador DE) {
        this.desafiante = DE;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int R) {
        this.rounds = R;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean AP) {
        this.aprovada = AP;
    }
    
    
}
