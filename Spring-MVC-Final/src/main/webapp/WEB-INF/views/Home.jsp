<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<body>
  

	<h1>Danh Sách Khách Hàng Đăng Ký Dịch Vụ</h1>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<form class="d-flex"
				action="${pageContext.request.contextPath}/searchdk" method="GET">
				<input class="form-control me-2" name="search" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success">Search</button>
			</form>
		</div>
	</nav>
	<table class="table">
		<thead class="table-dark">
			<tr>
				<th scope="col">Mã Đăng Ký</th>
				<th scope="col">Họ Tên</th>
				<th scope="col">Tỉnh Thành</th>
				<th scope="col">Số Điện Thoại</th>
				<th scope="col">Số Lương DV</th>
				<th scope="col">Ngày Đăng Ký</th>
				<th scope="col">Ngày Sử Dụng</th>
				<th scope="col">Tổng Tiền</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listdk }" var="dk">
				<tr>
					<td>${dk.madk}</td>
					<td>${dk.hoten}</td>
					<td>${dk.matt.tentt}</td>
					<td>${dk.sdt}</td>
					<td>${dk.soluongdv}</td>
					<td>${dk.ngaydk}</td>
					<td>${dk.ngaysddv}</td>	
					<td>${dk.tonhtien}</td>
					<td> <c:url value="/editdk"
							var="editdk">
				<c:param name="dkId" value="${dk.madk}"></c:param>
						</c:url> <a href="${editdk}" target="blank"><i
							class="fa-solid fa-pen-to-square"></i></a></td>
				
				
				</tr>

			</c:forEach>
		</tbody>
	</table>
	
	<c:if test="${update == 1}"><h3>Update Thông Tin Đăng Ký Làm Tóc Thành Công</h3> </c:if>
	<nav aria-label="...">
		<ul class="pagination">
		
			<li class="page-item ">
			<c:if test="${page >1 }" ><a class="page-link"
				href="${pageContext.request.contextPath}/trang-chu?page=${page - 1}"
				tabindex="-1" aria-disabled="true">Previous</a></c:if>
				</li>
				
			<li class="page-item "><a class="page-link"
				href="">${page}</a></li>
				
			<li class="page-item" ><c:if test="${page < totaldanhsach }"><a class="page-link"
				href="${pageContext.request.contextPath}/trang-chu?page=${page + 1}">Next</a>
				</c:if>
			</li>
		</ul>
	</nav>

</body>