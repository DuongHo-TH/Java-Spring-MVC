<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<body>
	<div class="container w-50">
		<h1>Thông Tin Xe Mới</h1>
		<form:form action="${pageContext.request.contextPath}/savexe"
			class="form-control " method="POST" modelAttribute="xemoi">
			<label for="maxe" class="form-check-label">Mã Xe</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="maxe" type="text" name="maxe" class="form-control"
					placeholder="Mã Xe" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="maxe" cssClass="error text-danger"></form:errors>
			<label for="hangsanxuat" class="form-check-label">Hãng Sản
				Xuất</label>
			<div class="input-group pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="hangsanxuat" type="text" name="hangsanxuat"
					class="form-control" placeholder="Hãng Sản Xuất"
					aria-label="Username" aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="hangsanxuat" cssClass="error text-danger"></form:errors>
			<label for="loaixe.maloaixe" class="form-check-label">Mã Loại Xe</label>
			<form:select path="loaixe.maloaixe" items="${listloaixe}" name="loaixe"
 				id="loaixe" itemValue="maloaixe" itemLabel="maloaixe" class="form-select"
				aria-label="Default select example"> 
			</form:select> 
			<form:errors path="loaixe.maloaixe" cssClass="error text-danger"></form:errors>


			<label for="bienso" class="form-check-label">Biển Số</label>
			<div class="input-group ">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-lock"></i></span>
				<form:input path="bienso" type="text" name="bienso"
					class="form-control" placeholder="xxYx-xxxxx" aria-label="Username"
					aria-describedby="addon-wrapping" />
			</div>
			<form:errors path="bienso" cssClass="error text-danger"></form:errors>

			<form:label path="hankiemdinh" class="form-label">Hạn Kiểm Định</form:label>
			<form:input type="date" path="hankiemdinh" class="form-control" />
			<form:errors path="hankiemdinh" cssClass="error text-danger"></form:errors>
						<label for="nhaxe.manhaxe" class="form-check-label">Mã Nhà Xe</label>
			 						<form:select path="nhaxe.manhaxe" name="nhaxe.manhaxe" items="${listnhaxe}" 
									id="nhaxe" itemValue="manhaxe" itemLabel="tennhaxe"    
				 				class="form-select" aria-label="Default select example"  
					 				aria-describedby="addon-wrapping">   
 						 			</form:select>   
		
			<form:errors path="nhaxe" cssClass="error text-danger"></form:errors>

			<form:button class="btn btn-secondary form-control mt-3">Thêm Xe Mới</form:button>
		</form:form>
	</div>
</body>
</html>