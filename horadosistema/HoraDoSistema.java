package horadosistema;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {       
    
        Date relogio = new Date(); // new => cria um objeto da classe Date
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
    }
}
