import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);
    public static void cabecalho(){
        System.out.println("------ MENU ------");
    }

    public static void menuEscolhaUserAdmin (){
        cabecalho();
        System.out.println("    Digite (1) Para Acessar Usuario OU (2) Para Acessar Admin: ");
        String input = scanner.next();
        if (input.equals("1")){
            menuUsuario();
        } else if (input.equals("2")) {
            menuAdmin();
        } else {menuEscolhaUserAdmin();}

    }

    public static void menuUsuario (){
        cabecalho();
        System.out.println("    Faça o Seu Login Como Usuario:");
        boolean auten = autenticacao.loginUsuario();
        if (auten == true){
            System.out.println("Login Correto");
        } else {
            System.out.println("Login Errado");
        }
    }

    public static void menuAdmin (){
        System.out.println("Menu Admin");
    }
}