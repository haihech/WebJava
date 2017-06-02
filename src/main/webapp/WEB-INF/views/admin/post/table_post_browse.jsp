<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div>
	<h3 class="text-info">Bài đăng chờ phê duyệt (${listPost.size()})</h3>
</div>

<br />
<br />
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
				<td style="width: 150px">${post.userEntity.nickName}</td>
				<td><a class="example-image-link" data-lightbox="img"
					href="${pageContext.request.contextPath}/resources/img/${post.img}">
						<img
						src="${pageContext.request.contextPath}/resources/img/${post.img}"
						width="64" height="40">
				</a></td>
				<td style="width: 200px">${post.title }</td>
				<td>${post.categoryEntity.type}</td>
				<td style="width: 100px">${post.views }</td>
				<td>
					<button class="btn btn-primary btn-sm"
						onclick="confirmPost(${post.id})">Duyệt</button>
				</td>
				<td>
					<button class="btn btn-danger btn-sm"
						onclick="cancelPost(${post.id})">Hủy</button>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<br />
<br />
<br />
<br />

<script>
  $(document).ready(function() {
    $('#myTable').DataTable();
  } );
</script>