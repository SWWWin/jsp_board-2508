package com.ll.jsp.board.boundedContext.member.controller;

import com.ll.jsp.board.boundedContext.global.base.Rq;

import static com.ll.jsp.board.boundedContext.base.Container.articleService;

public class MemberController {
    public void showJoin(Rq rq) {

    }

    public void showDetail(Rq rq) {
        int id = rq.getIntParam("id", 0);

        articleService.findById(id);
    }

}
