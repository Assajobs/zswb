package com.example.zswb.bean;

public class Identification {
    /**
     * 认证编号 自增、主键
     */
    private Integer identityId;

    /**
     * 身份证号 非空
     */
    private String identityCard;

    /**
     * 身份证正面反 非空
     */
    private String identityImage;

    /**
     * 认证状态 非空（0代表未认证，1代表认证通过）
     */
    private Integer identityStatus;

    /**
     * 所属人 非空
     */
    private Integer identityPerson;

    public Integer getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Integer identityId) {
        this.identityId = identityId;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getIdentityImage() {
        return identityImage;
    }

    public void setIdentityImage(String identityImage) {
        this.identityImage = identityImage;
    }

    public Integer getIdentityStatus() {
        return identityStatus;
    }

    public void setIdentityStatus(Integer identityStatus) {
        this.identityStatus = identityStatus;
    }

    public Integer getIdentityPerson() {
        return identityPerson;
    }

    public void setIdentityPerson(Integer identityPerson) {
        this.identityPerson = identityPerson;
    }
}