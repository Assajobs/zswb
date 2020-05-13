package com.example.zswb.bean;
import java.io.Serializable;
/**
 * 实名认证表单信息封装类
 */
public class CardUser  implements Serializable {

    private String cardName;
    private String cardNumber;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CardUser{" +
                "cardName='" + cardName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
