<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AllMeeting.jsp</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="js/bootstrap.min.js"></script>
<script type="js/bootstrap.js"></script>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<!-- jquery plugins here-->
   
    <!-- easing js -->
    <script src="js/jquery.magnific-popup.js"></script>
    <!-- swiper js -->
    <script src="js/swiper.min.js"></script>
    <!-- swiper js -->
    <script src="js/masonry.pkgd.js"></script>
    <!-- particles js -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <!-- swiper js -->
    <script src="js/slick.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/waypoints.min.js"></script>
    <!-- custom js -->
    <script src="js/custom.js"></script>

<style type="text/css">
	
	.img-responsive
	{
		height: 200px;
		width: 500px;
	}
	
	.left
	{
		width: 50%;
		float: left;
	}
	.right
	{
		width: 50%;
		float: ri
	}
	
	/* div.name
   {
        width: 50%;
        float: left;
        box-sizing: border-box;
        
    }
    div.heart
    {
    	width: 50%;
    	float: right;
    	box-sizing: border-box;
    } */
    
</style>

</head>
<body>

<div class="header">
	<jsp:include page="bar.jsp"></jsp:include>
</div>

<div>
	<jsp:include page="TopButton.jsp"></jsp:include>
</div>

<section class="course_details_area section_padding" style="padding-bottom: 0;">
<div>
	<c:import url="MeetingBar.jsp"></c:import>
</div>
</section>


<div class="container"> 
	<div>
		<div align="left" class="left">
			<button type="button" class="btn btn-default">전체모임목록</button>
		</div>
		
		<div align="right">
		<label class="check-inline">
			<input type="checkbox" name="inlineRadioOptions" id="inlineCheck1" checked="checked" onclick="location='all.action'" value="종료모임">종료 모임도 볼래요!
		</label>
		<label class="check-inline">
		  	<input type="checkbox" name="inlineRadioOptions" id="inlineCheck2" onclick="location='allable.action'"value="참여모임">참여 가능한 모임만 볼래요!
		</label>
		</div>
	</div>
	
	<div align="right">
	    <div class="btn-group" role="group">
		   <c:choose>
	    		<c:when test="${sessionScope.ordercheck==1}">
	    		 <button id="btnGroupDrop2" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">최신순</button>
	    		</c:when>
		   		
		   		<c:when test="${sessionScope.ordercheck==2}">
	    		 <button id="btnGroupDrop2" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">인기순</button>
	    		</c:when>
	    		
	    		<c:when test="${sessionScope.ordercheck==3}">
	    		 <button id="btnGroupDrop2" type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">별점순</button>
	    		</c:when>
		    </c:choose>
		    <div class="dropdown-menu" aria-labelledby="btnGroupDrop2">
		      <a class="dropdown-item" onclick="location='allclose.action?ordercheck=1'" style="cursor:pointer;">최신순</a>
		      <a class="dropdown-item" onclick="location='allclose.action?ordercheck=2'" style="cursor:pointer;">인기순</a>
		      <a class="dropdown-item" onclick="location='allclose.action?ordercheck=3'" style="cursor:pointer;">별점순</a>
		    </div>
	  	</div>
  	</div>
  	<br><br><br>
  	
	<div class="row">
		<c:forEach var="AllGroup" items="${AllCloseGroupList}">
		<div class="col-sm-6 col-md-4">
			<div class="thumbnail">
				<img src="uploads/${AllGroup.ngPic }" alt="썸네일" class="img-responsive" style="width: 100%;"
					onclick="location.href='groupdetail.action?ngCode=${AllGroup.ngCode}'">
			<div class="caption">
			<div>
				<div class="starRev">
					
				</div>
				<div>
					<c:if test="${AllGroup.grStarAvg != 0.0 }">
					<i class="fas fa-star" style="width: 20px; color: #FAE415; font-size: 20px;"></i>
					</c:if>
					<c:if test="${AllGroup.grStarAvg == 0.0 }">
					<i class="far fa-star" style="width: 20px; color: #FAE415; font-size: 20px;"></i>
					</c:if>
					<span style="color: gray;">&nbsp;&nbsp;${AllGroup.grStarAvg } 
						<span style="font-size: 10pt; color: gray;">/ ${AllGroup.grStarCount }<span style="font-size: 8pt;">명</span></span>
					</span>
				</div>
			</div>
			<br>
			<div>
				<span style="font-size: 12px;">${AllGroup.grCount }회차</span>
				<div>
					<div class="name" onclick="location.href='groupdetail.action?ngCode=${AllGroup.ngCode}'">
					<h5>${AllGroup.grName }</h5>
					<input type="hidden" value="${AllGroup.ngCode }">
					</div>
					<div class="heart" align="right">
						<i class="far fa-heart"></i>
					</div>
					<br>
				</div>
				<h6 style="text-align: right; font-size: 10px;">"${AllGroup.memName }"</h6>
			</div>
			
			</div>
			</div><!-- end div.thumbnail -->
			<%-- <div>ngCode = ${AllGroup.ngCode}</div> --%>
		</div>
		</c:forEach>
		
			
		
		
  	
</div>

</div>

<div>
   <c:import url="footer.jsp"></c:import>
</div>

</body>
</html>