package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gnr_hrchy")
public class Hierarchy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hrchy_code;

    @Column(name = "hrchy_l_nm")
    private String hrchy_l_nm;

    @Column(name = "hrchy_f_nm")
    private String hrchy_f_nm;

    @Column(name = "hrchy_code_parnt")
    private String hrchy_code_parnt;

    @Column(name = "hrchy_typ")
    private int hrchy_typ;

    @Column(name = "lvl_no")
    private short lvl_no;

    @Column(name = "inactv_flg")
    private short inactv_flg;

    @Column(name = "inactv_usr_no")
    private int inactv_usr_no;

    @Column(name = "inactv_date")
    private Date inactv_date;

    @Column(name = "inactv_dsc")
    private String inactv_dsc;

    //
    @ManyToOne
    @JoinColumn(name = "usr_no", nullable = false)
    private User user;

    public Hierarchy(){
        super();
    }

    public Hierarchy(String hrchy_l_nm, String hrchy_f_nm, String hrchy_code_parnt, int hrchy_typ, short lvl_no,
                     short inactv_flg, int inactv_usr_no, Date inactv_date, String inactv_dsc, User user) {
        this.hrchy_l_nm = hrchy_l_nm;
        this.hrchy_f_nm = hrchy_f_nm;
        this.hrchy_code_parnt = hrchy_code_parnt;
        this.hrchy_typ = hrchy_typ;
        this.lvl_no = lvl_no;
        this.inactv_flg = inactv_flg;
        this.inactv_usr_no = inactv_usr_no;
        this.inactv_date = inactv_date;
        this.inactv_dsc = inactv_dsc;
        this.user = user;
    }


    public Long getHrchy_code() {
        return hrchy_code;
    }

    public void setHrchy_code(Long hrchy_code) {
        this.hrchy_code = hrchy_code;
    }

    public String getHrchy_l_nm() {
        return hrchy_l_nm;
    }

    public void setHrchy_l_nm(String hrchy_l_nm) {
        this.hrchy_l_nm = hrchy_l_nm;
    }

    public String getHrchy_f_nm() {
        return hrchy_f_nm;
    }

    public void setHrchy_f_nm(String hrchy_f_nm) {
        this.hrchy_f_nm = hrchy_f_nm;
    }

    public String getHrchy_code_parnt() {
        return hrchy_code_parnt;
    }

    public void setHrchy_code_parnt(String hrchy_code_parnt) {
        this.hrchy_code_parnt = hrchy_code_parnt;
    }

    public int getHrchy_typ() {
        return hrchy_typ;
    }

    public void setHrchy_typ(int hrchy_typ) {
        this.hrchy_typ = hrchy_typ;
    }

    public short getLvl_no() {
        return lvl_no;
    }

    public void setLvl_no(short lvl_no) {
        this.lvl_no = lvl_no;
    }

    public short getInactv_flg() {
        return inactv_flg;
    }

    public void setInactv_flg(short inactv_flg) {
        this.inactv_flg = inactv_flg;
    }

    public int getInactv_usr_no() {
        return inactv_usr_no;
    }

    public void setInactv_usr_no(int inactv_usr_no) {
        this.inactv_usr_no = inactv_usr_no;
    }

    public Date getInactv_date() {
        return inactv_date;
    }

    public void setInactv_date(Date inactv_date) {
        this.inactv_date = inactv_date;
    }

    public String getInactv_dsc() {
        return inactv_dsc;
    }

    public void setInactv_dsc(String inactv_dsc) {
        this.inactv_dsc = inactv_dsc;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Hierarchy{" +
                "hrchy_code='" + hrchy_code + '\'' +
                ", hrchy_l_nm='" + hrchy_l_nm + '\'' +
                ", hrchy_f_nm='" + hrchy_f_nm + '\'' +
                ", hrchy_code_parnt='" + hrchy_code_parnt + '\'' +
                ", hrchy_typ=" + hrchy_typ +
                ", lvl_no=" + lvl_no +
                ", inactv_flg=" + inactv_flg +
                ", inactv_usr_no=" + inactv_usr_no +
                ", inactv_date=" + inactv_date +
                ", inactv_dsc='" + inactv_dsc + '\'' +
                ", user=" + user +
                '}';
    }
}