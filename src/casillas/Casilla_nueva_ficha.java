/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casillas;




/**
 *
 * @author mra75
 */
public class Casilla_nueva_ficha implements ICasilla{
//x 400 y 320
//x 400 y 350
//x 430 y 350
//x 430 y 320

    @Override
    public boolean revisar_ficha(int x, int y) {
        
        if(x==400&&y==320){
            System.out.println("Callo en la casilla central");
        }else if(x==400&&y==350){
            System.out.println("Callo en la casilla central");
        }else if(x==430&&y==350){
            System.out.println("Callo en la casilla central");
        }else if(x==430&&y==320){
            System.out.println("Callo en la casilla central");
        }
        return false;
    }


    
}
