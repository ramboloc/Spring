package com.wubin.demo;

public class Book {
    private String bookName;
    private String author;

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book() {
    }

//    public static void main(String[] args) {
//        // 先创建对象，再注入属性
//        Book book = new Book();
//        book.setBookName("a");
//        // 使用有参构造注入
//        Book book1 =new Book("b");
//
//    }

    public void testDemo(){
        System.out.println("书名为："+bookName);
        System.out.println("作者为："+author);
    }

}
