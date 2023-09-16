import java.util.Scanner;

public class autenticacao {

    static Scanner scanner = new Scanner(System.in);
    public static boolean loginUsuario() {
        System.out.println("Usuário: ");
        String loginUser = scanner.next();
        System.out.println("Senha: ");
        String passUser = scanner.next();
        if (loginUser.equals("user") && passUser.equals("user")) {
            return true;
        } else {
            System.out.println("Usuario ou Senha Errado.");
            menu.menuUsuarioLogin();
        } return false;
    }

    public static boolean loginAdmin() {

        return true;
    }

}
