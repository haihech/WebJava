<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="vi">

<head>
<title>Photo Sharing</title>
<%@ include file="../head.jsp"%>

<style>
       #myTable th{
	      text-align: center;
	      vertical-align: middle;
        }
        #myTable td{
	      text-align: center;
	      vertical-align: middle;
        }
       
    </style>
</head>

<body>
    
	<div id="wrapper">
		<%@ include file="../nav.jsp"%>

		<div id="page-wrapper">
			<div class="row">

				<div class="col-md-12">
					<div class="main-right" id="containerPost">
						<div>
							<h3 class="text-info">Danh sách bài được yêu thích nhất</h3>
						</div>

						<br /> <br />
						<table class="table table-hover table-bordered table-striped"
							id="myTable">
							<thead>
								<tr>
									<th>STT</th>
									<th>Mã bài đăng</th>
									<th>Ngày đăng</th>
									<th>Người đăng</th>
									<th>Ảnh</th>
									<th>Tiêu đề</th>
									<th>Loại</th>
									<th>Lượt xem</th>
									<th>Lượt like</th>
								</tr>
							</thead>
							<tbody>
							    <c:if test="${not empty listPost}">
								<%
									int i = 0;
								%>
								<c:forEach items="${listPost}" var="post">
									<tr>
										<td><%=++i%></td>

										<td style="width: 120px">${post.id}</td>
										<td style="width: 120px">${post.created_at}</td>
										<td style="width: 150px">${post.userEntity.nickName}</td>
										<td>
												<a class="example-image-link" data-lightbox="img"
													href="${pageContext.request.contextPath}/resources/img/${post.img}">
													<img
													src="${pageContext.request.contextPath}/resources/img/${post.img}"
													width="64" height="40">
												</a></td>
										<td style="width: 200px">${post.title }</td>
										<td>${post.categoryEntity.type}</td>
										<td style="width: 100px">${post.views }</td>
										<td style="width: 100px">${post.likes }</td>  
									</tr>
								</c:forEach>
								</c:if>
							</tbody>
						</table>
						
						<c:if test="${not empty listPost}">
						<br/><br/>
                       <div><center>
                           <a href="upload-home-page/${listPost.size()}" class="btn btn-primary">Đăng lên trang chủ</a>
                       </center></div>
                       </c:if>
                       
						<br /> <br /> <br /> <br />
					</div>
				</div>

			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

<script >
   var x= document.getElementById("baidang");
    x.className="nav nav-second-level collapse in";
    x.setAttribute('aria-expanded','true');
    x.style.height="auto";
    x.getElementsByTagName("a")[1].className="active";

</script>

<script >
  $(document).ready(function() {
    $('#myTable').DataTable();
  } );
</script>

</body>

</html>

