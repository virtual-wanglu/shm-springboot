package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName danmu
 */
@TableName(value ="danmu")
@Data
public class Danmu implements Serializable {
    /**
     * 
     */
    @TableId(value = "danmuId", type = IdType.AUTO)
    private Integer danmuId;

    /**
     * 
     */
    @TableField(value = "roomId")
    private Integer roomId;

    /**
     * 
     */
    @TableField(value = "danmuText")
    private String danmuText;

    /**
     * 
     */
    @TableField(value = "danmuColor")
    private String danmuColor;

    /**
     * 
     */
    @TableField(value = "danmuTime")
    private Integer danmuTime;

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
        Danmu other = (Danmu) that;
        return (this.getDanmuId() == null ? other.getDanmuId() == null : this.getDanmuId().equals(other.getDanmuId()))
            && (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getDanmuText() == null ? other.getDanmuText() == null : this.getDanmuText().equals(other.getDanmuText()))
            && (this.getDanmuColor() == null ? other.getDanmuColor() == null : this.getDanmuColor().equals(other.getDanmuColor()))
            && (this.getDanmuTime() == null ? other.getDanmuTime() == null : this.getDanmuTime().equals(other.getDanmuTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDanmuId() == null) ? 0 : getDanmuId().hashCode());
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getDanmuText() == null) ? 0 : getDanmuText().hashCode());
        result = prime * result + ((getDanmuColor() == null) ? 0 : getDanmuColor().hashCode());
        result = prime * result + ((getDanmuTime() == null) ? 0 : getDanmuTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", danmuId=").append(danmuId);
        sb.append(", roomId=").append(roomId);
        sb.append(", danmuText=").append(danmuText);
        sb.append(", danmuColor=").append(danmuColor);
        sb.append(", danmuTime=").append(danmuTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}