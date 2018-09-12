package java_pak_arifin;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program_Kasir {

    public static void main(String[] args) {

        System.out.println("Identitas : Candra Saka Rahardian / XR6 / 12 \n");
        
        
        String[] namaBrg = {"Buku", "Penggaris", "Penghapus", "Bolpoin", "Tipe-X", "Pensil"};
        int jumlahBrg, hargaBrg = 0, kodeBrg, total, totalA = 0, kembali, bayar, kembalian ;
        String nama;
        Scanner masuk = new Scanner(System.in);

        do {
            System.out.println("\n        Selamat Datang");
            System.out.println("       --Toko Rizkuy--");
            System.out.println("Hanya menjual dalam bentuk pack \n");
            nama = JOptionPane.showInputDialog("Masukan Nama Kasir");
            System.out.println("\n Nama kasir : " + nama);
            
            
            kodeBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Kode Barang"));
        if (kodeBrg == 1) {
            hargaBrg = 30000;
            System.out.println("Nama barang : " + namaBrg[0]);
            System.out.println("Harga Rp." + hargaBrg);
        } else if (kodeBrg == 2) {
            hargaBrg = 15000;
            System.out.println("Nama barang : " + namaBrg[1]);
            System.out.println("Harga Rp." + hargaBrg);
        } else if (kodeBrg == 3) {
            hargaBrg = 12000;
            System.out.println("Nama barang : " + namaBrg[2]);
            System.out.println("Harga Rp." + hargaBrg);
        } else if (kodeBrg == 4) {
            hargaBrg = 20000;
            System.out.println("Nama barang : " + namaBrg[3]);
            System.out.println("Harga Rp." + hargaBrg);
        } else if (kodeBrg == 5) {
            hargaBrg = 25000;
            System.out.println("Nama barang : " + namaBrg[4]);
            System.out.println("Harga Rp." + hargaBrg);
        } else if (kodeBrg == 6) {
            hargaBrg = 18000;
            System.out.println("Nama barang : " + namaBrg[5]);
            System.out.println("Harga Rp." + hargaBrg);
        } else {
            System.out.println("Pilihan tidak ada");
            System.exit(0);
        }
            System.out.print("Masukkan jumlah barang : ");
        jumlahBrg = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Barang"));

        total = hargaBrg * jumlahBrg;
        System.out.println("Total Harga Rp" + (int) total);

            if (total > 500000) {
                totalA = total * 50/100;
                System.out.println("Total : Rp. " + total);
                System.out.println("Anda mendapatkan diskon 50%");
                System.out.println("Harga yang harus di bayar : Rp. " + totalA);
                System.out.println(totalA);
            } else if (total > 200000) {
                totalA = total * 80/100;
                System.out.println("Total : Rp. " + total);
                System.out.println("Anda mendapatkan diskon 20%");
                System.out.println("Harga yang harus di bayar : Rp. " + totalA);
                System.out.println(totalA);
            } else if (total > 100000) {
                totalA = total * 90/100;
                System.out.println("Total : Rp. " + total);
                System.out.println("Anda mendapatkan diskon 10%");
                System.out.println("Harga yang harus di bayar : Rp. " + totalA);
                System.out.println(totalA);
            } else if (total < 100000) {
                totalA = total;
                System.out.println("Total : Rp. " + total);
                System.out.println("Anda tidak mendapatkan diskon");
                System.out.println("Harga yang harus di bayar : Rp. " + totalA);
                System.out.println(totalA);
                
            }
            bayar = Integer.parseInt(JOptionPane.showInputDialog("Uang Diterima"));
            System.out.println("Uang Diterima  : " + bayar);
            kembalian = bayar - totalA;
            System.out.println("Kembalian Anda : " + kembalian);

            System.out.print("Ingin Melakukan Transaksi Lagi? (y=1, n=2)");
            kembali = masuk.nextInt();
        } while (kembali == 1);
        System.out.print("\n Terima Kasih!\n");
    }
}
