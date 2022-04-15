package com.pvt.test.student;

public class Student implements Comparable<Student> {

    private static final String ZERO_VALUE_STRING = "Not entered";
    private static final int ZERO_VALUE_INT = 0;
    private int id;
    private String nameStudent;
    private int totalScore;

    public Student() {
        this.id = ZERO_VALUE_INT;
        this.nameStudent = ZERO_VALUE_STRING;
        this.totalScore = ZERO_VALUE_INT;
    }

    public Student(int id, String nameStudent, int totalScore) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.totalScore = totalScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (totalScore != student.totalScore) return false;
        return nameStudent != null ? nameStudent.equals(student.nameStudent) : student.nameStudent == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nameStudent != null ? nameStudent.hashCode() : 0);
        result = 31 * result + totalScore;
        return result;
    }

    @Override
    public String toString() {
        return "Student " + id + " \t" + nameStudent + " - " +
                " totalScore : " + totalScore;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id, o.getId());

    }
}
