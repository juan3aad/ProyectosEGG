/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionwifi2;

import javax.net.ssl.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class ConexionWifi2 {
    public static void enableWireless() throws Exception {
        Process process = Runtime.getRuntime().exec("netsh interface set interface \"Wireless Network Connection\" admin=enable");
        process.waitFor();
    }

    public static void disableWireless() throws Exception {
        Process process = Runtime.getRuntime().exec("netsh interface set interface \"Wireless Network Connection\" admin=disable");
        process.waitFor();
    }

    public static void connectToWifi(String ssid, String password) throws Exception {
        String profileName = ssid.replaceAll("\\W", "");

        String profileXml = String.format("<?xml version=\"1.0\"?>\n" +
                "<WLANProfile xmlns=\"http://www.microsoft.com/networking/WLAN/profile/v1\">\n" +
                "    <name>%s</name>\n" +
                "    <SSIDConfig>\n" +
                "        <SSID>\n" +
                "            <name>%s</name>\n" +
                "        </SSID>\n" +
                "    </SSIDConfig>\n" +
                "    <connectionType>ESS</connectionType>\n" +
                "    <connectionMode>auto</connectionMode>\n" +
                "    <MSM>\n" +
                "        <security>\n" +
                "            <authEncryption>\n" +
                "                <authentication>WPA2PSK</authentication>\n" +
                "                <encryption>AES</encryption>\n" +
                "                <useOneX>false</useOneX>\n" +
                "            </authEncryption>\n" +
                "            <sharedKey>\n" +
                "                <keyType>passPhrase</keyType>\n" +
                "                <protected>false</protected>\n" +
                "                <keyMaterial>%s</keyMaterial>\n" +
                "            </sharedKey>\n" +
                "        </security>\n" +
                "    </MSM>\n" +
                "</WLANProfile>", profileName, ssid, password);

        File profileFile = File.createTempFile(profileName, ".xml");
        profileFile.deleteOnExit();

        FileWriter writer = new FileWriter(profileFile);
        writer.write(profileXml);
        writer.close();

        Process process = Runtime.getRuntime().exec("netsh wlan add profile filename=\"" + profileFile.getAbsolutePath() + "\"");
        process.waitFor();

        process = Runtime.getRuntime().exec("netsh wlan connect name=\"" + ssid + "\"");
        process.waitFor();
    }
}