<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
		<meta name="description" content="">
		<meta name="author" content="">
		<link rel="icon" href="../../favicon.ico">

		<title>垃圾分类 改变生活</title>

		<!-- Bootstrap core CSS -->
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

		<link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

		<link href="CSS/cover.css" rel="stylesheet">

		<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

	</head>

	<body>

		<div class="site-wrapper">

			<div class="site-wrapper-inner">

				<div class="cover-container">

					<div class="masthead clearfix">
						<div class="inner">
							<h3 class="masthead-brand">分类垃圾 改变生活</h3>
							<nav>
								<ul class="nav masthead-nav">
									<li>
										<a href="LoginPage.jsp">你 是什么垃圾？</a>
									</li>
									<li>
										<a href="#">来看看垃圾怎么分类</a>
									</li>
									<li class="active">
										<a href="#">注册</a>
									</li>
								</ul>
							</nav>
						</div>
					</div>

					<div class="inner cover" style="margin-top: 100px;">
						<h1 class="cover-heading">Classify your junk</h1>
						<p class="lead"><a href="Test2.html">直接开始</a></p>
					</div>


				</div>

				<div class="inner cover" style="padding-bottom: 100px;">
					<div class="container">
						<form class="form-signin" action="RegisterServlet" method="post">
							<h2 class="form-signin-heading">请输入信息完成注册</h2>
							<label for="inputUname" class="sr-only">用户名</label>
							<input name="uname" id="inputUnmae" class="form-control" placeholder="用户名" required autofocus>
							<div style="margin-top: 6px"></div>
							<label for="inputEmail" class="sr-only">邮箱地址</label>
							<input type="email" name="uemail" id="inputEmail" class="form-control" placeholder="邮箱地址" required autofocus>
							<div style="margin-top: 6px"></div>
							<label for="inputPassword" class="sr-only">密码</label>
							<input name="upass" id="inputPassword" class="form-control" placeholder="密码" required>
							<div style="margin-top: 6px"></div>
							<label for="inputPassword" class="sr-only">再次输入密码</label>
							<input name="Rupass" id="inputPassword" class="form-control" placeholder="再次输入密码" required>
							<div style="margin-top: 30px"></div>
							
							<button class="btn btn-lg btn-primary btn-block" type="submit">完成注册</button>
						</form>

					</div>
					<!-- /container -->
				</div>
			</div>

		</div>
	</body>

</html>