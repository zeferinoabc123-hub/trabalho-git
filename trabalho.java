import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        // CALCULADORA DE MEDIA
        Scanner entrada = new Scanner(System.in);
        double media1;
        double media2;
        System.out.println(""" 
            ================================
            * CALCULE SUA NOTA DO SEMESTRE *
            ================================

                 """);
        System.out.print("Digite a nota do 1° bimestre");
            try {
                media1 = entrada.nextDouble();
            } catch (Exception e) {
                media1 = 0.0;
            }
        System.out.println("\n Digite a nota do 2° bimestre");
        try {
                media2 = entrada.nextDouble();
            } catch (Exception e) {
                media2 = 0.0;
            }
    }
}
