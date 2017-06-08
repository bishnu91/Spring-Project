<!DOCTYPE html>
<html>
<head>
<style> 
input[type=text] {
    width: 130px;
    box-sizing: border-box;
    border: 2px solid #ccc;
    border-radius: 4px;
    font-size: 16px;
    background-color: white;
    background-image: url('searchicon.png');
    background-position: 10px 10px; 
    background-repeat: no-repeat;
    padding: 12px 20px 12px 40px;
    -webkit-transition: width 0.4s ease-in-out;
    transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
    width: 100%;
}
</style>
</head>
<body>

<div id = "loginDiv">

<h1>  ${usersearch}</h1>
<h1>Search Form</h1>
	<form action="searchquery" method="post">
		<table>
			
			<tr>
				<input type="text" name="search" placeholder="Search..">
				<td><input type = "reset" value = "Clear" name = "clear"></td>
				
			</tr>
		</table>
	</form>




  
  
  
</form>
 </div>
</body>
</html>



