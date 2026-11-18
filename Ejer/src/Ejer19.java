import java.util.Scanner;

public class Ejer19 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String contra = "dam2026";
        System.out.println("contra: ");
        String consola = sc.nextLine();

        while (!contra.equals(consola)){
            System.out.println("Mal");
            consola = sc.nextLine();
        }

        System.out.println("Contra correcta");
    }


}
