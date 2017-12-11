package com.github.virovinrom;

import javax.persistence.*;

@Entity
@Table(name = "client_table")
public class User {


    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
