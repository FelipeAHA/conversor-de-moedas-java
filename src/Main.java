import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcaoUsuario = 1;

        while (opcaoUsuario != 0){

            String menu = """
                =========================
                [1] Real >> Dólar
                [2] Dólar >> Real
                [3] Real >> Euro
                [4] Euro >> Real 
                [5] Real >> Yuan
                [6] Yuan >> Real
                [0] Sair
                =========================
                """;

            System.out.println(menu);
            System.out.println("Escolha uma das opções válidas: ");

            Scanner scanner = new Scanner(System.in);
            opcaoUsuario = scanner.nextInt();

            if (opcaoUsuario == 0){
                System.out.println("Saindo ...");
                break;
            }

            try {
                System.out.println("Digite o valor que deseja converter: ");
                double valor = scanner.nextDouble();

                ConsultaEConverte consultaEConverte = new ConsultaEConverte();

                switch (opcaoUsuario){
                    case (1):
                        consultaEConverte.consultarEConverter("BRL", "USD", valor);
                        break;
                    case (2):
                        consultaEConverte.consultarEConverter("USD", "BRL", valor);
                        break;
                    case (3):
                        consultaEConverte.consultarEConverter("BRL", "EUR", valor);
                        break;
                    case (4):
                        consultaEConverte.consultarEConverter("EUR", "BRL", valor);
                        break;
                    case (5):
                        consultaEConverte.consultarEConverter("BRL", "CNY", valor);
                        break;
                    case (6):
                        consultaEConverte.consultarEConverter("CNY", "BRL", valor);
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Utilize a vírgula (,) e não o ponto (.) para separar os centavos.");
            }
        }

    }
}