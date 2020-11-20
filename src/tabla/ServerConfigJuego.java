/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author mra75
 */
public class ServerConfigJuego implements Runnable{

    private ArrayList<Socket> jugadores;
    private int puerto;
    //private int clientes_conectados;
    private Configuracion config;
    
    public ServerConfigJuego(int puerto, int fondo, int nJugadores, int nFichas) {
        
        this.puerto = puerto;
        this.jugadores = new ArrayList<>();
        config = new Configuracion(fondo, nJugadores, nFichas);
        Thread hilo = new Thread(this);
        hilo.start();
        
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;
        DataOutputStream out = null;
        ObjectOutputStream enviar = null; 
        
        try {

            servidor = new ServerSocket(puerto);
            
            while(true){
                sc = servidor.accept();
                config.setClientes_conectados();
                
                System.out.println("Cliente Conectado");
                out = new DataOutputStream(sc.getOutputStream());
                enviar = new ObjectOutputStream(out);
                enviar.flush();
                enviar.writeObject(config);     
                System.out.println("Enviar config cliente");
                
                jugadores.add(sc); 
                
            }    

        } catch (IOException ex) {

        }
               
    }
    
    
    
    
}
