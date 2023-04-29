package com.example.program.entity;

import java.util.Objects;

public class UserOrder {

    private Integer orderId;

    private Integer shoppingId;

    private Integer number;

    private Double price;

    private String title;

    private String imgUrl1;

    private String freight;

    private String invoice;

    private String orderNote;

    private Integer status;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOrder userOrder = (UserOrder) o;
        return Objects.equals(orderId, userOrder.orderId) && Objects.equals(shoppingId, userOrder.shoppingId) && Objects.equals(number, userOrder.number) && Objects.equals(price, userOrder.price) && Objects.equals(title, userOrder.title) && Objects.equals(imgUrl1, userOrder.imgUrl1) && Objects.equals(freight, userOrder.freight) && Objects.equals(invoice, userOrder.invoice) && Objects.equals(orderNote, userOrder.orderNote) && Objects.equals(status, userOrder.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, shoppingId, number, price, title, imgUrl1, freight, invoice, orderNote, status);
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "orderId=" + orderId +
                ", shoppingId=" + shoppingId +
                ", number=" + number +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", imgUrl1='" + imgUrl1 + '\'' +
                ", freight='" + freight + '\'' +
                ", invoice='" + invoice + '\'' +
                ", orderNote='" + orderNote + '\'' +
                ", status=" + status +
                '}';
    }
}
