package Controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SenhasNormais {

    private String senhaChamada;

    public String getSenhaChamada() {
        return senhaChamada;
    }

    public void setSenhaChamada(String senhaChamada) {
        this.senhaChamada = senhaChamada;
    }

    public SenhasNormais() {
    }

    public void gerarSenhaNormal() {
        ControleSenhas c = new ControleSenhas();
        StringBuilder senha = new StringBuilder();
        String senha2 = null;
        int qtdeMaximaCaracteres = 4;

        String[] senhaN = {"0", "1", "2", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * senhaN.length);
            senha.append(senhaN[posicao]);
            senha2 = toString() + senha;
        }
        
        c.pegarSenhaNormal(senha2);
        setSenhaChamada(senha2);
    }

    @Override
    public String toString() {
        return "N";

    }

}
