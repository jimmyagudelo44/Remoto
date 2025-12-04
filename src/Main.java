import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner KB = new Scanner(System.in);

        System.out.print("Cuantos popochos tienes? ");
        int popocho;
        while((popocho = KB.nextInt())<0){
            System.err.println("ERROR. El numero de popochos no puede ser menor que 0");
        }

        switch (popocho) {
            case 0:
                System.out.println("Deberias conseguir uno");
                break;
            case 1:
                System.out.println("El popocho esta muy mimado");
                break;
            case 2,3:
                System.out.println("La familia de popochos es muy equilibrada");
                break;
            default:
                System.out.println("Demasiados popochos, no habra espacio en la cama");
                break;
        }
    }
}