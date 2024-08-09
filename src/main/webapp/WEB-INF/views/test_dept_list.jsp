<%@ page	language="java"
			contentType="text/html; charset=EUC-KR"
			pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>test_dept_list</title>
</head>
<body>

<h1>http://localhost:8080/ureca/test_dept_list</h1>

<c:set var="dept_list" value="${allDeptList}" /> <!-- 변수 설정 -->

<!--  
<hr>
	<a href="http://localhost:8080/ureca/emp_ins"> 직원 추가 </a>
<hr>
-->

<table border="1">
	<thead>
		<tr>
			<th>no</th>
			<th>dept_no</th>
			<th>dept_name</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${dept_list}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${dto.dept_no}</td>
				<td>${dto.dept_name}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
