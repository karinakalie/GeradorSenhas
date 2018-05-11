package View;

import Controller.ControleSenhas;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.CloseEvent;

@ManagedBean
public class HomeView {

    public void chamarNovasSenhas() {

        ControleSenhas c = new ControleSenhas();
        String proximoFila = "Próximo da fila: " + c.chamarProximo();
        addMessage(proximoFila, "");

    }

    public void reiniciarSenhas() {

        ControleSenhas c = new ControleSenhas();
        c.ReiniciarSenhas();
        addMessage("Senhas Reiniciadas", "");
    }
    

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
