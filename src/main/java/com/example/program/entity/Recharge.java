package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName recharge
 */
@TableName(value ="recharge")
@Data
public class Recharge implements Serializable {
    /**
     * 
     */
    @TableId(value = "rechargeId", type = IdType.AUTO)
    private Integer rechargeId;

    /**
     * 
     */
    @TableField(value = "open_id")
    private String open_id;

    /**
     * 
     */
    @TableField(value = "account")
    private Double account;

    /**
     * 
     */
    @TableField(value = "billNum")
    private String billNum;

    /**
     * 
     */
    @TableField(value = "handle")
    private Integer handle;

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
        Recharge other = (Recharge) that;
        return (this.getRechargeId() == null ? other.getRechargeId() == null : this.getRechargeId().equals(other.getRechargeId()))
            && (this.getOpen_id() == null ? other.getOpen_id() == null : this.getOpen_id().equals(other.getOpen_id()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getBillNum() == null ? other.getBillNum() == null : this.getBillNum().equals(other.getBillNum()))
            && (this.getHandle() == null ? other.getHandle() == null : this.getHandle().equals(other.getHandle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRechargeId() == null) ? 0 : getRechargeId().hashCode());
        result = prime * result + ((getOpen_id() == null) ? 0 : getOpen_id().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getBillNum() == null) ? 0 : getBillNum().hashCode());
        result = prime * result + ((getHandle() == null) ? 0 : getHandle().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rechargeId=").append(rechargeId);
        sb.append(", open_id=").append(open_id);
        sb.append(", account=").append(account);
        sb.append(", billNum=").append(billNum);
        sb.append(", handle=").append(handle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}