import java.util.InputMismatchException;
import java.util.*;

public class App {
    private static String NoHp;

    public static void main(String[] args) {
        String k = "true";
        Integer HargaBarang = 0;
        Integer JumlahBeli = 0;
        Login vio1 = new Login();

         //update username dan password
         Scanner scanner = new Scanner(System.in);
         updatePegawai.updateEmployeeCredentials(scanner);
         System.out.println("");
 
         //membuat data pegawai baru
         Scanner scanNEW = new Scanner(System.in);
         addMember.insertEmployeeData(scanNEW);
         System.out.println("");
         Login br = new Login();
 
          //hapus pegawai
          removePegawai.deleteEmployeeById();
          System.out.println("");
          
           //login employee
         Login login = new Login();

        while(k.equals("true")){
            boolean input = false;
            Scanner vio = new Scanner(System.in);
            Scanner pioo = new Scanner(System.in);
            System.out.print("Kasir:           : ");
            String Kasir= vio.nextLine();
            System.out.print("Nama Pelanggan   : ");
            String NamaPelanggan = vio.nextLine();
            System.out.print("Alamat           : ");
            String Alamat = vio.next();
            System.out.print("Nama Barang      : ");
            String NamaBarang = vio.next();

                do{
                    try {
                        System.out.print("Harga Barang     : ");
                        HargaBarang = pioo.nextInt();
                        input = true;
                    } catch (InputMismatchException e) {
                    System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                    pioo.next();}
                }while(!input); 
            input = false;
                do{
                    try {
                        System.out.print("Jumlah Beli      : ");
                        JumlahBeli = pioo.nextInt();
                        input = true;
                    } catch (Exception e) {
                        System.out.println("Input yang dimasukkan bukan bilangan bulat.");
                        pioo.next();}
                }while(!input);
            
            Penjualan senin  = new Penjualan(Kasir, NamaPelanggan, Alamat, NoHp, NamaBarang, HargaBarang, JumlahBeli);

            Scanner selasa = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("ketik true untuk melanjutkan");
            k = selasa.next();
            System.out.println();
        }
    }
}
