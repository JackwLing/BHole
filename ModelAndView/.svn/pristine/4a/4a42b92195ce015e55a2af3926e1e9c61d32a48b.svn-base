<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success</title>
</head>
<body>
<h1>ModelAndView</h1>
      <p>书籍列表</p>  
      <c:forEach items="${bookList}" var="node">  
           <c:out value="${node}"></c:out>  
      </c:forEach>  
      <br/>  
      <br/>  
        
      <!-- 输出Map -->  
      <c:forEach items="${map}" var="node">  
           姓名：<c:out value="${node.key}"></c:out>  
           住址：<c:out value="${node.value}"></c:out>  
           <br/>  
      </c:forEach>  
</body>
</html>
