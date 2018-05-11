package Controller;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ControleSenhas {

    int passaPrioritario;

    public static List<String> normal = new ArrayList<>();
    public static List<String> preferencial = new ArrayList<>();

    String senha;

    SenhasNormais sn = new SenhasNormais();
    SenhasPreferenciais sp = new SenhasPreferenciais();

    public void pegarSenhaNormal(String senha) {
        normal.add(senha);
    }

    public void pegarSenhaPreferencial(String senha) {
        preferencial.add(senha);
    }

    public String chamarProximo() {
        if (preferencial.isEmpty() && normal.isEmpty()) {
            return "Não há senhas na fila para serem chamadas";
        }
        
        if (preferencial.size() > 0) {
            senha = preferencial.get(0);
            preferencial.remove(0);
        } else {
            senha = normal.get(0);
            normal.remove(0);
        }
        
        return senha;
    }

    public void ReiniciarSenhas() {
        normal.clear();
        preferencial.clear();
    }
}
