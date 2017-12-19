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
 * Keyword generated by hbm2java
 */
@Entity
@Table(name = "Keyword", catalog = "AndroidMarket", uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class Keyword implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private int totalHits;
    private String rankType;
    private String targetKeyword;

    public Keyword() {
    }

    public Keyword(String name, int totalHits, String rankType, String targetKeyword) {
        this.name = name;
        this.totalHits = totalHits;
        this.rankType = rankType;
        this.targetKeyword = targetKeyword;
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

    @Column(name = "Name", unique = true, nullable = false, length = 45)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TotalHits", nullable = false)
    public int getTotalHits() {
        return this.totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    @Column(name = "RankType", nullable = false, length = 18)
    public String getRankType() {
        return this.rankType;
    }

    public void setRankType(String rankType) {
        this.rankType = rankType;
    }

    @Column(name = "TargetKeyword", nullable = false, length = 45)
    public String getTargetKeyword() {
        return this.targetKeyword;
    }

    public void setTargetKeyword(String targetKeyword) {
        this.targetKeyword = targetKeyword;
    }

}