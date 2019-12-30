package com.provivi.likun.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_FISRT_NAME")
@AttributeOverrides(value = {
        @AttributeOverride(name = "id", column = @Column(name = "USER_FIRST_NAME_ID"))})
public class FirstName extends BaseEntity {

    @Column(name = "USER_FIRST_NAME_DESC")
    private String userFirstNameDesc;

    public String getUserFirstNameDesc() {
        return userFirstNameDesc;
    }

    public void setUserFirstNameDesc(String userFirstNameDesc) {
        this.userFirstNameDesc = userFirstNameDesc;
    }
}
