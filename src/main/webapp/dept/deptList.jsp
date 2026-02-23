<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html lang="en" data-bs-theme="auto">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">

<title>MyBatis 실습</title>
<link rel="shortcut icon" href="http://localhost/mvc_prj/common/images/favicon.ico">

<script src="http://localhost/mvc_prj/common/js/color-modes.js"></script>
<!-- bootstrap CDN 시작 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

<meta name="theme-color" content="#712cf9">
<link href="http://localhost/mvc_prj/common/css/carousel.css" rel="stylesheet">
<style type="text/css">
#wrap{  margin: 0px auto; width: 1200px; height: 1000px; }	
#header{ height: 150px;	 }	
#container{ height: 700px;	 }	
#footer{ height: 150px;}	
</style>
<!-- jQuery CDN 시작 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script type="text/javascript">

$(function(){
	$("#btn").click(function () {
		$("#frm").submit();
	});//btn	
});//ready
</script>


</head>
<body>
	<main>
		<!-- Wrap the rest of the page in another container to center all the content. -->
		<div class="container marketing">
			<hr class="featurette-divider">
			<div class="row featurette">
				<div>
				<!-- 여기서부터 작성 시작-->
				<div>
				<h3>부서 선택</h3>
				<form action="searchEmp.do" id="frm" method="post">
				<input type="hidden" name="cmd" value="E0001"/>
					<select id="deptno" name="deptno">
						<option value="N/A">----부서선택----</option>					
						<c:forEach var="dept" items="${deptData}">
							<option value="${dept.deptno}"><c:out value="${dept.dname }(${dept.loc})"></c:out></option>
						</c:forEach>					
					</select>
					<input type="button" id="btn" value="사원검색" class="btn btn-info btn-sm"/>
				</form>
				</div>
					
				</div>
				
			</div>
			<hr class="featurette-divider">
			<!-- /END THE FEATURETTES -->
		</div>
		<!-- /.container -->
	</main>
	
</body>
</html>