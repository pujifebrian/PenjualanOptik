/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;
import Database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author PUGA
 */
public class Sistem {
    Koneksi koneksi;
    ArrayList<Pembeli> arrPembeli;
    ArrayList<Karyawan> arrKaryawan;
    ArrayList<Produk> arrProduk;
    ArrayList<Transaksi> arrTransaksi;
    
    public Sistem() throws SQLException{
        this.koneksi=new Koneksi();
        this.arrPembeli=new ArrayList<>();
        this.arrKaryawan=new ArrayList<>();
        this.arrProduk=new ArrayList<>();
        this.arrTransaksi=new ArrayList<>();
    }
    public ArrayList<Transaksi> getDataTransaksi() throws SQLException{
        this.arrTransaksi.clear();
        Transaksi transaksi = new Transaksi();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM TRANSAKSI JOIN PEMBELI"
                + " ON PEMBELI.ID_PEMBELI = TRANSAKSI.ID_TRANSAKSI"
                + " JOIN PRODUK"
                + " ON TRANSAKSI.ID_TRANSAKSI = PRODUK.ID_PRODUK"
                + " JOIN KARYAWAN"
                + " ON TRANSAKSI.ID_TRANSAKSI = KARYAWAN.ID_KARYAWAN"
                + " ORDER BY ID_TRANSAKSI ASC");
        while (rs.next()){
            
            Karyawan karyawan = new Karyawan();
            karyawan.setId_Karyawan(rs.getInt("ID_KARYAWAN"));
            karyawan.setNama_Karyawan(rs.getString("NAMA"));
            
            Pembeli pembeli = new Pembeli();
            pembeli.setId_Pembeli(rs.getInt("ID_PEMBELI"));
            pembeli.setNama_Pembeli(rs.getString("NAMA_PEMBELI"));
            pembeli.setNo_telp(rs.getString("NO_TELP"));
            
            Produk produk = new Produk();
            produk.setId_Produk(rs.getInt("ID_PRODUK"));
            produk.setJenis(rs.getString("JENIS"));
            produk.setHarga_satuan(rs.getInt("HARGA_SATUAN"));
            produk.setStok(rs.getInt("STOK_PRODUK"));
            
            this.arrTransaksi.add(transaksi);
        }
        return this.arrTransaksi;
    }
    
}
