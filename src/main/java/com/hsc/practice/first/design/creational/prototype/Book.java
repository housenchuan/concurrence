package com.hsc.practice.first.design.creational.prototype;

import com.hsc.practice.first.design.creational.builder.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: com.hsc.practice.first.design.creational.prototype.Book
 * @auther: 侯森川
 * @Date: 2020-6-20 17:13
 **/

public class Book implements Cloneable{
    private String name;
    private String content;
    private String author;
    private ArrayList<Course> list;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Course> getList() {
        return list;
    }

    public void setList(ArrayList<Course> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book cloneBook = (Book)super.clone();
        if(null != course) {
            cloneBook.course = (Course) cloneBook.course.clone();
        }
        if(null != list) {
            cloneBook.list = (ArrayList<Course>) cloneBook.list.clone();
            if(cloneBook.list.size()>0){
                for (int i = 0; i < cloneBook.list.size(); i++) {
                    Course cloneTemp = (Course) cloneBook.list.get(i).clone();
                    cloneBook.list.set(i,cloneTemp);
                }
            }
        }
        return cloneBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", list=" + list +
                '}';
    }
}
