<!DOCTYPE html>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List accounts</title>
</head>
<body>
	<h2>Admin View</h2>
	<input type="text" id="searchInput" onkeyup="searchHandler()" placeholder="Search available accounts...">
	<ul id="accountUl">
		<c:forEach items="${accountNames}" var="listVar" >
			<li><p><c:out value = "${listVar}"/></p></li>
		</c:forEach>
	</ul>

<script>
	function searchHandler() {
		var ul = document.getElementById('accountUl');
		var li = ul.getElementsByTagName('li');
		var searchValue = document.getElementById('searchInput');
		var searchToUpper = searchValue.value.toUpperCase();
		
		var i, temp;
		for(i = 0; i < li.length; i++) {
			temp = li[i].getElementsByTagName("p")[0];
			if (temp.innerHTML.toUpperCase().indexOf(searchToUpper) > -1) {
         			li[i].style.display = "";
        		} else {
            			li[i].style.display = "none";
        		}
		}
	}	
</script>
</body>
</html>
