public class ClassRoom {
    private String className;
    private Student [] studentList;
    private Teacher teacher;

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student[] getStudentList() {
        return studentList;
    }

    public void setStudentList(Student studentList) {
        this.studentList = new Student[]{studentList};
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
