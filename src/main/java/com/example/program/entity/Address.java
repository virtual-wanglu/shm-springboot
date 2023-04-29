package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName address
 */
@TableName(value ="address")
@Data
public class Address implements Serializable {
    /**
     * 
     */
    @TableId(value = "addressId", type = IdType.AUTO)
    private Integer addressId;

    /**
     * 
     */
    @TableField(value = "open_id")
    private String open_id;

    /**
     * 
     */
    @TableField(value = "userName")
    private String userName;

    /**
     * 
     */
    @TableField(value = "telNumber")
    private String telNumber;

    /**
     * 
     */
    @TableField(value = "province")
    private String province;

    /**
     * 
     */
    @TableField(value = "city")
    private String city;

    /**
     * 
     */
    @TableField(value = "county")
    private String county;

    /**
     * 
     */
    @TableField(value = "detailInfo")
    private String detailInfo;

    /**
     * 
     */
    @TableField(value = "isDefault")
    private Integer isDefault;

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
        Address other = (Address) that;
        return (this.getAddressId() == null ? other.getAddressId() == null : this.getAddressId().equals(other.getAddressId()))
            && (this.getOpen_id() == null ? other.getOpen_id() == null : this.getOpen_id().equals(other.getOpen_id()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getTelNumber() == null ? other.getTelNumber() == null : this.getTelNumber().equals(other.getTelNumber()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
            && (this.getDetailInfo() == null ? other.getDetailInfo() == null : this.getDetailInfo().equals(other.getDetailInfo()))
            && (this.getIsDefault() == null ? other.getIsDefault() == null : this.getIsDefault().equals(other.getIsDefault()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        result = prime * result + ((getOpen_id() == null) ? 0 : getOpen_id().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getTelNumber() == null) ? 0 : getTelNumber().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getDetailInfo() == null) ? 0 : getDetailInfo().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addressId=").append(addressId);
        sb.append(", open_id=").append(open_id);
        sb.append(", userName=").append(userName);
        sb.append(", telNumber=").append(telNumber);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", detailInfo=").append(detailInfo);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}