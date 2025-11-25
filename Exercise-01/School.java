package com.ga;

import java.util.List;

public class School {
    private String campusName;
    private ClassRoom classRoom;
    private List<ClassRoom> classRoomList;

    public School() {
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }
}
