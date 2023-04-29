package com.example.program.entity;

import java.util.Objects;

public class MyShoppingCart {
    private Integer number;

    private boolean isSelect=false;

    private Integer shoppingId;

    private String shoppingDesc;

    private String price;

    private String tag;

    private String title;

    private String imgUrl1;

    private String imgUrl2;

    private String imgUrl3;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public boolean isSelect() {
        return isSelect;
    }

    public void setSelect(boolean select) {
        isSelect = select;
    }

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getShoppingDesc() {
        return shoppingDesc;
    }

    public void setShoppingDesc(String shoppingDesc) {
        this.shoppingDesc = shoppingDesc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl1() {
        return imgUrl1;
    }

    public void setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
    }

    public String getImgUrl2() {
        return imgUrl2;
    }

    public void setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
    }

    public String getImgUrl3() {
        return imgUrl3;
    }

    public void setImgUrl3(String imgUrl3) {
        this.imgUrl3 = imgUrl3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyShoppingCart that = (MyShoppingCart) o;
        return isSelect == that.isSelect && Objects.equals(number, that.number) && Objects.equals(shoppingId, that.shoppingId) && Objects.equals(shoppingDesc, that.shoppingDesc) && Objects.equals(price, that.price) && Objects.equals(tag, that.tag) && Objects.equals(title, that.title) && Objects.equals(imgUrl1, that.imgUrl1) && Objects.equals(imgUrl2, that.imgUrl2) && Objects.equals(imgUrl3, that.imgUrl3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, isSelect, shoppingId, shoppingDesc, price, tag, title, imgUrl1, imgUrl2, imgUrl3);
    }

    @Override
    public String toString() {
        return "MyShoppingCart{" +
                "number=" + number +
                ", isSelect=" + isSelect +
                ", shoppingId=" + shoppingId +
                ", shoppingDesc='" + shoppingDesc + '\'' +
                ", price='" + price + '\'' +
                ", tag='" + tag + '\'' +
                ", title='" + title + '\'' +
                ", imgUrl1='" + imgUrl1 + '\'' +
                ", imgUrl2='" + imgUrl2 + '\'' +
                ", imgUrl3='" + imgUrl3 + '\'' +
                '}';
    }
}
