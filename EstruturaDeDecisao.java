package pedro.arthur.teste.JVemTranqu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        Comparacao();
        Datas();
    }

    static void Comparacao() {
        String frase = "Hoje é sábado"; //frase é a variável, string é o tipo
        if (frase.contains("segunda-feira")) {
            System.out.println("Tristeza");
        } else if (frase.contains("sexta-feira") || (frase.contains("sábado")) || (frase.contains("domingo"))) {
            System.out.println("Aohhhh potência");
        } else {
            System.out.println("Dia bom ou bom dia?");
        }

    }

    private static void Datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/YYYY").parse("20/12/2008");
        if (data.before(new Date())) {
            System.out.println("Esse dia já passou");
        } else {
            System.out.print("Esse dia não passou");
        }}}