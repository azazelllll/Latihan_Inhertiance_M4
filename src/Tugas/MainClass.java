package Tugas;
import java.io.*;
public class MainClass{
    public static void main(final String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Kembali = "";
        int total = 0;
        while (true) {
            System.out.println("--- SELAMAT DATANG DI PEMESANAN TIKET ---");
            System.out.print("Masukkan jumlah penumpang: ");
            int jumlah = Integer.parseInt(br.readLine());     
            System.out.print("Masukkan Kota Asal : ");
            String asal = br.readLine();
            System.out.println("Pilihan rute tujuan: ");
            System.out.println("1. Bali");
            System.out.println("2. Lombok");
            System.out.println("3. Surabaya");
            System.out.println("4. Yogyakarta");
            System.out.println("5. Balikpapan");
            System.out.println("6. Makassar");
            System.out.println("7. Jakarta");
            System.out.print("Masukkan Kota Tujuan : ");
            String tujuan = br.readLine();
            System.out.print("Masukkan Tanggal Berangkat : ");
            String Berangkat = br.readLine();
            System.out.print("Apakah Pesan untuk Pulang-Pergi?(Y/N) : ");
            String pilihan = br.readLine();
            if (pilihan.equalsIgnoreCase("Y")) {
                System.out.print("Tanggal kembali : ");
                Kembali = br.readLine();
            }
            System.out.println("\n --- Pilih Maskapai ---");
            System.out.println("1. Lion Air");
            System.out.println("2. Citilink");
            System.out.print("Pilih maskapai : ");
            int maskapai = Integer.parseInt(br.readLine());
            System.out.println("");
            LionAir[] lionair = new LionAir[jumlah];
            Citilink[] citilink = new Citilink[jumlah];
            switch (maskapai) {
                case 1: 
                    System.out.println("---SELAMAT DATANG DI MASKAPAI LION AIR ---");
                    System.out.println("Silahkan isi data penumpang Lion Air");
                    for (int i = 0; i < lionair.length; i++) {
                        System.out.print("Booking ID : ");
                        String bookingID = br.readLine();
                        System.out.print("NIK : ");
                        String nik = br.readLine();
                        System.out.print("Nama : ");
                        String nama = br.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = br.readLine();
                        System.out.print("No pesawat : ");
                        String Pesawat = br.readLine();
                        System.out.print("No kursi : ");
                        String Kursi = br.readLine();
                        lionair[i] = new LionAir(jumlah, 0, tujuan, Pesawat, Kursi, bookingID, nik, nama, jk, Berangkat, Kembali,asal);
                        System.out.println("");
                    }
                    for (int i = 0; i < lionair.length; ++i) {
                        System.out.println(" PRINT TIKET LION AIR");
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + lionair[i].getBookingID());
                        System.out.println("NIK : " + lionair[i].getNik());
                        System.out.println("Nama : " + lionair[i].getNama() + "(" + lionair[i].getJenis_kelamin()+")");
                        System.out.println("Kota Asal : " + lionair[i].getKotaAsal());
                        System.out.println("Kota Tujuan : " + lionair[i].getKotaTujuan());
                        System.out.println("Tanggal berangkat : " + lionair[i].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + lionair[i].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + lionair[i].getNoPesawat());
                        System.out.println("Nomor kursi : " + lionair[i].getNoKursi());
                        System.out.println("Harga tiket : " + lionair[i].getHarga());
                        total = lionair[i].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Pesan lagi? (Y/N) : ");
                    pilihan = br.readLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        System.exit(0);
                        continue;
                    }
                break;
                case 2: 
                    System.out.println("-- Selamat datang di Citilink --");
                    System.out.println("Silahkan isi data penumpang");
                    for (int i = 0; i < citilink.length; ++i) {
                        System.out.print("Booking ID : ");
                        String bookingID = br.readLine();
                        System.out.print("NIK : ");
                        String nik = br.readLine();
                        System.out.print("Nama : ");
                        String nama = br.readLine();
                        System.out.print("Jenis kelamin (P/L) : ");
                        String jk = br.readLine();
                        System.out.print("No pesawat : ");
                        String Pesawat = br.readLine();
                        System.out.print("No kursi : ");
                        String Kursi = br.readLine();
                        citilink[i] = new Citilink(jumlah, 0, tujuan, Pesawat, Kursi, bookingID, nik, nama, jk, Berangkat, Kembali,asal);
                        System.out.println("");
                    }
                    for (int i = 0; i < citilink.length; ++i) {
                        System.out.println("Preview Tiket CITILINK");
                        System.out.println("=========================");
                        System.out.println("Booking ID : " + citilink[i].getBookingID());
                        System.out.println("NIK : " + citilink[i].getNik());
                        System.out.println("Nama : " + citilink[i].getNama() + "/ " + citilink[i].getJenis_kelamin());
                        System.out.println("Kota Asal : " + citilink[i].getKotaAsal());
                        System.out.println("Kota Tujuan : " + citilink[i].getKotaTujuan());
                        System.out.println("Tanggal berangkat : " + citilink[i].getTgl_berangkat());
                        System.out.println("Tanggal kembali : " + citilink[i].getTgl_kembali());
                        System.out.println("Nomor pesawat : " + citilink[i].getNoPesawat());
                        System.out.println("Nomor kursi : " + citilink[i].getNoKursi());
                        System.out.println("Harga tiket : " + citilink[i].getHarga());
                        total = citilink[i].getTotal();
                        System.out.println("");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("");
                    System.out.print("Pesan lagi? (Y/N) : ");
                    pilihan = br.readLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        System.exit(0);
                        continue;
                    }
                    break;
                case 3: {
                    System.exit(0);
                break;
                }
            }
        }
    }
}

