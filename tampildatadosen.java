public class tampildatadosen {
    static void tampilkanDosen(dosen01[] daftardosen, int tahunSekarang) {
        System.out.println("==== DATA DOSEN ====");
        for (dosen01 a : daftardosen) {
            System.out.println("NIDN: " + a.nidn);
            System.out.println("Nama: " + a.nama);
            System.out.println("Email: " + a.email);
            System.out.println("Tahun Masuk: " + a.tahunMasuk);
            System.out.println("Prodi: " + a.prodi);
            System.out.println("Lama Kerja: " + a.getKerjasekarang(tahunSekarang) + " tahun");
            System.out.println("=========================");
        }
}
}