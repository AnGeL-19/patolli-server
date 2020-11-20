/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import reglas.Jugador;

/**
 *
 * @author mra75
 */
public class Servidor extends Observable implements Runnable{
    
    private ArrayList<Socket> jugadores;
    private int puerto;
    private Jugador jugador;
    
    
    public Servidor(int puerto) {
        
        this.puerto=puerto;
        this.jugadores = new ArrayList<>();
        
        
        
        
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;
        //DataInputStream enviar = null;
            
        try {

            servidor = new ServerSocket(puerto);
            
            while(true){
                sc = servidor.accept();
                
                System.out.println("Cliente Conectado");
                jugadores.add(sc); 
                
            }    

        } catch (IOException ex) {

        }
           
    }
    
    public void enviar_info(Jugador jugador){
        
        DataOutputStream out=null;
        ObjectOutputStream enviar=null;
        
        for (Socket s: jugadores) {
            
            try {
                out = new DataOutputStream(s.getOutputStream());
                enviar = new ObjectOutputStream(out);
                enviar.flush();
                enviar.writeObject(jugador);
                System.out.println("se envioooo");  
            } catch (IOException ex) {
                System.out.println("Error no se envio el objeto");
            }
        }

        //resivir_valores();
              
    }
    
    
    ///////Resive los datos//////////
    
    public void resivir_valores(){
        DataInputStream in=null;
        ObjectInputStream recibir=null;
        
        for (int i = 0; i < jugadores.size(); i++) {
            try {
                System.out.println(jugadores.get(i));

                while(true){
                    try {

                        in = new DataInputStream(jugadores.get(i).getInputStream());
                        recibir = new ObjectInputStream(in);
                        
                        jugador = (Jugador) recibir.readObject();

                        
                        
                        this.setChanged();
                        this.notifyObservers(jugador);
                        this.clearChanged();
                        
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                      //  System.out.println(n+" valor llegando");
                        
                        break;
                    //}
                }
                //in.close();
            } catch (IOException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }
    

    
    public void enviar_info_moviminto(int m){
        
        for (Socket s: jugadores) {
            
            try {
                DataOutputStream enviar = new DataOutputStream(s.getOutputStream());  
                    enviar.writeUTF("Avanzar");
                    enviar.writeInt(m);
            } catch (IOException ex) {
                
            }
            
        }
        
    }
   
    public void enviar_info_fondo(int fondo, int nJ){
        
        for (Socket s: jugadores) {
            
            try {
                DataOutputStream enviar = new DataOutputStream(s.getOutputStream());  
                    enviar.writeUTF("Fondo");
                    enviar.writeInt(fondo);
                    enviar.writeUTF("nJ");
                    enviar.writeInt(nJ);
            } catch (IOException ex) {
                
            }
            
        }
        
    }
   
    
}
