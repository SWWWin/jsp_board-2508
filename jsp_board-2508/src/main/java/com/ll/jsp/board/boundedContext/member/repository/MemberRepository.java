package com.ll.jsp.board.boundedContext.member.repository;

import com.ll.jsp.board.boundedContext.article.dto.Article;
import com.ll.jsp.board.boundedContext.member.dto.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class MemberRepository {
    private List<Member> memberList;
    private long lastId = 0;

    public MemberRepository() {
        memberList = new ArrayList<>();
        makeTestData();
        lastId = memberList.size()-1;
    }

    void makeTestData() {
        LongStream.rangeClosed(1, 5).forEach(i -> {
            Member member = new Member(i, "user" + i, "user" + i, "user" + i);
            memberList.add(member);
        });
    }

    public void save(String username, String password, String name) {
        long id = ++lastId;
        Member member = new Member(id, username, password, name);
        memberList.add(member);
    }

    public Member findByUsername(String username) {
        return memberList.stream()
                .filter(member -> member.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public Member login(String username, String password) {
        return (Member) memberList.stream()
                .filter(member -> member.getUsername().equals(username) && member.getPassword().equals(password))
                .onClose(null);

    }
}
