<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Epam Trees</title>
</head>
<body>
	<h1>Welcome to Epam Trees.</h1>
	<form action="./saveTree" method="post">
		<input type="submit"  name="Save Tree" title="Save Tree">
	</form>
	<form action="./removeTree" method="post">
		<input type="submit" name="Remove Tree" title="Remove Tree">
	</form>
</body>
<script type="text/javascript" src="./js/lib/jquery-1.10.2.min.js"></script>
</html>