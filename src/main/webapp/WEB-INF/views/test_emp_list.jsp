<%@ page	language="java"
			contentType="text/html; charset=EUC-KR"
			pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>test_emp_list</title>
</head>
<body>

<h1>http://localhost:8080/ureca/test_emp_list</h1>

<c:set var="emp_list" value="${allEmpList}" /> <!-- 변수 설정 -->

<!--  
<hr>
	<a href="http://localhost:8080/ureca/emp_ins"> 직원 추가 </a>
<hr>
-->

<table border="1">
	<thead>
		<tr>
			<th>no</th>
			<th>emp_no</th>
			<th>dept_no</th>
			<th>emp_vac_cnt</th>
			<th>emp_position</th>
			<th>emp_name</th>
			<th>emp_id</th>
			<th>emp_password</th>
			<th>emp_auth</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${emp_list}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${dto.emp_no}</td>
				<td>${dto.dept_no}</td>
				<td>${dto.emp_vac_cnt}</td>
				<td>${dto.emp_position}</td>
				<td>${dto.emp_name}</td>
				<td>${dto.emp_id}</td>
				<td>${dto.emp_password}</td>
				<td>${dto.emp_auth}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
