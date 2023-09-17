import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class autenticacao {

    public static Map<String, String> usuariosMap = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);


    public static void loginUsuario (){
        //clientes x = new clientes();
        //HashMap<String, String> usuariosMap = x.getUserAut();
        System.out.println("    Digite Seu Nome De Usuário: ");
        String inputLoginUser = scanner.next();
        System.out.println("    Digite Sua Senha: ");
        String inputPassUser = scanner.next();
        if (usuariosMap.containsKey(inputLoginUser)){
            if (usuariosMap.get(inputLoginUser).equals(inputPassUser)){
                menu.menuUsuario();
            } else {System.out.println("Senha Incorreta"); menu.menuCriarOuLoginUser();}
        } else {System.out.println("Usuário Não Encontrado"); menu.menuCriarOuLoginUser();}
    }

    public static void registroUser (){
        //clientes x = new clientes();
        //HashMap<String, String> UsuariosMap = x.getUserAut();
        System.out.println("    Digite Um Nome de Usuário: ");
        String resLoginUser = scanner.next();
        System.out.println("    Digite Uma Senha Forte: ");
        String resPassUser = scanner.next();
        usuariosMap.put(resLoginUser, resPassUser);
        menu.menuCriarOuLoginUser();
    }

    public static boolean loginAdmin() {

        return true;
    }

}
