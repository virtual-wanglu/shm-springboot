package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName shopping
 */
@TableName(value ="shopping")
@Data
public class Shopping implements Serializable {
    /**
     * 
     */
    @TableId(value = "shoppingId")
    private Integer shoppingId;

    /**
     * 
     */
    @TableField(value = "shoppingDesc")
    private String shoppingDesc;

    /**
     * 
     */
    @TableField(value = "price")
    private String price;

    /**
     * 
     */
    @TableField(value = "tag")
    private String tag;

    /**
     * 
     */
    @TableField(value = "title")
    private String title;

    /**
     * 
     */
    @TableField(value = "imgUrl1")
    private String imgUrl1;

    /**
     * 
     */
    @TableField(value = "imgUrl2")
    private String imgUrl2;

    /**
     * 
     */
    @TableField(value = "imgUrl3")
    private String imgUrl3;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Shopping other = (Shopping) that;
        return (this.getShoppingId() == null ? other.getShoppingId() == null : this.getShoppingId().equals(other.getShoppingId()))
            && (this.getShoppingDesc() == null ? other.getShoppingDesc() == null : this.getShoppingDesc().equals(other.getShoppingDesc()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getImgUrl1() == null ? other.getImgUrl1() == null : this.getImgUrl1().equals(other.getImgUrl1()))
            && (this.getImgUrl2() == null ? other.getImgUrl2() == null : this.getImgUrl2().equals(other.getImgUrl2()))
            && (this.getImgUrl3() == null ? other.getImgUrl3() == null : this.getImgUrl3().equals(other.getImgUrl3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShoppingId() == null) ? 0 : getShoppingId().hashCode());
        result = prime * result + ((getShoppingDesc() == null) ? 0 : getShoppingDesc().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getImgUrl1() == null) ? 0 : getImgUrl1().hashCode());
        result = prime * result + ((getImgUrl2() == null) ? 0 : getImgUrl2().hashCode());
        result = prime * result + ((getImgUrl3() == null) ? 0 : getImgUrl3().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shoppingId=").append(shoppingId);
        sb.append(", desc=").append(shoppingDesc);
        sb.append(", price=").append(price);
        sb.append(", tag=").append(tag);
        sb.append(", title=").append(title);
        sb.append(", imgUrl1=").append(imgUrl1);
        sb.append(", imgUrl2=").append(imgUrl2);
        sb.append(", imgUrl3=").append(imgUrl3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}