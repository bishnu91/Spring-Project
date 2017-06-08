<html>
<head>
<%@ page isELIgnored="false" %>
	<title>Online Shopping</title>
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
	<h1>Register Student</h1>
	<form action="register" method="post">
		<table>
			<tr>
				<td><label>Name : </label></td>
				<td><input type = "text" name = "name"></td>
			</tr>
			<tr>
				<td><label>Email : </label></td>
				<td><input type = "text" name = "email"></td>
			</tr>
			<tr>
				<td><label>Gender : </label></td>
				<td>  <input type="radio" name="gender" value="m"> Male 
  					  <input type="radio" name="gender" value="f"> Female 
  					  <input type="radio" name="gender" value="o"> Other</td>
			</tr>
			<tr>
				<td><label>Address 1 : </label></td>
				<td><input type = "text" name = "address1"></td>
			</tr>
			<tr>
				<td><label>Address 2 : </label></td>
				<td><input type = "text" name = "address2"></td>
			</tr>
			<tr>
				<td><label>City : </label></td>
				<td><input type = "text" name = "city"></td>
			</tr>
			<tr>
				<td><label>State : </label></td>
				<td>
				<select name = "state">
  					<option value="VA">Virginia</option>
  					<option value="DE">Delaware</option>
  					<option value="NJ">New Jersey</option>
  					<option value="NY">New York</option>
				</select>
				</td>
			</tr>
			
			<tr>
				<td><input type="submit" value = "Register"></td>
				<td><button type="reset" value="Reset">Reset</button></td>
			</tr>
		</table>
	</form>
  	
</div>

</body>
</html>
