package org.example.entity;

import lombok.Data;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Access(AccessType.FIELD)
@Embeddable
public class PersonDetailInfo {

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Access(AccessType.PROPERTY)
    @Column(name = "surname")
    private String surname;

    public void setSurname(String surname) {
        this.surname = "surname: " + surname;
    }
}
