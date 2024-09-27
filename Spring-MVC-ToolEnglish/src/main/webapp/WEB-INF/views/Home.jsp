<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body>
	<h1>Danh Sách Máy</h1>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid"></div>
	</nav>
	<form class="d-flex"
					action="${pageContext.request.contextPath}/search" method="GET" >
					<input class="form-control me-2" name ="search" type="text"
						placeholder="English" aria-label="Search"/>
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
	<table class="table">
		<thead class="table-dark">
			<tr>

				<th scope="col">Hãy Nhập Lại Từ Tiếng Anh</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${word}" var="word">
				<tr>
					<td>${word.vietnamese}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>