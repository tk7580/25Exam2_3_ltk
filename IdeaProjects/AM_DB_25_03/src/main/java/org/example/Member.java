package org.example;

public class Member {

    private int id; //회원번호
    private String regDate; //가입일시?
    private String updateDate; //
    private String loginId;
    private String loginPw;
    private String name; //이름

    public Member(int id, String regDate, String updateDate, String loginId, String loginPw, String name) {
        this.id = id;
        this.regDate = regDate;
        this.updateDate = updateDate;
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.name = name;
    }
}
