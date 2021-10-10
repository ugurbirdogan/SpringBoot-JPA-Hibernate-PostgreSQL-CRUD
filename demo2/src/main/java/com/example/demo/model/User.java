package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gnr_usr")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usr_no;

    @Column(name = "usr_code")
    private String usr_code;

    @Column(name = "usr_l_nm")
    private String usr_l_nm;

    @Column(name = "usr_f_nm")
    private String usr_f_nm;

    @Column(name = "usr_no_mngr")
    private int usr_no_mngr;

    @Column(name = "hrchy_code")
    private String hrchy_code;

    @Column(name = "usr_pswrd")
    private String usr_pswrd;

    @Column(name = "img_nm")
    private String img_nm;

    @Column(name = "f_date_effct")
    private Date f_date_effct;

    @Column(name = "t_date_effct")
    private Date t_date_effct;

    @Column(name = "f_time_effect")
    private Date f_time_effect;

    @Column(name = "t_time_effect")
    private Date t_time_effect;

    @Column(name = "e_mail")
    private String e_mail;

    @Column(name = "mobile_no")
    private String mobile_no;

    @Column(name = "inactv_flg")
    private short inactv_flg;

    @Column(name = "inactv_usr_no")
    private int inactv_usr_no;

    @Column(name = "inactv_date")
    private Date inactv_date;

    @Column(name = "inactv_dsc")
    private String inactv_dsc;

    public User(){
        super();
    }

    public User( String usr_l_nm, String usr_f_nm, int usr_no_mngr, String hrchy_code, String usr_pswrd, String img_nm, Date f_date_effct, Date t_date_effct, Date f_time_effect, Date t_time_effect, String e_mail, String mobile_no, short inactv_flg, int inactv_usr_no, Date inactv_date, String inactv_dsc) {
        this.usr_l_nm = usr_l_nm;
        this.usr_f_nm = usr_f_nm;
        this.usr_no_mngr = usr_no_mngr;
        this.hrchy_code = hrchy_code;
        this.usr_pswrd = usr_pswrd;
        this.img_nm = img_nm;
        this.f_date_effct = f_date_effct;
        this.t_date_effct = t_date_effct;
        this.f_time_effect = f_time_effect;
        this.t_time_effect = t_time_effect;
        this.e_mail = e_mail;
        this.mobile_no = mobile_no;
        this.inactv_flg = inactv_flg;
        this.inactv_usr_no = inactv_usr_no;
        this.inactv_date = inactv_date;
        this.inactv_dsc = inactv_dsc;
    }

    public Long getUsr_no() {
        return usr_no;
    }

    public void setUsr_no(Long usr_no) {
        this.usr_no = usr_no;
    }

    public String getUsr_code() {
        return usr_code;
    }

    public void setUsr_code(String usr_code) {
        this.usr_code = usr_code;
    }

    public String getUsr_l_nm() {
        return usr_l_nm;
    }

    public void setUsr_l_nm(String usr_l_nm) {
        this.usr_l_nm = usr_l_nm;
    }

    public String getUsr_f_nm() {
        return usr_f_nm;
    }

    public void setUsr_f_nm(String usr_f_nm) {
        this.usr_f_nm = usr_f_nm;
    }

    public int getUsr_no_mngr() {
        return usr_no_mngr;
    }

    public void setUsr_no_mngr(int usr_no_mngr) {
        this.usr_no_mngr = usr_no_mngr;
    }

    public String getHrchy_code() {
        return hrchy_code;
    }

    public void setHrchy_code(String hrchy_code) {
        this.hrchy_code = hrchy_code;
    }

    public String getUsr_pswrd() {
        return usr_pswrd;
    }

    public void setUsr_pswrd(String usr_pswrd) {
        this.usr_pswrd = usr_pswrd;
    }

    public String getImg_nm() {
        return img_nm;
    }

    public void setImg_nm(String img_nm) {
        this.img_nm = img_nm;
    }

    public Date getF_date_effct() {
        return f_date_effct;
    }

    public void setF_date_effct(Date f_date_effct) {
        this.f_date_effct = f_date_effct;
    }

    public Date getT_date_effct() {
        return t_date_effct;
    }

    public void setT_date_effct(Date t_date_effct) {
        this.t_date_effct = t_date_effct;
    }

    public Date getF_time_effect() {
        return f_time_effect;
    }

    public void setF_time_effect(Date f_time_effect) {
        this.f_time_effect = f_time_effect;
    }

    public Date getT_time_effect() {
        return t_time_effect;
    }

    public void setT_time_effect(Date t_time_effect) {
        this.t_time_effect = t_time_effect;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
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

    @Override
    public String toString() {
        return "User{" +
                "usr_no=" + usr_no +
                ", usr_code='" + usr_code + '\'' +
                ", usr_l_nm='" + usr_l_nm + '\'' +
                ", usr_f_nm='" + usr_f_nm + '\'' +
                ", usr_no_mngr=" + usr_no_mngr +
                ", hrchy_code='" + hrchy_code + '\'' +
                ", usr_pswrd='" + usr_pswrd + '\'' +
                ", img_nm='" + img_nm + '\'' +
                ", f_date_effct=" + f_date_effct +
                ", t_date_effct=" + t_date_effct +
                ", f_time_effect=" + f_time_effect +
                ", t_time_effect=" + t_time_effect +
                ", e_mail='" + e_mail + '\'' +
                ", mobile_no='" + mobile_no + '\'' +
                ", inactv_flg=" + inactv_flg +
                ", inactv_usr_no=" + inactv_usr_no +
                ", inactv_date=" + inactv_date +
                ", inactv_dsc='" + inactv_dsc + '\'' +
                '}';
    }
}
