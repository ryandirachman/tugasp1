package belajar.payroll;

import java.util.List;
import java.util.ArrayList;
import java.io.File;

public class DemoBacaFileAbsen {
    public static void main(String[] xx) throws Exception {
        String namafilePegawai = "data"+ File.separator +"tarif.txt";
        String namafileAbsen = "data"+ File.separator +"absen.txt";
		String namafileTakehome = "data"+ File.separator +"takehome.txt";
        
        PegawaiDao pd = new PegawaiDao(namafilePegawai);
        AbsenDao ad = new AbsenDao(namafileAbsen, pd);
        List<Absen> daftarAbsen = ad.semuaData();
        
        // tampilkan isi daftar pegawai
        for(Absen px : daftarAbsen){
            System.out.println("========================");
            System.out.println("Nomer Pegawai: "+px.getPegawai().getNomer());
            System.out.println("Nama Pegawai: "+px.getPegawai().getNama());
            System.out.println("Gaji Pokok: "+px.getPegawai().getGaji());
            System.out.println("Jam Datang: "+px.getDatang());
            System.out.println("Jam Pulang: "+px.getPulang());
        }
    }
}
