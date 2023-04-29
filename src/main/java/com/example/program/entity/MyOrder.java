package com.example.program.entity;

import java.util.Objects;

public class MyOrder {

    private Integer shoppingId;

    private Integer number;

    private Double price;

    private String title;

    private String imgUrl1;

    private String freight;

    private String invoice;

    private String orderNote;

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOrder myOrder = (MyOrder) o;
        return Objects.equals(shoppingId, myOrder.shoppingId) && Objects.equals(number, myOrder.number) && Objects.equals(price, myOrder.price) && Objects.equals(title, myOrder.title) && Objects.equals(imgUrl1, myOrder.imgUrl1) && Objects.equals(freight, myOrder.freight) && Objects.equals(invoice, myOrder.invoice) && Objects.equals(orderNote, myOrder.orderNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingId, number, price, title, imgUrl1, freight, invoice, orderNote);
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "shoppingId=" + shoppingId +
                ", number=" + number +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", imgUrl1='" + imgUrl1 + '\'' +
                ", freight='" + freight + '\'' +
                ", invoice='" + invoice + '\'' +
                ", orderNote='" + orderNote + '\'' +
                '}';
    }
}
