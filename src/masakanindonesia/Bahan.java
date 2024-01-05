/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masakanindonesia;

/**
 *
 * @author Asus
 */
public class Bahan {
    private String nama;
    private String jumlah;

    public Bahan(String nama, String jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String toString() {
        return nama + " (" + jumlah + ")";
    }
}
