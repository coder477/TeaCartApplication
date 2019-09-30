package com.tcart.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "chat_history", schema = "tcart_db")
@Getter
@Setter
@Builder
public class ChatEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "snapshotImageUrl")
    private String snapshotImageUrl;

    @Column(name = "type")
    private String type;

    @Column(name = "requestedBy")
    private String requestedBy;

    @Column(name = "description")
    private String description;

    @Column(name = "createdAtDate")
    private Date createdAtDate;

    @Column(name = "createdAtSeconds")
    private int createdAtSeconds;

    @Column(name = "createdAtMilliseconds")
    private int createdAtMilliseconds;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSnapshotImageUrl() {
        return snapshotImageUrl;
    }

    public void setSnapshotImageUrl(String snapshotImageUrl) {
        this.snapshotImageUrl = snapshotImageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(Date createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public int getCreatedAtSeconds() {
        return createdAtSeconds;
    }

    public void setCreatedAtSeconds(int createdAtSeconds) {
        this.createdAtSeconds = createdAtSeconds;
    }

    public int getCreatedAtMilliseconds() {
        return createdAtMilliseconds;
    }

    public void setCreatedAtMilliseconds(int createdAtMilliseconds) {
        this.createdAtMilliseconds = createdAtMilliseconds;
    }

}
