<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<div>
    <h1>${article.title}</h1>
    <div>
        <span>번호: ${article.id}</span>
    </div>

    <div>
        <span>내용: ${article.content}</span>
    </div>

    <div>
        <span>작성일: 20025-00-00 00:00</span>
    </div>

    <div>
        <a href = "/usr/article/list">목록</a>
    </div>

</div>