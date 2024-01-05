/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package masakanindonesia;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface Resep {
    String getNama();
    void setNama(String nama);
    List<Bahan> getBahan();
    void setBahan(List<Bahan> bahan);
    void tambahBahan(Bahan bahan);
    void tampilkanResep();
}
