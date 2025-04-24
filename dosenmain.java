public class dosenmain {
    static void urutkanberdasarkanNIDN(dosen01[] daftardosen){
        // menggunakan bubble sort
        for (int i = 0; i < daftardosen.length - 1; i++) { 
            for (int j = 0; j < daftardosen.length -1; j++) {
                if (daftardosen[j].nidn > daftardosen[j+1].nidn) {
                    dosen01 temp = daftardosen[j];
                    daftardosen[j] = daftardosen [j+1];
                    daftardosen [j+1] = temp;
                }
            }
        }
    }
    static void carinamadosen (dosen01 [] daftardosen, String carinama, int tahunSekarang){
        // linear search
        boolean ditemukan = false;
        for (dosen01 a : daftardosen){
            if (a.nama.equalsIgnoreCase(carinama)) {
                System.out.println("Dosen berhasil ditemukan");
                System.out.println("NIDN: " + a.nidn);
                System.out.println("Nama: " + a.nama);
                System.out.println("Email: " + a.email);
                System.out.println("Tahun Masuk: " + a.tahunMasuk);
                System.out.println("Program studi: " + a.prodi);
                System.out.println("Masa Kerja: " + a.getKerjasekarang(tahunSekarang) + " tahun");
                System.out.println("=========================");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + carinama + "Tidak berhasil ditemukan");
        }
    }
    static void urutkanberdasarkanMasaKerja(dosen01[] daftardosen, int tahunSekarang){
        // menggunakan bubble sort
        for (int i = 0; i < daftardosen.length - 1; i++) {
            for (int j = 0; j < daftardosen.length - 1; j++) {
                if (daftardosen[j].getKerjasekarang(tahunSekarang) < daftardosen [j+1].getKerjasekarang(tahunSekarang)) {
                    dosen01 temp = daftardosen[j];
                    daftardosen[j] = daftardosen [j+1];
                    daftardosen[j+1] = temp; 
                }
            }
        }
    }
}
