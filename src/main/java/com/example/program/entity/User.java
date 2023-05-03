package com.example.program.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="`user`")
@Data
public class User implements Serializable {
    /**
     * 用户唯一标识
     */
    @TableId(value = "`open_id`")
    private String open_id;

    /**
     * 昵称
     */
    @TableField(value = "nickName")
    private String nickName;

    /**
     * 头像
     */
    @TableField(value = "avatarUrl")
    private String avatarUrl;

    /**
     * 
     */
    @TableField(value = "property")
    private Double property;

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
        User other = (User) that;
        return (this.getOpen_id() == null ? other.getOpen_id() == null : this.getOpen_id().equals(other.getOpen_id()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getProperty() == null ? other.getProperty() == null : this.getProperty().equals(other.getProperty()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOpen_id() == null) ? 0 : getOpen_id().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getProperty() == null) ? 0 : getProperty().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", open_id=").append(open_id);
        sb.append(", nickName=").append(nickName);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", property=").append(property);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}