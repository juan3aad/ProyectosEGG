/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
para windows
 */
package conexionwifi;

/**
 *
 * @author ajuand
 */
import java.net.*;
import java.io.*;
 
public class ConexionWifi {
 
  public static void main(String[] args) {
 
    String ssid = "nombre_de_la_red_wifi"; // nombre de la red Wi-Fi
    String password = "contraseña_wifi"; // contraseña de la red Wi-Fi
 
    try {
      // configurar la conexión
      String cmd = "netsh wlan set hostednetwork mode=allow ssid=" + ssid + " key=" + password;
      Process p = Runtime.getRuntime().exec(cmd);
      p.waitFor();
 
      // iniciar la conexión
      cmd = "netsh wlan start hostednetwork";
      p = Runtime.getRuntime().exec(cmd);
      p.waitFor();
 
      System.out.println("Conexión establecida");
 
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}