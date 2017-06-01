<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Trang quản trị</a>
            </div>
            <!-- /.navbar-header -->

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                 <div>
                                    <strong>Ngô Quang Hải</strong>
                                    <span class="pull-right text-muted">
                                        <em>Hôm qua</em>
                                    </span>
                                </div>
                                <div>Xin chào...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Đọc tất cả tin nhắn</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                               <div>
                                    <p>
                                        <strong>Nhiệm vụ 1</strong>
                                        <span class="pull-right text-muted">40% Hoàn thành</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Xem tất cả nhiệm vụ</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">

                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Cập nhật tài khoản
                                    <span class="pull-right text-muted small">4 phút trước</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Xem tất cả thông báo</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">${sessionScope.username}
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>

                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> Tài khoản</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Cài đặt</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="logout"><i class="fa fa-sign-out fa-fw"></i> Đăng xuất</a>
                        </li>
                    </ul>
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                        <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Tìm kiếm...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
                        </li>
                        <li style="font-size: 16px" id="trangchu">
                            <a href="home"><i class="fa fa-home fa-fw  menu-hinh"></i> Trang chủ</a>
                        </li>
                        
                        <c:if test="${sessionScope.listRole.contains('quyen-01')}">
                        <li>
                            <a href="#" style="font-size: 16px"><i class="fa fa-bars fa-fw  menu-hinh"></i> Bài đăng<span class="fa arrow"></span></a>
                            
                            <ul class="nav nav-second-level" id="baidang">
                                <li><a href="list-post-browse">Chờ phê duyệt</a></li>
                                <li><a href="#">Đăng lên trang chủ</a></li>
                                <li><a href="#">Danh sách</a></li>
                                <li><a href="#">Quản lý danh mục</a></li>
                                    
                            </ul>
                            
                            <!-- /.nav-second-level -->
                        </li>
                        </c:if>

                        <c:if test="${sessionScope.listRole.contains('quyen-02')}">
                        <li style="font-size: 16px" id="report">
                            <a href="#"><i class="fa fa-remove fa-fw  menu-hinh"></i> Report</a>
                        </li>
                        </c:if>

                        <c:if test="${sessionScope.listRole.contains('quyen-04')}">
                        <li style="font-size: 16px" id="thongke">
                            <a href="#"><i class="fa fa-bug fa-fw  menu-hinh"></i> Thống kê</a>
                        </li>
                        </c:if>
                        
                        <c:if test="${sessionScope.listRole.contains('quyen-03')}">
                        <li id="nguoidung">
                            <a href="#" style="font-size: 16px"><i class="fa fa-user fa-fw  menu-hinh" ></i> Người dùng</a>
                        </li>
                        </c:if>

  
                        <li id="taikhoan">
                            <a href="#" style="font-size: 16px"><i class="fa fa-user-plus fa-fw  menu-hinh"></i> Tài khoản</a>
                        </li>

                       

              
                    </ul>;
                </div>
                <!-- /.sidebar-collapse -->
            </div>
            <!-- /.navbar-static-side -->
        </nav>
