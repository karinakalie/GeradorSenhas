
package View;

public class ClienteView {
    
    public String[] senhaN;

    public String[] getSenhaN() {
        return senhaN;
    }

    public void setSenhaN(String[] senhaN) {
        this.senhaN = senhaN;
    }

 public void mostrarSenha() {
        setSenhaN(getSenhaN());
        setSenhaN(getSenhaN());
        
 }
}  