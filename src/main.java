import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //Input Keyboard
        String jenis;
        String na;
        int harga;

        System.out.println("==================================");
        System.out.println("========= Pesan Makanan =========");
        System.out.println("==================================");
        System.out.print("Masukkan nama: ");
        String nama = input.next();
        System.out.print("Masukkan nomor telepon: ");
        String nomor = input.next();

        Food user = new Food();
        user.setNama(nama);
        user.setTelepon(nomor);

        System.out.println("Pilihan Makanan: ");
        System.out.println("1. Fried Chiken");
        System.out.println("2. Pizza");
        System.out.println("3. Salad");
        System.out.print("Masukkan pilihan: ");
        int a = input.nextInt();
        if(a==1){
            na = "Fried Chiken";
            jenis = "Fast Food";
            harga = 15000;
        }else if (a==2){
            na = "Pizza";
            jenis = "Italian Food";
            harga = 30000;
        }else {
            na = "Salad";
            jenis = "Healthy Food";
            harga = 10000;
        }
        user.setNamaMakanan(na);
        user.setJenis(jenis);
        user.setHarga(harga);

        System.out.println("\n");
        System.out.println("==================================");
        System.out.println("==========Nota Pemesenan==========");
        System.out.println("==================================");
        System.out.println("Nama Kustomer\t\t: "+user.getNama());
        System.out.println("Nomer Telepon\t\t: "+user.getTelepon());
        System.out.println("==================================");
        System.out.println("Nama Makanan\t\t: "+user.getNamaMakanan());
        System.out.println("Jenis Makanan\t\t: "+user.getJenis());
        System.out.println("Harga Makanan\t\t: "+user.getHarga()+ " Rupiah");
        System.out.println("\n");
        System.out.println(user.getDetails());
        System.out.println("==================================");
    }
}
