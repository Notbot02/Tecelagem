/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extecelagem;

/**
 *
 * @author 0040962113047
 */
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        administração ad;
        Producao pro;
        Vendedores Ven;
        
        ad = new administração("Mario", "464.1549.1541", 1520.2f);
        pro = new Producao("Maria", "46489526", 2010.2f);
        Ven = new Vendedores("Carioca", "15461651", 5001.2f);
        
        ad.registrarFalta();
        ad.registrarFalta();
        
        pro.registrarHorasDiurnas(60);
        pro.registrarHorasNoturnas(90);
        
        Ven.registrarVenda(2100);
        
        ad.hollerith();
        
        pro.hollerith();
        
        Ven.hollerith();
    }
    
}
