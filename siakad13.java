import java.util.Scanner;

public class siakad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, nilaiAkhirHuruf="",kualifikasi="";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukkan nama:");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM:");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas:");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen:");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis:");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian:");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;
        
        if (nilaiAkhir >=80 && nilaiAkhir <=100) {
            nilaiAkhirHuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiAkhir >=73 && nilaiAkhir <=80){
            nilaiAkhirHuruf = "B+" ;
            kualifikasi = "Lebih Dari Baik";
        }
        else if (nilaiAkhir >=65 && nilaiAkhir <=73){
            nilaiAkhirHuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiAkhir >=60 && nilaiAkhir <=65){
            nilaiAkhirHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
        }
        else if (nilaiAkhir >=50 && nilaiAkhir <=60){
            nilaiAkhirHuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiAkhir >=39 && nilaiAkhir <=50){
            nilaiAkhirHuruf = "D";
            kualifikasi = "Kurang";
        }
        else if  (nilaiAkhir <39){
            nilaiAkhirHuruf = "E";
            kualifikasi = "Gagal";
        }
        else{
            nilaiAkhirHuruf = "ERROR";
        }
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM:" + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Absen: " + absen);
        System.out.println("Masukkan Nilai Kuis: " + nilaiKuis);
        System.out.println("Masukkan Nilai Tugas:" +nilaiTugas);
        System.out.println("Masukkan Nilai Ujian:" +nilaiUjian);
        System.out.println("Mahasiswa dengan nama " + nama +" (NIM " + nim + ")  kelas " + kelas +" nomor absen " + absen);
        System.out.println("Nilai akhir " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " +nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        sc.close();
    }

}