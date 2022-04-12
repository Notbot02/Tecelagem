/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040962113047
 */
public class Vendedores extends Funcionario{
    
    double vendas;
    double guardaSalario;

    public Vendedores(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        vendas = 0;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    
    void registrarVenda(double valor)
    {
       vendas += valor;
    }
    
    protected void hollerith()
    {
        super.hollerith();
        System.out.println("salario: " + (salarioBase + (vendas * 0.03)) + "\n");
    }
    
    @Override
    public void novoMes()
    {
        vendas = 0;
    }

    @Override
    public double salarioLiquido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
