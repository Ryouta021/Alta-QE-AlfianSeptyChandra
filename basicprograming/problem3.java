import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input angka : ");
        int angka = scan.nextInt();

        System.out.print("Faktor-faktor dari " + angka + " adalah: ");
        for (int i = 1; i <= angka; i++){
            if (angka % i == 0){
                System.out.print(i +";");
            }
        }

    }
}
