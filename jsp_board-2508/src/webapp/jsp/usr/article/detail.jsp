<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="../common/header.jspf" %>

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


    <div>
        <a href = "/usr/article/modify/${article.id}">수정</a>
    </div>

    <a href="#" id="deleteLinkBtn" onclick="if(!confirm('정말 삭제?')) return false;" href="/usr/article/delete/${article.id}">삭제</a>

    <form
            hidden
            id="deleteForm"
            action="/usr/article/delete/${article.id}"
            method="POST"
    >
        <input type="hidden" name="deleteId" value="${article.id}"/>
    </form>

</div>

<script>
    const deleteLinkBtn = document.getElementById("deleteLinkBtn");
    const deleteForm = document.getElementById("deleteForm");

    deleteLinkBtn.addEventListener('click', function(e){
        e.preventDefault();
        if(confirm("정말 삭제하시겠습니까?")){
            deleteForm.submit();
        }
    });
</script>

<%@ include file="../common/footer.jspf"%>