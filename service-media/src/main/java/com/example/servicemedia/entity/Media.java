package com.example.servicemedia.entity;

import java.io.Serializable;

public class Media implements Serializable {
    private Integer id;

    private String mediaName;

    private String mediaPath;

    private String mediaEndName;

    private String mediaTime;

    private String mediaSize;

    private String mediaType;

    private Integer relationId;

    private String relationTable;

    private String mediaUrlpath;

    private byte[] mediaData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName == null ? null : mediaName.trim();
    }

    public String getMediaPath() {
        return mediaPath;
    }

    public void setMediaPath(String mediaPath) {
        this.mediaPath = mediaPath == null ? null : mediaPath.trim();
    }

    public String getMediaEndName() {
        return mediaEndName;
    }

    public void setMediaEndName(String mediaEndName) {
        this.mediaEndName = mediaEndName == null ? null : mediaEndName.trim();
    }

    public String getMediaTime() {
        return mediaTime;
    }

    public void setMediaTime(String mediaTime) {
        this.mediaTime = mediaTime == null ? null : mediaTime.trim();
    }

    public String getMediaSize() {
        return mediaSize;
    }

    public void setMediaSize(String mediaSize) {
        this.mediaSize = mediaSize == null ? null : mediaSize.trim();
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public String getRelationTable() {
        return relationTable;
    }

    public void setRelationTable(String relationTable) {
        this.relationTable = relationTable == null ? null : relationTable.trim();
    }

    public String getMediaUrlpath() {
        return mediaUrlpath;
    }

    public void setMediaUrlpath(String mediaUrlpath) {
        this.mediaUrlpath = mediaUrlpath == null ? null : mediaUrlpath.trim();
    }

    public byte[] getMediaData() {
        return mediaData;
    }

    public void setMediaData(byte[] mediaData) {
        this.mediaData = mediaData;
    }
}