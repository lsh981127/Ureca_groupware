<%@ page	language="java"
			contentType="text/html; charset=EUC-KR"
			pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>test_vac_list</title>
</head>
<body>

<h1>http://localhost:8080/ureca/test_vac_list</h1>

<c:set var="vac_list" value="${allVacList}" /> <!-- 변수 설정 -->

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
			<th>vac_type</th>
			<th>vac_start_date</th>
			<th>vac_end_date</th>
			<th>vac_duration</th>
			<th>vac_reason</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${vac_list}" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${dto.sign_no}</td>
				<td>${dto.vac_type}</td>
				<td>${dto.vac_start_date}</td>
				<td>${dto.vac_end_date}</td>
				<td>${dto.vac_duration}</td>
				<td>${dto.vac_reason}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>
