/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PUGA
 */
public class Produk {
    private Integer Id_Produk;
    private String Jenis;
    private Integer Harga_satuan;
    private Integer Stok;
    
    public Integer getStok() {
        return Stok;
    }

    public void setStok(Integer Stok) {
        this.Stok = Stok;
    }
    
    public Integer getId_Produk() {
        return Id_Produk;
    }

    public void setId_Produk(Integer Id_Produk) {
        this.Id_Produk = Id_Produk;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public Integer getHarga_satuan() {
        return Harga_satuan;
    }

    public void setHarga_satuan(Integer Harga_satuan) {
        this.Harga_satuan = Harga_satuan;
    }

}
