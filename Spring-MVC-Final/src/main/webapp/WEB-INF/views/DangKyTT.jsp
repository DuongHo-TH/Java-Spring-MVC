<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<body>
	<div class="container w-50">
		<h1>Sử Dụng Dịch Vụ</h1>
		<form:form
			action="${pageContext.request.contextPath}/savedangky"
			class="form-control " method="post" modelAttribute="dk">
			
			<label for="madk" class="form-check-label">Mã Đăng Ký</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="madk" type="text" min="0" name="madk"
					class="form-control" placeholder="Mã Đăng Ký" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="madk" cssClass="error text-danger"></form:errors><br>
			
			
			<label for="hoten" class="form-check-label">Họ Tên</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="hoten" type="text" name="hoten"
					class="form-control" placeholder="Họ Tên" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="hoten" cssClass="error text-danger"></form:errors><br>
			
			<label for="matt.matt" class="form-check-label">Mã Tỉnh Thành</label>
			<form:select path="matt.matt" name="matt.matt" items="${tinhthanhlist}" 
				itemValue="matt" itemLabel="tentt" class="form-select"
				aria-label="Default select example" aria-describedby="addon-wrapping">
			</form:select>
			<form:errors path="matt.matt" cssClass="error text-danger"></form:errors><br>
			
			<label for="sdt" class="form-check-label">Số Điện Thoại</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="sdt" type="text"  name="sdt"
					class="form-control" placeholder="Số Điện Thoại" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="sdt" cssClass="error text-danger"></form:errors><br>
			
			<label for="soluongdv" class="form-check-label">Số Lượng DV</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="soluongdv" type="number" min="0" name="soluongdv"
					class="form-control" placeholder="Số Lượng" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="soluongdv" cssClass="error text-danger"></form:errors><br>
			
			
			<form:label path="ngaydk" class="form-label">Ngày Đăng Ký</form:label>
			<form:input type="date" path="ngaydk"
				class="form-control" />
            <form:errors path="ngaydk" cssClass="error text-danger"></form:errors><br>
            
            <form:label path="ngaysddv" class="form-label">Ngày Sử Dụng</form:label>
			<form:input type="date" path="ngaysddv"
				class="form-control" />
            <form:errors path="ngaysddv" cssClass="error text-danger"></form:errors><br>
			
			<form:button class="btn btn-secondary form-control mt-3">Thêm Sử Dụng Dịch Vụ</form:button>
		</form:form>
	</div>
</body>