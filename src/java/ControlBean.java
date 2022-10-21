
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author HP
 */
@ManagedBean
@SessionScoped
public class ControlBean {

    /**
     * Creates a new instance of ControlBean
     */
    private List<MahasiswaBean> mahasiswaList;
    private MahasiswaBean mahasiswa;
    
    @PostConstruct
    public void init()
    {
    mahasiswaList = new ArrayList<MahasiswaBean>();  
    mahasiswa = new MahasiswaBean("", "");
    }
     

    public List<MahasiswaBean> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<MahasiswaBean> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }

    public MahasiswaBean getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(MahasiswaBean mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public void insert()
    {
        mahasiswaList.add(mahasiswa);
        mahasiswa=new MahasiswaBean("", "");
    }
    public void update()
    {
        mahasiswa= new MahasiswaBean("", "");
    }
    public void delete()
    {
        mahasiswaList.remove(mahasiswa);
        mahasiswa=new MahasiswaBean("", "");
    }
    public ControlBean() {
    }
    
}
