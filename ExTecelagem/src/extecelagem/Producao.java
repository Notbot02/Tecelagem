/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040962113047
 */
public class Producao extends Funcionario {
    
    protected int horas;
    protected double guardaDiurna, guardaNoturna;
    

    public Producao() {
    }

    public Producao(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        horas = 0;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    void registrarHorasDiurnas(int horas)
    {
        this.guardaDiurna = horas;
    }
    
    void registrarHorasNoturnas(int horas)
    {
        this.guardaNoturna = horas;
    }
    
    protected void hollerith()
    {
        super.hollerith();
        System.out.println("salario: " + ((guardaDiurna * (salarioBase / 220)) + (guardaNoturna * 1.3 *(salarioBase / 220))) + "\n");
    }
    
    @Override
    public void novoMes()
    {
        guardaDiurna = 0;
        guardaNoturna = 0;
    }

    @Override
    public double salarioLiquido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
