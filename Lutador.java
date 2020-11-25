/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author clara
 */
public class Lutador {
    
//    Atributos.
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
//    Construtor.
    Lutador(String N, String NA, int IDA, float A, float P, int V, int D, int E) {
        
        this.nome = N;
        this.nacionalidade = NA;
        this.idade = IDA;
        this.altura = A;
        this.setPeso(P);
        this.vitorias = V;
        this.derrotas = D;
        this.empates = E;
        
    }
    
//    Métodos.
    public void apresentar(){
        
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos.");
        System.out.println("Altura: "+this.getAltura()+" M.");
        System.out.println("Peso: "+this.getPeso()+" Kg.");
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        
    }
    
    public void status(){
        
        System.out.println(this.getNome()+" é da categoria: "+this.getCategoria());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        
    }
    
    public void ganharLuta(){
        
        this.setVitorias(this.getVitorias() + 1);
        
    }

    public void perderLuta(){
        
        this.setDerrotas(this.getDerrotas()+ 1);
        
    }
    
    public void empatar(){
        
        this.setEmpates(this.getEmpates()+ 1);
        
    }
    
//    Getters e Setters.
    public String getNome() {
        return this.nome;
    }

    public void setNome(String N) {
        this.nome = N;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String NA) {
        this.nacionalidade = NA;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int IDA) {
        this.idade = IDA;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float A) {
        this.altura = A;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float P) {
        this.peso = P;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        
        if (this.peso < 52.2){
            
            this.categoria = "Inválido.";
            
        }else if (this.peso <= 70.3){
            
            this.categoria = "Leve.";
            
        }else if (this.peso <= 83.9){
            
            this.categoria = "Médio.";
            
        }else if (this.peso <= 120.2){
            
            this.categoria = "Pesado.";
            
        }else{
            
            this.categoria = "Inválido.";
            
        }
        
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int V) {
        this.vitorias = V;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int D) {
        this.derrotas = D;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int E) {
        this.empates = E;
    }
    
}
