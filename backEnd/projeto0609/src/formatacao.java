import java.util.Locale;

public class formatacao {
    public static void main(String[]args){
        String nome = "Alves";
        int idade = 16;
        double salario =18000000000000000000000000000000000000000000000000000000000000000000000000000000000.0;

            Locale.setDefault(new Locale("PT","BR"));
            System.out.printf("%s tem %d anos e ganha £ %.2f%n", nome, idade, salario);

        }




    }

