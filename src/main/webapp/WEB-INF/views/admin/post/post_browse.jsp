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
							<h3 class="text-info">Bài đăng chờ phê duyệt (${listPost.size()})</h3>
						</div>

						<br /> <br />
						<table class="table table-hover table-bordered table-striped"
							id="myTable">
							<thead>
								<tr>
									<th>STT</th>
									<th>Mã bài đăng</th>
									<th>Ngày đăng</th>
									<th>Ảnh</th>
									<th>Tiêu đề</th>
									<th>Lượt xem</th>
									<th>Duyệt</th>
									<th>Hủy</th>
								</tr>
							</thead>
							<tbody>
								<%
									int i = 0;
								%>
								<c:forEach items="${listPost}" var="post">
									<tr>
										<td><%=++i%></td>

										<td style="width: 120px">${post.id}</td>
										<td style="width: 120px">${post.created_at}</td>
										<td>
												<a class="example-image-link" data-lightbox="img"
													href="${pageContext.request.contextPath}/resources/img/${post.img}">
													<img
													src="${pageContext.request.contextPath}/resources/img/${post.img}"
													width="64" height="40">
												</a></td>
										<td style="width: 300px">${post.title }</td>
										<td style="width: 100px">${post.views }</td>
										<td>
												<button class="btn btn-primary btn-sm" onclick="#">Duyệt</button>
											</td>
										<td>
												<button class="btn btn-danger btn-sm" onclick="#">Hủy</button>
											</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<br /> <br /> <br /> <br />
					</div>
				</div>

			</div>
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

<script>
  $(document).ready(function() {
	  $("#myTable").DataTable();
  });
  /*
  function confirmPost(id){
    $.ajax({
      url:'{{ url('bai-dang-cho-phe-duyet/duyet/')}}'+'/'+id,
      method:'GET',
      success:function(data){
        $("#containerPost").html();
        $("#containerPost").html(data);
      }
    });
  }

  function cancelPost(id){
    $.ajax({
      url:'{{ url('bai-dang-cho-phe-duyet/huy/')}}'+'/'+id,
      method:'GET',
      success:function(data){
        $("#containerPost").html();
        $("#containerPost").html(data);
      }
    });
  }*/
  

</script>
<script>
	var x= document.getElementById("baidang");
	x.className="nav nav-second-level collapse in";
	x.setAttribute('aria-expanded','true');
	x.style.height="auto";
	x.getElementsByTagName("a")[0].className="active";
</script>

</body>

</html>

