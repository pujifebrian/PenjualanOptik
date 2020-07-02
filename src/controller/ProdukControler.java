/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Karyawan;
import model.Pembeli;
import model.Produk;
import model.Transaksi;

/**
 *
 * @author PUGA
 */
public class ProdukControler {
    Koneksi koneksi;
    ArrayList<Produk> arrProduk;
        
    public ProdukControler() throws SQLException{
        this.koneksi=new Koneksi();
        this.arrProduk=new ArrayList<>();
    }
    
    public void insertProduk(Produk produk) {
                this.koneksi.ManipulasiData("INSERT INTO PRODUK (ID_PRODUK, JENIS, HARGA_SATUAN, STOK_PRODUK) "
                + "VALUES ('"+produk.getId_Produk()+"','"+ produk.getJenis() +"','"+ produk.getHarga_satuan() +"','"+ produk.getStok() +"')");
        System.out.println("INSERT INTO PRODUK (ID_PRODUK, JENIS, HARGA_SATUAN, STOK_PRODUK) "
                + "VALUES ('"+produk.getId_Produk()+"','"+ produk.getJenis() +"','"+ produk.getHarga_satuan() +"','"+ produk.getStok() +"')");
    }
    
    public void UpdateProduk(Produk produk){
        this.koneksi.ManipulasiData("UPDATE PRODUK SET "+" JENIS = '"+ produk.getJenis() +"', HARGA_SATUAN = '"
        + produk.getHarga_satuan() +"', STOK_PRODUK = '"+ produk.getStok() +"' WHERE ID_PRODUK = " + produk.getId_Produk());
        System.out.println("UPDATE PRODUK SET "+" JENIS = '"+ produk.getJenis() +"', HARGA_SATUAN = '"
        + produk.getHarga_satuan() +"', STOK_PRODUK = '"+ produk.getStok() +"' WHERE ID_PRODUK = " + produk.getId_Produk());
    }
    
    public void deleteProduk(Produk produk){
        this.koneksi.ManipulasiData("DELETE FROM PRODUK WHERE ID_PRODUK = " + produk.getId_Produk());
    }
    
    public ArrayList<Produk> getDataProduk() throws SQLException{
        this.arrProduk.clear();
        ResultSet rs=this.koneksi.GetData("SELECT * FROM PRODUK ORDER BY ID_PRODUK ASC");
        while(rs.next()){
            Produk produk = new Produk();
            produk.setId_Produk(rs.getInt("ID_PRODUK"));
            produk.setJenis(rs.getString("JENIS"));
            produk.setHarga_satuan(rs.getInt("HARGA_SATUAN"));
            produk.setStok(rs.getInt("STOK_PRODUK"));
            
            this.arrProduk.add(produk);
        }
        return this.arrProduk;
    }
}
