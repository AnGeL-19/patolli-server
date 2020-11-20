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
public class CasillasNegras implements ICasilla{

 
    
    @Override
    public boolean revisar_ficha(int x, int y) {
        
        if(x==400&&y==170){
            return true;
        }else if(x==430&&y==170){
            return true;
        }else if(x==250&&y==320){
            return true;
        }else if(x==250&&y==350){
            return true;
        }else if(x==400&&y==500){
            return true;
        }else if(x==430&&y==500){
            return true;
        }else if(x==580&&y==350){
            return true;
        }else if(x==580&&y==320){
            return true;
        }else if(x==550&&y==320){
            return true;
        }else if(x==550&&y==350){
            return true;
        }else if(x==430&&y==470){
            return true;
        }else if(x==400&&y==470){
            return true;
        }else if(x==280&&y==320){
            return true;
        }else if(x==280&&y==350){
            return true;
        }else if(x==400&&y==200){
            return true;
        }else if(x==430&&y==200){
            return true;
        }        
        return false;
    }

    
    
}
