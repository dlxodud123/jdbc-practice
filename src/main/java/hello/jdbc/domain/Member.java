package hello.jdbc.domain;

import lombok.Data;

@Data
public class Member {
    private String memberId;
    private int money;

    public Member(){
    }

    // Alt + insert = 생성자 만들기
    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }
}
