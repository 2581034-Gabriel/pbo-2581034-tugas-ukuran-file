import java.util.Scanner;

public class UkuranFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaFile;
       // variabel untuk menyimpan teks

        System.out.print("Nama file     : ");
        namaFile = input.nextLine();

        // menentukan apakah nama file mengandung .mp4 atau tidak
        while (!namaFile.contains(".mp4")) {
            System.out.println("Nama file harus memiliki .mp4");
            System.out.print("Nama file     : ");
            namaFile = input.nextLine();
        }

        // Ukuran file menggunakan long karena nilainya bisa besar, jika menggunakan int ukuran file bisa melebihi batas int
        System.out.print("Ukuran (byte) : ");
        long ukuranByte = input.nextLong();

        final double SATU_KB = 1024.0;
        // final artinya nilai tidak dapat diubah
        // 1024.0 digunakan agar java melakukan pembagian menggunakan tipe data double sehingga melakukan pembagian angka dengan desimal

        double ukuranKB = ukuranByte / SATU_KB;
        double ukuranMB = ukuranKB / SATU_KB;
        double ukuranGB = ukuranMB / SATU_KB;

        // (int) mengubah double menjadi int dan menghilangkan angka di belakang koma
        int ukuranMBBulat = (int) ukuranMB;

        double selisih = ukuranMB - ukuranMBBulat;

    }
}