<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<body>
	<div class="container w-50">
		<h1>Thông Tin Xe Mới</h1>
		<form:form action="${pageContext.request.contextPath}/savelichtrinh"
			class="form-control " method="POST" modelAttribute="lichtrinhxe">

			<label for="idlichtrinh.maxe" class="form-check-label">Mã Xe</label>
			<form:select path="idlichtrinh.maxe" 
				items="${listxe}"  itemValue="maxe"
				itemLabel="maxe" class="form-select"
				aria-label="Default select example"
				aria-describedby="addon-wrapping">
			</form:select>
			<form:errors path="idlichtrinh.maxe" cssClass="error text-danger"></form:errors>
			<label for="tentaixe" class="form-check-label">Tên Tài Xế</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="tentaixe" type="text" name="tentaixe"
					class="form-control" placeholder="Tên Tài Xế" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="tentaixe" cssClass="error text-danger"></form:errors>

			<label for="tuyenxe.matuyen" class="form-check-label">Tuyến
				Xe</label>
			<form:select path="tuyenxe.matuyen" name="tuyenxe.matuyen"
				items="${listtuyenduong}" id="tuyenxe.matuyen" itemValue="matuyen"
				itemLabel="tuyenduong" class="form-select"
				aria-label="Default select example"
				aria-describedby="addon-wrapping">
			</form:select>
			<form:errors path="tuyenxe.matuyen" cssClass="error text-danger"></form:errors>

			<form:label path="idlichtrinh.ngayxuatben" class="form-label">Ngày Xuất Bến</form:label>
			<form:input type="date" path="idlichtrinh.ngayxuatben"
				class="form-control" />
			<form:errors path="idlichtrinh.ngayxuatben"
				cssClass="error text-danger"></form:errors>

			<form:label path="idlichtrinh.gioxuatben" class="form-label">Giờ Xuất Bến</form:label>
			<form:input type="time" path="idlichtrinh.gioxuatben"
				class="form-control" />
			<form:errors path="idlichtrinh.gioxuatben"
				cssClass="error text-danger"></form:errors>
			<form:label path="soluonghanhkhach" class="form-label">Số Hành Khách</form:label>
			<form:input path="soluonghanhkhach" name="soluonghanhkhach" />

			<form:button class="btn btn-secondary form-control mt-3">Thêm Lịch Trình Xe</form:button>
		</form:form>
	</div>
</body>
</html>