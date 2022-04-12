/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040962113047
 */
public abstract class Funcionario {
    
    String nome, RG;
    double salarioBase;

    public Funcionario() {
        
    }
    
    public Funcionario(String nome, String RG, double salarioBase) {
        this.nome = nome;
        this.RG = RG;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalário() {
        return salarioBase;
    }

    public void setSalário(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double salarioLiquido();
    public abstract void novoMes();
        
    
    void hollerith()
    {
        System.out.println("Nome: " + nome + "\n" +
                "Rg: " + RG);
                //"Salário: " + salarioBase);
    }
     
}
