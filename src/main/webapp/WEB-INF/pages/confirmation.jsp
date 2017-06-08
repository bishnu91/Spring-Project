<html>
<head>
<%@ page isELIgnored="false" %>
	<title>Registration Confirmation</title>
	<link>
	<style>
	h1 {
    color: green;
    }
    
	#loginDiv {
		margin: auto;
    		width: 50%;
	}
	</style>
</head>
<body>

<div id="loginDiv">
	<h1>Registration Confirmation</h1>
	<table>
	<tr>
		<td><label>Name : </label></td>
		<td>${profile.name}</td>
	</tr>
	<tr>
		<td><label>Gender : </label></td>
		<td>${profile.gender}</td>
	</tr>
	<tr>
		<td><label>State : </label></td>
		<td>${profile.state}</td>
	</tr>
	</table>
  	
</div>

</body>
</html>
