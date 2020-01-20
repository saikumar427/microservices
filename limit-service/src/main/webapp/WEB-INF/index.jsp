<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cricket Score</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Cricket Score (${score.score}) </h2>
   <c:forEach items="${score_info.data.batting}" var="batting">
   	   <div class="container">
   	   <h4>${batting.title}</h4>
	   <c:forEach items="${batting.scores}" var="batman">
		   <c:if test = "${batman.batsman != 'Extras'}"> 
				   <div class="col-sm-3 col-md-3 list-group">
				    <a class="list-group-item active" <c:if test = "${batman.dismissal != 'not out'}"> style="background-color:#ff6969"</c:if>> ${batman.batsman}</a>
				    <a class="list-group-item">RUNS : ${batman.runs}</a>
				    <a class="list-group-item">Balls : ${batman.balls}</a>
				    <a class="list-group-item">Status : ${batman.dismissal}</a>
				    <a class="list-group-item" style="height:60px">Dismissal info : ${batman.dismissal_info}</a>
				  </div>
			</c:if>
	    </c:forEach> 
	    </div>
    </c:forEach> 
</div>
</body>
</html>