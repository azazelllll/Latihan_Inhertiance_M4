package Tugas;

public class Tiket
{
    private String bookingID;
    private String nik;
    private String nama;
    private String jenis_kelamin;
    private String tgl_berangkat;
    private String tgl_kembali;
    private String kotaAsal;
    
    public Tiket(String bookingID,String nik,String nama,String jenis_kelamin,String tgl_berangkat, 
            String tgl_kembali, String kotaAsal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tgl_berangkat = tgl_berangkat;
        this.tgl_kembali = tgl_kembali;
        this.kotaAsal = kotaAsal;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTgl_berangkat() {
        return tgl_berangkat;
    }

    public String getTgl_kembali() {
        return tgl_kembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
    }