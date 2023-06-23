<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
</head>
<body>
	<c:set var="number" value="12345678" />
	<h1>숫자 출력</h1>
	<fmt:formatNumber value="${number}" />
	
	<h1>Type</h1>
	숫자: <fmt:formatNumber value="${number}" type="number" /><br>
	숫자 3자리마다 쉼표 제거: <fmt:formatNumber value="${number}" type="number" groupingUsed="false" /><br>
	
	<%-- percent는 1이 100% --%>
	100%: <fmt:formatNumber type="percent" value="1" /><br>
	40%: <fmt:formatNumber type="percent" value="0.4" /><br>
	
	통화(원): <fmt:formatNumber type="currency" value="${number}" /><br>
	통화(달러): <fmt:formatNumber type="currency" value="${number}" currencySymbol="$" />
	
	<h1>Pattern</h1>
	3.14: <fmt:formatNumber value="3.14" /><br>
	3.14(0.0000): <fmt:formatNumber value="3.14" pattern="0.0000" /><br> 
	3.14(#.####): <fmt:formatNumber value="3.14" pattern="#.####" /><br> 
	3.141592(#.####): <fmt:formatNumber value="3.141592" pattern="#.####" /><br> 
	
	<hr>
	
	<h1>Date 객체를 String 형태로 출력하기(fmt:formateDate)</h1>
	Date: ${today}<br>
	<fmt:formatDate value="${today}" pattern="yyyy년 MM월 dd일 HH시 mm분 ss초" var="pattern1" />
	pattern1: ${pattern1}<br>
	<fmt:formatDate value="${today}" pattern="yyyy/MM/dd HH:mm:ss" var="pattern2"/>
	pattern2: ${pattern2}<br>
	
	<h1>String을 Date 객체로 변환(fmt:parseDate)</h1>
	<fmt:parseDate value="${pattern2}" pattern="yyyy/MM/dd HH:mm:ss" />
	
	
	
	
	
	
	
	
</body>
</html>