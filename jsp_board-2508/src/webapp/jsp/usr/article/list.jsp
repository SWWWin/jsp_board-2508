<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ll.jsp.board.boundedContext.article.dto.Article" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../common/header.jspf" %>

<h1>게시물 리스트</h1>

<div>
    <ul>
        <c:forEach var="article" items="${articleList}" varStatus="status">
            <li>${article.id}번: ${article.title}</li>
        </c:forEach>
    </ul>

    <table border="1">
        <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="article" items="${articleList}" varStatus="status">
            <tr>
                <td>${article.id}</td>
                <td>
                    <a href="/usr/article/detail/${article.id}">${article.title}</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href = "/usr/article/write">글쓰기</a>
</div>

<%@ include file="../common/footer.jspf"%>