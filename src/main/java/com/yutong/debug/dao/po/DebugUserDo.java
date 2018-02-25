package com.yutong.debug.dao.po;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "debug_user")
public class DebugUserDo implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 用户等级 0 普通用户 1 管理员
     */
    @Column(name = "user_level")
    private Byte userLevel;

    /**
     * 用户状态 0 已被删除，1 正在使用
     */
    @Column(name = "user_state")
    private Byte userState;

    /**
     * 微信id
     */
    @Column(name = "weixin_id")
    private Integer weixinId;

    /**
     * 身份证号码
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 最后一次登陆时间
     */
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;

    public DebugUserDo(Integer id, String username, String password, String phoneNumber, Byte userLevel, Byte userState, Integer weixinId, String idCard, Date lastLoginTime, Date createTime, String remarks) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userLevel = userLevel;
        this.userState = userState;
        this.weixinId = weixinId;
        this.idCard = idCard;
        this.lastLoginTime = lastLoginTime;
        this.createTime = createTime;
        this.remarks = remarks;
    }

    public DebugUserDo() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return username - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取手机号码
     *
     * @return phone_number - 手机号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNumber 手机号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取用户等级 0 普通用户 1 管理员
     *
     * @return user_level - 用户等级 0 普通用户 1 管理员
     */
    public Byte getUserLevel() {
        return userLevel;
    }

    /**
     * 设置用户等级 0 普通用户 1 管理员
     *
     * @param userLevel 用户等级 0 普通用户 1 管理员
     */
    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 获取用户状态 0 已被删除，1 正在使用
     *
     * @return user_state - 用户状态 0 已被删除，1 正在使用
     */
    public Byte getUserState() {
        return userState;
    }

    /**
     * 设置用户状态 0 已被删除，1 正在使用
     *
     * @param userState 用户状态 0 已被删除，1 正在使用
     */
    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    /**
     * 获取微信id
     *
     * @return weixin_id - 微信id
     */
    public Integer getWeixinId() {
        return weixinId;
    }

    /**
     * 设置微信id
     *
     * @param weixinId 微信id
     */
    public void setWeixinId(Integer weixinId) {
        this.weixinId = weixinId;
    }

    /**
     * 获取身份证号码
     *
     * @return id_card - 身份证号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号码
     *
     * @param idCard 身份证号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 获取最后一次登陆时间
     *
     * @return last_login_time - 最后一次登陆时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后一次登陆时间
     *
     * @param lastLoginTime 最后一次登陆时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

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
        DebugUserDo other = (DebugUserDo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getWeixinId() == null ? other.getWeixinId() == null : this.getWeixinId().equals(other.getWeixinId()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getWeixinId() == null) ? 0 : getWeixinId().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", userState=").append(userState);
        sb.append(", weixinId=").append(weixinId);
        sb.append(", idCard=").append(idCard);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}