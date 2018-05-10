package Controller;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class SenhasNormais {
    
       
public  String gerarSenhaAleatoriaNormal(String senha2) {   
        int qtdeMaximaCaracteres = 4;
       String [] senhaN = { "0","1", "2", "4", "5", "6", "7", "8","9"};
       
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * senhaN.length);
            senha.append(senhaN[posicao]);
            senha2=toString()+senha;
        }
     return senha2;
    }  

@Override
public String toString(){
 return "N";
    
}

}

