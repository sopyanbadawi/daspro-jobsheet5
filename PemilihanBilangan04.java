import java.util.Scanner;

 public class PemilihanBilangan04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
    
    System.out.println("Masukkan sebuah angka: ");
    int angka = sc.nextInt();
    
    String hasil = (angka % 2 == 0 ) ? "bilangan genap" 
                                    : "bilangan ganjil";
    System.out.println("Angka " + angka + " adalah " + hasil);

    }
 }