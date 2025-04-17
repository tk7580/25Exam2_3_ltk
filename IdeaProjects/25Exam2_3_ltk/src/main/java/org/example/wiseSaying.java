package org.example;

public class wiseSaying {

    private int id;
    private String regDate;
    private String content;
    private String author;

    public wiseSaying() {
        this.id = id;
        this.regDate = regDate;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
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



    public String toString(){
        return "id: " + id + " regDate: " + regDate + " content: " + content + " author: " + author;
    }

}
