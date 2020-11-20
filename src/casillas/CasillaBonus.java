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
public class CasillaBonus implements ICasilla{

//x 430 y 80
//x 400 y 80
//x 160 y 320
//x 160 y 350
//x 400 y 590
//x 430 y 590
//x 670 y 350
//x 670 y 320
    
    @Override
    public boolean revisar_ficha(int x, int y) {
        
        if(x==430&&y==80){
            System.out.println("Callo en la casilla bonus");
        }else if(x==400&&y==80){
            System.out.println("Callo en la casilla bonus");
        }else if(x==1600&&y==320){
            System.out.println("Callo en la casilla bonus");
        }else if(x==160&&y==350){
            System.out.println("Callo en la casilla bonus");
        }else if(x==400&&y==590){
            System.out.println("Callo en la casilla bonus");
        }else if(x==430&&y==590){
            System.out.println("Callo en la casilla bonus");
        }else if(x==670&&y==350){
            System.out.println("Callo en la casilla bonus");
        }else if(x==670&&y==320){
            System.out.println("Callo en la casilla bonus");
        }
        
        return false;
    }


    
}
