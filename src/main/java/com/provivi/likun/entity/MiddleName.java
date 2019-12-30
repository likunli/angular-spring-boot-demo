package com.provivi.likun.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_MIDDLE_NAME")
@AttributeOverrides(value = {
        @AttributeOverride(name = "id", column = @Column(name = "USER_MIDDLE_NAME_ID"))})
public class MiddleName extends BaseEntity {

    @Column(name = "USER_MIDDLE_NAME_DESC")
    private String userMiddleNameDesc;

    public String getUserMiddleNameDesc() {
        return userMiddleNameDesc;
    }

    public void setUserMiddleNameDesc(String userMiddleNameDesc) {
        this.userMiddleNameDesc = userMiddleNameDesc;
    }
}
