/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040962113047
 */
public class administração extends Funcionario {
    
    int faltas;

    public administração() {
    }

    public administração(String nome, String RG, double salarioBase) {
        super(nome, RG, salarioBase);
        faltas = 0;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    void registrarFalta()
    {
        faltas++;          
    }
    
   
    protected double desconto()
    {
        return (salarioBase/30) * faltas;
    }
    
    @Override
   public double salarioLiquido(){
     return salarioBase - desconto();
   }
    
    protected void hollerith()
    {
        super.hollerith();
        System.out.println("salario: " + salarioLiquido() + "\n");
    }
    
    
    public void novoMes()
    {
        salarioBase = 0;
    }
}
