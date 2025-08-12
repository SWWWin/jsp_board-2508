package com.ll.jsp.board.boundedContext.member.dto;

import lombok.*;

@AllArgsConstructor
@Data
public class Member {
    private long id;
    private String username;
    private String password;
    private String name;
}
