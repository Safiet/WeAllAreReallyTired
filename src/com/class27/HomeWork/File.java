package com.class27.HomeWork;

public abstract class File {
    abstract void open();
    public void edit(){
        System.out.println("Editing a file");
    }
    public void close(){
        System.out.println("Closing a file");
    }
}
class JavaFile extends File{
    @Override
    public void open() {
        System.out.println("To open a java file we need notepad++ or sublime text");
    }
}
class WordFile extends File{
    @Override
    public void open() {
        System.out.println("To open .doc file we need Microsoft word");
    }
}
class PDFfile extends File{
    @Override
    public void open() {
        System.out.println("To open PDF file you need a special app");
    }
}
class Tester1{
    public static void main(String[] args) {
        File [] f={new JavaFile(),new WordFile(), new PDFfile() };
        for(File files:f){
            files.open();
            files.edit();
            files.close();
        }
    }
}
