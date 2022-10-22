/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import presentacion.*;        
/**
 *
 * @author Estudiantes
 */
public class SocketCliente {
    
    final int PUERTO = 5000;
    final String HOST = "localhost";
    Socket sc;
    DataOutputStream mensaje;
    DataInputStream escucha;
    int id ;

    public void iniciaCliente(){
       
        try {
            sc = new Socket(HOST,PUERTO);
            mensaje = new DataOutputStream(sc.getOutputStream());//flujo de datos para enviar mensaje
            mensaje.writeUTF("ENVIANDO MENSAJE!");
            escucha = new DataInputStream(sc.getInputStream());//Flujo datos entrada 
            System.out.println(escucha.readUTF());//Mensaje recibido
            sc.close();//Cerramos servidor
        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void traerId(int id){
        this.id = id;
    }

}
