<%@ page language="java" pageEncoding="UTF-8"%>
<%
	session.invalidate();
	response.sendRedirect(request.getContextPath()+"/");
%>

