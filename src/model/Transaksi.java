/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author PUGA
 */
public class Transaksi {
    private Integer Id_transaksi;
    private Pembeli Id_Pembeli;
    private Produk Id_Produk;
    private Karyawan Id_Karyawan;
    private Double Harga_total;
    private Date Tanggal_Pembelian;
    private ArrayList<Transaksi>arrTransaksi;

    public Date getTanggal_Pembelian() {
        return Tanggal_Pembelian;
    }

    public void setTanggal_Pembelian(Date Tanggal_Pembelian) {
        this.Tanggal_Pembelian = Tanggal_Pembelian;
    }

    public ArrayList<Transaksi> getArrTransaksi() {
        return arrTransaksi;
    }

    public void setArrTransaksi(ArrayList<Transaksi> arrTransaksi) {
        this.arrTransaksi = arrTransaksi;
    }

    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }

    public Pembeli getId_Pembeli() {
        return Id_Pembeli;
    }

    public void setId_Pembeli(Pembeli Id_Pembeli) {
        this.Id_Pembeli = Id_Pembeli;
    }

    public Produk getId_Produk() {
        return Id_Produk;
    }

    public void setId_Produk(Produk Id_Produk) {
        this.Id_Produk = Id_Produk;
    }

    public Karyawan getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(Karyawan Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public Double getHarga_total() {
        return Harga_total;
    }

    public void setHarga_total(Double Harga_total) {
        this.Harga_total = Harga_total;
    }
    
}
