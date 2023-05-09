/*
 * ejercicio 8
 * and open the template in the editor.
 */
package cadenamvc.model;

/**
 *
 * @author ajuand
 */
public class CadenaMVC {
    
    

    /**
     * @param args the command line arguments
     */
    
    private String frase;
    private Integer logitud;

    public CadenaMVC(String frase) {
        this.frase=frase;
        this.logitud=frase.length();
    }

    public CadenaMVC(String frase, Integer logitud) {
        this.frase = frase;
        this.logitud = logitud;
    }
    
  

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLogitud() {
        return logitud;
    }

    public void setLogitud(Integer logitud) {
        this.logitud = logitud;
    }

    @Override
    public String toString() {
        return "CadenaMVC{" + "frase=" + frase + ", logitud=" + logitud + '}';
    }
    
    
    
    
}
