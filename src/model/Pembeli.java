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
public class Pembeli {
    private Integer Id_Pembeli;
    private String Nama_Pembeli;
    //private String Jenis_Kelamin;
    private String No_telp;
    
    public Integer getId_Pembeli() {
        return Id_Pembeli;
    }

    public void setId_Pembeli(Integer Id_Pembeli) {
        this.Id_Pembeli = Id_Pembeli;
    }

    public String getNama_Pembeli() {
        return Nama_Pembeli;
    }

    public void setNama_Pembeli(String Nama_Pembeli) {
        this.Nama_Pembeli = Nama_Pembeli;
    }

//    public String getJenis_Kelamin() {
//        return Jenis_Kelamin;
//    }

//    public void setJenis_Kelamin(String Jenis_Kelamin) {
//        this.Jenis_Kelamin = Jenis_Kelamin;
//    }

    public String getNo_telp() {
        return No_telp;
    }

    public void setNo_telp(String No_telp) {
        this.No_telp = No_telp;
    }
     
}
