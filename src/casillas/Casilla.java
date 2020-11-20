/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casillas;

import javax.swing.JButton;

/**
 *
 * @author mra75
 */
public class Casilla {
    
    private ICasilla casilla;
    
    
    public Casilla(ICasilla casilla){
        this.casilla=casilla;
    }
    
    public boolean verificar_casilla(int x, int y){
        return this.casilla.revisar_ficha(x,y);
    }
    
}
