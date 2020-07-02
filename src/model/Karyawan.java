/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author PUGA
 */
public class Karyawan {
    private Integer Id_Karyawan;
    private String Nama_Karyawan;

    public Integer getId_Karyawan() {
        return Id_Karyawan;
    }

    public void setId_Karyawan(Integer Id_Karyawan) {
        this.Id_Karyawan = Id_Karyawan;
    }

    public String getNama_Karyawan() {
        return Nama_Karyawan;
    }

    public void setNama_Karyawan(String Nama_Karyawan) {
        this.Nama_Karyawan = Nama_Karyawan;
    }
    
}
