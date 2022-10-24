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
public class SocketCliente extends Thread{
    
    private final int PUERTO = 5000;
    private final String HOST = "localhost";
    private Socket sc;
    private DataOutputStream datosSalida;
    private DataInputStream datosEntrada;
    private final int id;
    private int pisoAscensor;
    private int estadoAscensor;
    
    public SocketCliente(int idEntrada){
        this.id = idEntrada;
        try {
            sc = new Socket(HOST, PUERTO);
            datosSalida = new DataOutputStream(sc.getOutputStream());//flujo de datos para enviar mensaje
            datosEntrada = new DataInputStream(sc.getInputStream());//Flujo datos entrada 
            
            //Nos identificamos al servidor
            datosSalida.write(id);
        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void enviarMensaje(int tipoMensaje, int personas, int[]arreglo) throws IOException{
        //El formato de envio es: motivo envio, el tipo de peticion, usuarios, y el arreglo
        datosSalida.write(tipoMensaje);
        datosSalida.write(personas);
        datosSalida.writeInt(arreglo.length);
        datosSalida.flush();
        for(int e:arreglo) datosSalida.writeInt(e);
    }

    public boolean tieneMensaje() {
        boolean b = false;
        try {
            b = datosEntrada.readBoolean();
            pisoAscensor = datosEntrada.read();
            estadoAscensor = datosEntrada.read();
            System.out.println(pisoAscensor);
        } catch (IOException ex) {
            Logger.getLogger(SocketCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(b);
        return b;
    }

    public int getPisoAscensor() {
        return pisoAscensor;
    }

    public int getEstadoAscensor() {
        return estadoAscensor;
    }
    
    
}
