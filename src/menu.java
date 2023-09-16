//import java.lang.foreign.SegmentScope;
import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class menu {
    static Scanner scanner = new Scanner(System.in);
    private static void cabecalho(){
        System.out.println("    ***----------- MENU -----------***");
    }





    ///////////////////////////////////////
    //                                  //
    //         MENU DO USUARIO         //
    //                                //
    ///////////////////////////////////

    public static void menuEscolhaUserAdmin (){
        cabecalho();
        System.out.println("    Digite (1) Para Acessar Usuario OU (2) Para Acessar Admin: ");
        String input = scanner.next();
        if (input.equals("1")){
            menuCriarOuLoginUser();
        } else if (input.equals("2")) {
            menuAdminLogin();
        } else {menuEscolhaUserAdmin();}

    }

    public static void menuCriarOuLoginUser (){
        cabecalho();
        System.out.println("    Digite (1) Para Criar Um Novo Usuário ou (2) Para Acessar Um Usuário Existente: ");
        String input = scanner.next();
        if (input.equals("1")){
            menuCriarNovoUser();
        } if (input.equals("2")) {
            menuUsuarioLogin();
        } else {menuCriarOuLoginUser();}
    }

    public static void menuCriarNovoUser (){
        cabecalho();
        System.out.println("Digite Seu Usuário: ");
        String cadUser = scanner.next();
        System.out.println("Digite Uma Senha Segura: ");
        String cadPass = scanner.next();
        System.out.println("Digite Sua Idade: ");
        String cadIdade = scanner.next();
        clientes.getInfos(cadUser, cadPass, cadIdade);
    }

    public static void menuUsuarioLogin (){
        cabecalho();
        System.out.println("    Faça o Seu Login Como Usuario:");
        if (autenticacao.loginUsuario()){
            menuUsuario();
        } else {
            System.out.println("Login Errado");
        }
    }

    public static void menuAdminLogin (){
        cabecalho();
        System.out.println("    Faça o Seu Login Como Usuario:");
        if (autenticacao.loginAdmin()){
            System.out.println("Login Correto");
        } else {
            System.out.println("Login Errado");
        }
    }

    private static void menuUsuario (){
        cabecalho();
        System.out.println("    Escolha Entre As Opções Abaixo:");
        System.out.println("1- Vizualizar Saldo");
        System.out.println("2- Efetuar Saque");
        System.out.println("3- Efetuar Deposito");
        System.out.println("4- Efetuar Transferencia");
        String menuUserInput = scanner.next();
        checkMenuUserInput(menuUserInput);

    }

    private static void checkMenuUserInput(String menuUserinput) {
        if (menuUserinput.equals("1")){
            menuUsuarioSaldo();
        } else if (menuUserinput.equals("2")) {
            menuUsuarioSaque();
        } else if (menuUserinput.equals("3")) {
            menuUsuarioDeposito();
        } else if (menuUserinput.equals("4")) {
            menuUsuarioTransferencia();
        } else {menuUsuario();}
    }

    private static void menuUsuarioTransferencia() {
    }

    private static void menuUsuarioDeposito() {
    }

    private static void menuUsuarioSaque() {
    }

    private static void menuUsuarioSaldo() {
    }




    ///////////////////////////////////////
    //                                  //
    //         FIM MENU DO USUARIO     //
    //                                //
    ///////////////////////////////////


}