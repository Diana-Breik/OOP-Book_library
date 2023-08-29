package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Leben Liebe Lachen");
        book1.setAuthor("Osho");
        book1.setIsbn("56782904");
        System.out.println(book1);
        /*Book book2 = new Book();
        book2.setTitle("Leben");
        book2.setAuthor("Osho");
        book2.setIsbn("9804432");*/
       Library lib = new Library();
       Book[] array= new Book[2];
       array[0] = new Book("11","11","11");
        array[1] = new Book("22","22","22");
        lib.setArrays(array);
        System.out.println(lib);
    }
}