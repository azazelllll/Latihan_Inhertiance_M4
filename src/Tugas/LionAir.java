package Tugas;
public class LionAir extends Tiket{
    private int jmlhPenumpang;
    private int harga;
    private String kotaTujuan;
    private String noPesawat;
    private String noKursi;

    public LionAir(int jmlhPenumpang, int harga, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tgl_berangkat, String tgl_kembali, String kotaAsal) {
        super(bookingID, nik, nama, jenis_kelamin, tgl_berangkat, tgl_kembali, kotaAsal);
        this.jmlhPenumpang = jmlhPenumpang;
        this.harga = harga;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJmlhPenumpang() {
        return jmlhPenumpang;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    
    public int getHarga() {
        if (super.getKotaAsal().equalsIgnoreCase("Surabaya")) {
            if (getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 500000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Jakarta") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 600000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 700000;
            }
            else {
                System.out.println("Rute tidak tersedia");
            }
        }
        else if (super.getKotaAsal().equalsIgnoreCase("Jakarta")) {
            if(getKotaTujuan().equalsIgnoreCase("Bali") || getKotaTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 700000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Surabaya") || getKotaTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            }
            else if (getKotaTujuan().equalsIgnoreCase("Balikpapan") || getKotaTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 800000;
            }
            else {
                System.out.println("Rute tidak tersedia");
            }
        }
        return this.harga;
    }
    
    int getTotal() {
        return this.getHarga() * this.getJmlhPenumpang();
    }
}
