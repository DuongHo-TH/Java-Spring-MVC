<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create NewWord</title>
</head>
<body>
<div class="container w-50 mt-5 ">
    <form action="saveword" class="text-center form-control bg-secondary text-white" method="post">
        <h1>New Word</h1>
        <div class="input-group flex-nowrap pb-3">
            <span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-user"></i></span>
            <input type="text" name="English" class="form-control"  placeholder="English" aria-label="Username" aria-describedby="addon-wrapping">
          </div>
        
          <div class="input-group flex-nowrap pb-3">
            <span class="input-group-text" id="addon-wrapping"><i class="fa-solid fa-lock"></i></span>
            <input type="text" name="Vietnamese" class="form-control" placeholder="Vietnamese" aria-label="Username" aria-describedby="addon-wrapping">
          </div>

        <button class="btn btn-primary pb-3 mb-5" type="submit">Create </button>
        <button class="btn btn-primary pb-3 mb-5" type="reset">Cancel </button>

    </form>
    </div>
</body>
</html>