package com.ijinshan.sjk.po;

// Generated 2013-3-25 15:47:56 by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * AppHistory4index generated by hbm2java
 */
@Entity
@Table(name = "AppHistory4Index", catalog = "AndroidMarket", uniqueConstraints = @UniqueConstraint(columnNames = "AppId"))
public class AppHistory4Index implements java.io.Serializable {

    private static final long serialVersionUID = -7902614535519929217L;
    private Integer id;
    private int appId;
    private Byte appStatus;
    private Date createTime;
    private Date lastOpTime;
    private Date lastIndexTime;
    private Byte indexStatus;

    public AppHistory4Index() {
    }

    public AppHistory4Index(int appId, Date createTime, Date lastOpTime, Date lastIndexTime) {
        this.appId = appId;
        this.createTime = createTime;
        this.lastOpTime = lastOpTime;
        this.lastIndexTime = lastIndexTime;
    }

    public AppHistory4Index(int appId, Byte appStatus, Date createTime, Date lastOpTime, Date lastIndexTime,
            Byte indexStatus) {
        this.appId = appId;
        this.appStatus = appStatus;
        this.createTime = createTime;
        this.lastOpTime = lastOpTime;
        this.lastIndexTime = lastIndexTime;
        this.indexStatus = indexStatus;
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

    @Column(name = "AppId", unique = true, nullable = false)
    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Column(name = "AppStatus")
    public Byte getAppStatus() {
        return this.appStatus;
    }

    public void setAppStatus(Byte appStatus) {
        this.appStatus = appStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CreateTime", nullable = false, length = 19)
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LastOpTime", nullable = false, length = 19)
    public Date getLastOpTime() {
        return this.lastOpTime;
    }

    public void setLastOpTime(Date lastOpTime) {
        this.lastOpTime = lastOpTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LastIndexTime", nullable = false, length = 19)
    public Date getLastIndexTime() {
        return this.lastIndexTime;
    }

    public void setLastIndexTime(Date lastIndexTime) {
        this.lastIndexTime = lastIndexTime;
    }

    @Column(name = "IndexStatus")
    public Byte getIndexStatus() {
        return this.indexStatus;
    }

    public void setIndexStatus(Byte indexStatus) {
        this.indexStatus = indexStatus;
    }

}
