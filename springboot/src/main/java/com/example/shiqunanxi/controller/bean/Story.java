package com.example.shiqunanxi.controller.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Story implements Serializable {
    private Long id;

    private Long teacherId;

    private Long babyId;

    private String stuname;

    private String title;

    private Timestamp createDate;

    private String storyType;

    private String place;

    private String date;

    private String content;

    private String pictureUrl;

    //学校id
    private Long schoolId;

    private Long classId;

    private String teacherName;

    private String babyPhoto;

    private String babyBirthday;

    public String getBabyPhoto() {
        return babyPhoto;
    }

    public void setBabyPhoto(String babyPhoto) {
        this.babyPhoto = babyPhoto;
    }

    public String getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(String babyBirthday) {
        this.babyBirthday = babyBirthday;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getBabyId() {
        return babyId;
    }

    public void setBabyId(Long babyId) {
        this.babyId = babyId;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getStoryType() {
        return storyType;
    }

    public void setStoryType(String storyType) {
        this.storyType = storyType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", teacherId=" + teacherId +
                ", babyId=" + babyId +
                ", stuname='" + stuname + '\'' +
                ", title='" + title + '\'' +
                ", createDate=" + createDate +
                ", storyType='" + storyType + '\'' +
                ", place='" + place + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", schoolId=" + schoolId +
                ", classId=" + classId +
                ", teacherName='" + teacherName + '\'' +
                ", babyPhoto='" + babyPhoto + '\'' +
                ", babyBirthday='" + babyBirthday + '\'' +
                '}';
    }
}
