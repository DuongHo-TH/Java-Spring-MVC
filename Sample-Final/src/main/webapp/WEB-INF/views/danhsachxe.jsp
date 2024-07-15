<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
<table class="table">
				<thead class="table-dark">
					<tr>
						<th scope="col">Mã Xe</th>
						<th scope="col">Hãng Sản Xuất</th>
						<th scope="col">Biển Số</th>
						<th scope="col">Hạn Kiểm Định</th>
						<th scope="col">Mã Loại Xe</th>
						<th scope="col">Mô Tả Xe</th>
						<th scope="col">Số Chỗ</th>
						<th scope="col">Mã Nhà Xe</th>
						<th scope="col">Tên Nhà Xe</th>
						<th scope="col">Năn Thành Lập</th>
						<th scope="col">Active</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listxe }" var="xe">
						<tr>
							<td>${xe.maxe}</td>
							<td>${xe.hangsanxuat}</td>
							<td>${xe.bienso}</td>
							<td>${xe.hankiemdinh}</td>
							<td>${xe.loaixe.maloaixe}</td>
							<td>${xe.loaixe.motaloaixe}</td>
							<td>${xe.loaixe.sochongoi}</td>
							<td>${xe.nhaxe.manhaxe}</td>
							<td>${xe.nhaxe.tennhaxe}</td>
							<td>${xe.nhaxe.namthanhlap}</td>
							<td>
								<c:url value="/themlichtrinh"
									var="themlichtrinh">
									<c:param name="maxe" value="${xe.maxe}"></c:param>
								</c:url> <a href="${themlichtrinh}" target="blank"><i class="fa-solid fa-pen-to-square"></i></a>
							</td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
			
</body>