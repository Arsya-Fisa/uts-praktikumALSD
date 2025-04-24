import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahunSekarang = 2025;

        dosen01[] daftardosen = new dosen01[4];

        daftardosen[0] = new dosen01();
        daftardosen[0].nidn = 11111;
        daftardosen[0].nama = "Amba";
        daftardosen[0].email = "Amba@google.com";
        daftardosen[0].tahunMasuk = 2018;
        daftardosen[0].prodi = "Kewarganegaraan";

        daftardosen[1] = new dosen01();
        daftardosen[1].nidn = 22222;
        daftardosen[1].nama = "Arsya";
        daftardosen[1].email = "Arsya@google.com";
        daftardosen[1].tahunMasuk = 2021;
        daftardosen[1].prodi = "Bahasa Indonesia";

        daftardosen[2] = new dosen01();
        daftardosen[2].nidn = 33333;
        daftardosen[2].nama = "Karina";
        daftardosen[2].email = "Karina@google.com";
        daftardosen[2].tahunMasuk = 2015;
        daftardosen[2].prodi = "Basis Data";

        daftardosen[3] = new dosen01();
        daftardosen[3].nidn = 44444;
        daftardosen[3].nama = "Nina";
        daftardosen[3].email = "Nina@gmail.com";
        daftardosen[3].tahunMasuk = 2020;
        daftardosen[3].prodi = "Jaringan Komputer";

        int pilihan;
        do{
            System.out.println("===== Sistem Pengolahan Data Dosen =====");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Mengurutkan Data Dosen Berdasarkan NIDN(Nomor Indok Dosen Nasional)");
            System.out.println("3. Mencari Data Dosen Berdasarkan Nama Dosen");
            System.out.println("4. Mengurutkan Data Dosen Berdasarkan Masa Kerja");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda(1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                tampildatadosen.tampilkanDosen(daftardosen, tahunSekarang);
            }else if (pilihan == 2) {
                dosenmain.urutkanberdasarkanNIDN(daftardosen);
                System.out.println("Data Dosen Berhasil Diurutkan Berdasarkan NIDN");
                tampildatadosen.tampilkanDosen(daftardosen, tahunSekarang);
            } else if (pilihan == 3) {
                System.out.println("Masukkan nama dosen yang ingin dicari: ");
                String carinama = sc.nextLine();
                dosenmain.carinamadosen(daftardosen, carinama, tahunSekarang);
            }else if (pilihan == 4) {
                dosenmain.urutkanberdasarkanMasaKerja(daftardosen, tahunSekarang);
                System.out.println("Data Dosen Berhasil Diurutkan Berdasarkan Masa Kerja");
                tampildatadosen.tampilkanDosen(daftardosen, tahunSekarang);
            }else if (pilihan == 5) {
                System.out.println("Keluar dari program. Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}
