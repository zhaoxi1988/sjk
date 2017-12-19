package com.ijinshan.sjk.po;

// Generated 2013-3-28 14:03:03 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Permissions generated by hbm2java
 */
@Entity
@Table(name = "Permissions", catalog = "AndroidMarket", uniqueConstraints = @UniqueConstraint(columnNames = "Permission"))
public class Permissions implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String permission;
    private String name;
    private String behavior;
    private String adRisk;

    public Permissions() {
    }

    public Permissions(String permission, String name) {
        this.permission = permission;
        this.name = name;
    }

    public Permissions(String permission, String name, String behavior, String adRisk) {
        this.permission = permission;
        this.name = name;
        this.behavior = behavior;
        this.adRisk = adRisk;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "Permission", unique = true, nullable = false, length = 60)
    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Column(name = "Name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Behavior", length = 200)
    public String getBehavior() {
        return this.behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    @Column(name = "AdRisk", length = 200)
    public String getAdRisk() {
        return this.adRisk;
    }

    public void setAdRisk(String adRisk) {
        this.adRisk = adRisk;
    }

}