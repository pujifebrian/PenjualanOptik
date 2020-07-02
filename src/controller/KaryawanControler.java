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

/**
 *
 * @author PUGA
 */
public class KaryawanControler {
    Koneksi koneksi;
    ArrayList<Karyawan> arrKaryawan;
    public KaryawanControler() throws SQLException{
        this.koneksi=new Koneksi();
        this.arrKaryawan=new ArrayList<>();
    }
    
    public void insertKaryawan(Karyawan karyawan) {
                this.koneksi.ManipulasiData("INSERT INTO KARYAWAN (ID_KARYAWAN, NAMA) "
                + "VALUES ('"+karyawan.getId_Karyawan()+"','"+ karyawan.getNama_Karyawan() +"')");
        System.out.println("INSERT INTO KARYAWAN (ID_KARYAWAN, NAMA) "
                + "VALUES ('"+karyawan.getId_Karyawan()+"','"+ karyawan.getNama_Karyawan() +"')");
    }
    
    public void deleteKaryawan(Karyawan karyawan){
        this.koneksi.ManipulasiData("DELETE FROM KARYAWAN WHERE ID_KARYAWAN = " + karyawan.getId_Karyawan());
    }
    
    public void UpdateKaryawan(Karyawan karyawan){
        this.koneksi.ManipulasiData("UPDATE KARYAWAN SET "+" Nama = '"+ karyawan.getNama_Karyawan() +"' WHERE ID_KARYAWAN = " + karyawan.getId_Karyawan());
        System.out.println("UPDATE KARYAWAN SET "+" Nama = '"+ karyawan.getNama_Karyawan() +"' WHERE ID_KARYAWAN = " + karyawan.getId_Karyawan());
    }
    
    public ArrayList<Karyawan> getDataKaryawan() throws SQLException{
        this.arrKaryawan.clear();
        ResultSet rs=this.koneksi.GetData("SELECT * FROM KARYAWAN ORDER BY ID_KARYAWAN ASC");
        while(rs.next()){
            Karyawan karyawan = new Karyawan();
            karyawan.setId_Karyawan(rs.getInt("ID_KARYAWAN"));
            karyawan.setNama_Karyawan(rs.getString("NAMA"));
            
            this.arrKaryawan.add(karyawan);
        }
        return this.arrKaryawan;
    }
}
