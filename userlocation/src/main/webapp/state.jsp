<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>State</title>
<style>
form {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.container {
	display: flex;
	flex-direction: column;
	border: 2px dotted red;
	width: 25vw;
	padding: 20px;
	margin-top: 50px;
}

h1, p {
	text-align: center;
}
/* more styles added to beautify the input fields */
input {
	margin: 0.25em 0em 1em 0em;
	outline: none;
	padding: 0.5em;
	border: none;
	background-color: rgb(225, 225, 225);
	border-radius: 0.25em;
	color: black;
}
/* styles for button */
button {
	padding: 0.75em;
	border: none;
	outline: none;
	background-color: rgb(68, 18, 232);
	color: white;
	border-radius: 0.25em;
}

/* hover functionality for button */
button:hover {
	cursor: pointer;
	background-color: rgb(41, 4, 164);
}
</style>
</head>


<body>

	<form action="saveStateDetails">
		<!-- class named "container" is assigned to div -->
		<div class="container">
			<h1>
				<u>State Registration</u>
			</h1>
			<label for="username"><b>Name :</b></label> <input type="text"
				placeholder="Enter name" name="name" required /> <label for="email"><b>Capital
					:</b></label> <input type="text" placeholder="Enter capital" name="capital"
				required /> <label for="pwd"><b>Population :</b></label> <input
				type="text" placeholder="Enter Population" name="population"
				required /> <label for="email"><b>Area :</b></label> <input
				type="text" placeholder="Enter area" name="area" required /> <label
				for="email"><b>Language :</b></label> <input type="text"
				placeholder="Enter language" name="language" required />


			<button type="submit">ADD STATE</button>
		</div>
	</form>



</body>
</html>