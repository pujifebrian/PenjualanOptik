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
public class PembeliControler {
    Koneksi koneksi;
    ArrayList<Pembeli> arrPembeli;
    
    public PembeliControler() throws SQLException{
        this.koneksi=new Koneksi();
        this.arrPembeli=new ArrayList<>();
    }
    
    public void insertPembeli(Pembeli pembeli) {
                this.koneksi.ManipulasiData("INSERT INTO PEMBELI (ID_PEMBELI, _PEMBELI, NO_TELP) "
                + "VALUES ('"+pembeli.getId_Pembeli()+"','"+ pembeli.getNama_Pembeli() +"','"+ pembeli.getNo_telp() +"')");
        System.out.println("INSERT INTO PEMBELI (ID_PEMBELI, _PEMBELI, NO_TELP) "
                + "VALUES ('"+pembeli.getId_Pembeli()+"','"+ pembeli.getNama_Pembeli() +"','"+ pembeli.getNo_telp() +"')");
    }
    
    public void deletePembeli(Pembeli pembeli){
        this.koneksi.ManipulasiData("DELETE FROM PEMBELI WHERE ID_PEMBELI= " + pembeli.getId_Pembeli());
    }
    
    public ArrayList<Pembeli> getDataPembeli() throws SQLException{
        this.arrPembeli.clear();
        ResultSet rs=this.koneksi.GetData("SELECT * FROM PEMBELI ORDER BY ID_PEMBELI ASC");
        while(rs.next()){
            Pembeli pembeli = new Pembeli();
            pembeli.setId_Pembeli(rs.getInt("ID_PEMBELI"));
            pembeli.setNama_Pembeli(rs.getString("NAMA_PEMBELI"));
            pembeli.setNo_telp(rs.getString("NO_TELP"));
            
            this.arrPembeli.add(pembeli);
        }
        return this.arrPembeli;
    }
}
