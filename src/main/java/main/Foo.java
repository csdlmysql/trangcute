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
class Foo{
    static String var_class = "hello"; // biến khởi tạo bằng static là biến class. nó sẽ sử dụng được bởi các method static.
    String name = "Trang so cute"; // đây là biến instance. nó nằm bên ngoài tất cả các method nhưng có thể truy cập được bởi tất cả các method, constructor của class đấy
    public void show_name(){
        System.out.println(name); 
    }
    public static void main(String args[]){
        System.out.println(var_class);
        System.out.println();
    };
}
