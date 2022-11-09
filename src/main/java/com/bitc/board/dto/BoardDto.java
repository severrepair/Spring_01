package com.bitc.board.dto;

import lombok.Data;

//  @Date : lombok 라이브러리에서 지원하는 어노테이션으로 해당 클래스의 멤버 변수에 대한 getter/setter/toString() 메서드를 자동으로 생성하는 어노테이션, @Getter, @Setter, @ToString 어노테이션을 모두 사용할 효과
@Data
//@Getter
//@Setter
//@ToString
public class BoardDto {
    private int idx;
    private String title;
    private String contents;
    private String userId;
    private String pwd;
    private String createDt;
    private String updateDt;
    private int hitCnt;
}
