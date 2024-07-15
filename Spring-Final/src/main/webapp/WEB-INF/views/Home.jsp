<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body>
<h1>Thêm Khách Hàng</h1>
		<form action="saveStudent" class="form-control " method="post">
			<label for="makh" class="form-check-label">Student ID</label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text" id="id" name="id"
					class="form-control" placeholder="Student ID"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<label for="tenkhach" class="form-check-label">Student Name</label>
			<div class="input-group  pb-3">
				<span class="input-group-text" id="addon-wrapping"><i
					class="fa-solid fa-user"></i></span> <input type="text" id="Studentname" name="Studentname"
					class="form-control" placeholder="Student Name"
					aria-label="Username" aria-describedby="addon-wrapping">
			</div>
			<button class="btn btn-secondary form-control pb-3">Thêm Student</button>
			</form>
</body>