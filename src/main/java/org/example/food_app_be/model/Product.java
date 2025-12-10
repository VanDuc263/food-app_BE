package org.example.food_app_be.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "products")
public class Product {

    @Id
    private String id;  // MongoDB _id

    private String ten;
    private Integer gia;
    private String urlImage;
    private String moTa;
    private Boolean daXoa;
    private Integer soLuong;
    private Date ngayTao;
    private Date ngayCapNhat;

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Boolean getDaXoa() {
        return daXoa;
    }

    public void setDaXoa(Boolean daXoa) {
        this.daXoa = daXoa;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", urlImage='" + urlImage + '\'' +
                ", moTa='" + moTa + '\'' +
                ", daXoa=" + daXoa +
                ", soLuong=" + soLuong +
                ", ngayTao=" + ngayTao +
                ", ngayCapNhat=" + ngayCapNhat +
                '}';
    }
}
