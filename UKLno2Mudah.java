import java.util.Scanner;

public class UKLno2Mudah {
        public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    // bagian 2: Menentukan Ganjil atau Genap
            //=============================
            System.out.println("=== CEK BILANGAN GANJIL / GENAP ===");
            System.out.println("Masukkan bilangan: ");
            int bilangan = input.nextInt();

            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " Adalah bilangan genap");
            }else{ 
                System.out.println(bilangan + " Adalah bilangan ganjil");
            }
            input.close();
    }
}
