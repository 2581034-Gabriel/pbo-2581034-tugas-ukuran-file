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

    }
}