import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        // CALCULADORA DE MEDIA
        Scanner entrada = new Scanner(System.in);
        double media1;
        double media2;
        double media;
        System.out.println(""" 
            ================================
            * CALCULE SUA NOTA DO SEMESTRE *
            ================================

                 """);
        System.out.print("Digite a nota do 1° bimestre\n>> ");
            try {
                media1 = entrada.nextDouble();                                        //Daniel e luiz
            } catch (Exception e) {
                media1 = 0.0;
            }
        System.out.print("\nDigite a nota do 2° bimestre\n>> ");
        try {
                media2 = entrada.nextDouble();
            } catch (Exception e) {
                media2 = 0.0;
            }
        media = (media1 + media2) / 2;
        System.out.println("\n=== NOTA FINAL ===");
        System.out.println(">> " + media);
        if(media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
}
