
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author HP
 
@Named(value = "mahasiswaBean")
@Dependent
*/
@ManagedBean
@SessionScoped



public class MahasiswaBean {

    /**
     * Creates a new instance of MahasiswaBean
     */
    public String scode, nama;

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public MahasiswaBean(String scode,String nama) {
        this.scode = scode;
        this.nama = nama;
    }
    
}
