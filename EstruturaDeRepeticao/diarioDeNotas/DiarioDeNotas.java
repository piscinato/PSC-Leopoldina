import java.util.Scanner;

public class DiarioDeNotas {
    public static void main(String[] args) {
    Scanner sc = new Scanner ( System.in);
    System.out.println("Digite [1]para aluna e [2] para professor");
    String usuario = sc.nextLine();
    
    switch (usuario) {
        case "1":
        System.out.println("Aluno");
        break;

        case "2":
        System.out.println("professor");
        break;

        default:
        System.out.println("valido");
        break;

    }
}  

}

