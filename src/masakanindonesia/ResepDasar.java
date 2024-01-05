/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masakanindonesia;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Asus
 */
public class ResepDasar implements Resep {
    private String nama;
    private List<Bahan> bahan;

    public ResepDasar(String nama) {
        this.nama = nama;
        this.bahan = new ArrayList<>();
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public List<Bahan> getBahan() {
        return bahan;
    }

    @Override
    public void setBahan(List<Bahan> bahan) {
        this.bahan = bahan;
    }

    @Override
    public void tambahBahan(Bahan bahan) {
        this.bahan.add(bahan);
    }

    @Override
    public void tampilkanResep() {
        System.out.println("Resep: " + nama);
        System.out.println("Bahan-bahan:");
        for (Bahan bahan : bahan) {
            System.out.println("- " + bahan);
        }
    }
}
