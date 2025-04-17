package org.example;

import java.util.ArrayList;
import java.util.List;

public class wiseSayingController {

    List<wiseSaying> wiseSayings;
    int lastId;

    public wiseSayingController(){
        wiseSayings = new ArrayList<>();
    }
    public void add(){
        int lastId1 = this.lastId;
        String content;
        String author;
        System.out.print("명언 : ");
        content = Container.getScanner().nextLine();
        System.out.print("작가  : ");
        author = Container.getScanner().nextLine();

//        new wiseSaying() = (wiseSayings.add();
//
//        System.out.printf("%d번 명언이 등록되었습니다.\n", );
    }

    public void list(){
        System.out.println("=".repeat(20));
        System.out.println("번호   /    작가    /   명언");
    }

    public void detail(){
        System.out.println("=".repeat(20));

    }

    public void edit(){

    }
}
