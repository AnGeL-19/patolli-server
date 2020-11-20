/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

/**
 *
 * @author mra75
 */
public class Banco {
    
    private int fondo;

    public Banco() {
        this.fondo=0;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo += fondo;
    }

}
