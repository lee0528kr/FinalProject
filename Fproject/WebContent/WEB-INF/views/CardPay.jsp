<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CardPay.jsp</title>

<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/solid.js"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/button.css">
<script type="js/bootstrap.min.js"></script>
<script type="js/bootstrap.js"></script>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<!-- jquery plugins here-->
<!-- jquery -->
<script src="js/jquery-1.12.1.min.js"></script>
<!-- popper js -->
<script src="js/popper.min.js"></script>
<!-- bootstrap js -->
<script src="js/bootstrap.min.js"></script>
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

<script type="text/javascript">

	function cardPay()
	{
		f = document.cardpayForm;
		
		if(!f.payDetail.value)
		{
			alert("카드번호를 입력해주세요.");
			f.payDetail.focus();
			return;
		}
		
		if(!f.cardPw.value)
		{
			alert("비밀번호를 입력해주세요.");
			f.cardPw.focus();
			return;
		}
		
		f.submit();
		
		alert("모임 신청이 완료되었습니다. 메인으로 이동합니다.");
	}

</script>



</head>
<body>

<div>
	<c:import url="bar.jsp"></c:import>
</div>

<section class="course_details_area section_padding"
	style="padding-bottom: 0;">
	<div>
		<c:import url="MeetingBar.jsp"></c:import>
	</div>
</section>

<br>
<br>
<br>


<div>
	<h3 align="center">[카드 결제]</h3>
</div>



<br>
<br>

<div class="container" align="center">
	<form action="cardpay.action" method="post" name="cardpayForm" id="cardpayForm">
		<table>
			<tr>
				<th>이름</th>
				<td style="padding: 10px;">
					<input type="text" class="form-control" id="memName" name="memName" value="${myInfo.memName }" readonly="readonly">
				</td>
			</tr>
			<tr>
				<th>결제금액</th>
				<td style="padding: 10px;">
					<%-- <fmt:setLocale value="ko_KR"/><input type="text" class="form-control" value='<fmt:formatNumber value="${ngCost }"></fmt:formatNumber>' readonly="readonly"> --%>
					<%-- <fmt:setLocale value="ko_KR"/><fmt:formatNumber type="currency" value="${ngCost}" /> --%>
					<input type="text" class="form-control" id="ngCost" name="ngCost" value="${ngCost }" readonly="readonly">
				</td>
			</tr>

			<tr>
				<th>카드번호</th>
				<td style="padding: 10px;">
					<input type="text" class="form-control"	name="payDetail" id="payDetail">
				</td>
			</tr>

			<tr>
				<th>비밀번호</th>
				<td style="padding: 10px;">
					<input type="password" class="form-control" id="cardPw" name="cardPw">
				</td>
			</tr>
			<tr>
				<td colspan="2" style="padding: 10px; text-align: center;">
					<button type="button" class="btn4" onclick="cardPay()">결제하기</button>&nbsp;&nbsp;
					<button type="button" class="btn4" onclick="location.href='pay.action'">취소하기</button>
				</td>
			</tr>
		</table>
	</form>
</div>

<div>
	<c:import url="footer.jsp"></c:import>
</div>


</body>
</html>