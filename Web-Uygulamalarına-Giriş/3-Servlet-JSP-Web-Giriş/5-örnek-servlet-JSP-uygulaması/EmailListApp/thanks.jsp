<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>Murach's Java Servlets and JSP</title>
	<link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>

<body>
	<h1>Thanks for joining our email list</h1>

	<p>Here is the information you entered:</p>

	<label>Email:</label>
	<span>${user.email}</span>

	<label>First Name:</label>
	<span>${user.firstName}</label>

	<label>Last Name:</label>
	<span>{user.lastName}</label>

	<p>To enter another email adress, click on the Back button in your browser or
	the Return button shown below.</p>

	<form action="" method="GET">
		<input type="hidden" name="action" value="join">
		<input type="submit" value="Return">
	</form>
</body>

</html>
	 
	
