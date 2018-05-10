package View;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean
public class HomeView {
      public void chamarNovasSenhas() {
        addMessage("Próximo da fila", "");
    }
     
    public void reiniciarSenhas() {
        addMessage("Senhas Reiniciadas", "");
    }
      
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
   /* public String telaCliente(){
        
        return "cliente.xhtml";
    }*/
            
}
