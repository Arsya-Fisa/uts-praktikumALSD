public class dosen01 {
    public int nidn;
    public String nama;
    public String email;
    public int tahunMasuk;
    public String prodi;
    
    int getKerjasekarang(int tahunSekarang){
        return tahunSekarang - tahunMasuk;
    }
}