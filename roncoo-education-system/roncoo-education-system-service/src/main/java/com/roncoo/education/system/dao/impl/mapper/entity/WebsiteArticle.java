package com.roncoo.education.system.dao.impl.mapper.entity;

import java.io.Serializable;
import java.util.Date;

public class WebsiteArticle implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer statusId;
    private Integer sort;
    private Long parentId;
    private String artName;
    private String artTitle;
    private String artPic;
    private String artDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName == null ? null : artName.trim();
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle == null ? null : artTitle.trim();
    }

    public String getArtPic() {
        return artPic;
    }

    public void setArtPic(String artPic) {
        this.artPic = artPic == null ? null : artPic.trim();
    }

    public String getArtDesc() {
        return artDesc;
    }

    public void setArtDesc(String artDesc) {
        this.artDesc = artDesc == null ? null : artDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", statusId=").append(statusId);
        sb.append(", sort=").append(sort);
        sb.append(", parentId=").append(parentId);
        sb.append(", artName=").append(artName);
        sb.append(", artTitle=").append(artTitle);
        sb.append(", artPic=").append(artPic);
        sb.append(", artDesc=").append(artDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}