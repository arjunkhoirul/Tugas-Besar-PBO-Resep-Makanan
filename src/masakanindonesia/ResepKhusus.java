/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masakanindonesia;

/**
 *
 * @author Asus
 */
public class ResepKhusus extends ResepDasar {
    private String bahanKhusus;

    public ResepKhusus(String nama, String bahanKhusus) {
        super(nama);
        this.bahanKhusus = bahanKhusus;
    }

    public String getBahanKhusus() {
        return bahanKhusus;
    }

    public void setBahanKhusus(String bahanKhusus) {
        this.bahanKhusus = bahanKhusus;
    }

    @Override
    public void tampilkanResep() {
        super.tampilkanResep();
        System.out.println("Bahan Khusus: " + bahanKhusus);
    }
}
