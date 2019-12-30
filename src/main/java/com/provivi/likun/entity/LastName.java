package com.provivi.likun.entity;


import javax.persistence.*;

@Entity
@Table(name = "USER_LAST_NAME")
@AttributeOverrides(value = {
        @AttributeOverride(name = "id", column = @Column(name = "USER_LAST_NAME_ID"))})
public class LastName extends BaseEntity {

    @Column(name = "USER_LAST_NAME_DESC")
    private String userLastNameDesc;

    public String getUserLastNameDesc() {
        return userLastNameDesc;
    }

    public void setUserLastNameDesc(String userLastNameDesc) {
        this.userLastNameDesc = userLastNameDesc;
    }
}
