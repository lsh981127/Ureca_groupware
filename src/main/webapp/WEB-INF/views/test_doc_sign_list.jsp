<%@ page	language="java"
			contentType="text/html; charset=EUC-KR"
			pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>test_doc_sign_list</title>
</head>
<body>

<h1>http://localhost:8080/ureca/test_doc_sign_list</h1>

<c:set var="sign_list" value="${allDocSignList}" /> <!-- 변수 설정 -->

<!--  
<hr>
	<a href="http://localhost:8080/ureca/emp_ins"> 직원 추가 </a>
<hr>
-->


<table border="1">
	<thead>
		<tr>
			<th>no</th>
			<th>sign_no</th>
			<th>emp_no</th>
			<th>sign_path_emp_no1</th>
			<th>sign_path_emp_no2</th>
			<th>sign_path_emp_no3</th>
			<th>sign_reg_date</th>
			<th>sign_type</th>
			<th>sign_step</th>
			<th>sign_status</th>
			<th>sign_date</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${sign_list}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${dto.sign_no}</td>
				<td>${dto.emp_no}</td>
				<td>${dto.sign_path_emp_no1}</td>
				<td>${dto.sign_path_emp_no2}</td>
				<td>${dto.sign_path_emp_no3}</td>
				<td>${dto.sign_reg_date}</td>
				<td>${dto.sign_type}</td>
				<td>${dto.sign_step}</td>
				<td>${dto.sign_status}</td>
				<td>${dto.sign_date}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
