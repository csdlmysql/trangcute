/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author csdlmysql
 */
public class method_constructor {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";
 
    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
    }
 
    method_constructor(int r, String n) {
        rollno = r;
        name = n;
    }
 
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void main(String args[]) {
        method_constructor.change();
 
        method_constructor s1 = new method_constructor(111, "Thông");
        method_constructor s2 = new method_constructor(222, "Minh");
        method_constructor s3 = new method_constructor(333, "Anh");
        System.out.println(name);
        s1.display();
        s2.display();
        s3.display();
    }
}