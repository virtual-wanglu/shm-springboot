package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName shoppingcart
 */
@TableName(value ="shoppingcart")
@Data
public class Shoppingcart implements Serializable {
    /**
     * 
     */
    @TableId(value = "cartId", type = IdType.AUTO)
    private Integer cartId;

    /**
     * 
     */
    @TableField(value = "open_id")
    private String open_id;

    /**
     * 
     */
    @TableField(value = "shoppingId")
    private Integer shoppingId;

    /**
     * 
     */
    @TableField(value = "shoppingNum")
    private Integer shoppingNum;

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
        Shoppingcart other = (Shoppingcart) that;
        return (this.getCartId() == null ? other.getCartId() == null : this.getCartId().equals(other.getCartId()))
            && (this.getOpen_id() == null ? other.getOpen_id() == null : this.getOpen_id().equals(other.getOpen_id()))
            && (this.getShoppingId() == null ? other.getShoppingId() == null : this.getShoppingId().equals(other.getShoppingId()))
            && (this.getShoppingNum() == null ? other.getShoppingNum() == null : this.getShoppingNum().equals(other.getShoppingNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartId() == null) ? 0 : getCartId().hashCode());
        result = prime * result + ((getOpen_id() == null) ? 0 : getOpen_id().hashCode());
        result = prime * result + ((getShoppingId() == null) ? 0 : getShoppingId().hashCode());
        result = prime * result + ((getShoppingNum() == null) ? 0 : getShoppingNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartId=").append(cartId);
        sb.append(", open_id=").append(open_id);
        sb.append(", shoppingId=").append(shoppingId);
        sb.append(", number=").append(shoppingNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}