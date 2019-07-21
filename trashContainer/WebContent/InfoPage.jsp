<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>个人信息</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="CSS/dashboard.css" rel="stylesheet">
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

  </head>

  <body>

    <nav class="navbar navbar-fixed-top" style="background-color: #1F8430;color: white;">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">TEST</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#" style="color:white">垃圾分类 改变生活</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" style="color:white">主页</a></li>
            <li><a href="#" style="color:white">设置</a></li>
            <li><a href="#" style="color:white">帮助</a></li>
            <li><a href="LoginPage.jsp"  style="color:white">退出</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="搜索">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">基本信息<span class="sr-only">(current)</span></a></li>
            <li><a href="#">安全中心</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">基本信息</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-2 placeholder">
             <div style="width: 150px;height: 150px;border:groove;margin-left: 14px;"></div>
              <h4><a href="#">头像</a></h4>
            </div>
            <div class="col-xs-6 col-sm-6 placeholder">
            	<table class="table-userinfo">
            		<!--1行-->
            		<tr>
            			<th style="width: 100px;"><h4>用户名：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.uname}</h4></th>
            			<th><a href="#"><h4>修改</h4></a></th>
            		</tr>
            		<!--1行-->
            		<tr>
            			<th style="width: 100px;"><h4>用户ID：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.userid}</h4></th>
            			<th><a href="#"><h4>修改</h4></a></th>
            		</tr>
            		<!--1行-->
            		<tr>
            			<th style="width: 100px;"><h4>性别：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.sex}</h4></th>
            			<th><a href="#"><h4>修改</h4></a></th>
            		</tr>
            		<!--2行-->
            		<tr>
            			<th style="width: 100px;"><h4>邮箱地址：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.uemail}</h4></th>
            			<th><a href="#"><h4>修改</h4></a></th>
            		</tr>
            		<!--3行-->
            		<tr>
            			<th style="width: 100px;"><h4>状态：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.state}</h4></th>
            			<th><a href="#"><h4>修改</h4></a></th>
            		</tr>
            		<!--4行-->
            		<tr>
            			<th style="width: 100px;"><h4>积分：</h4></th>
            			<th style="width: 250px;"><h4>${sessionScope.User.repoints}</h4></th>
            			<th><a href="#"><h4>获取</h4></a></th>            			
            		</tr>
              </table>
            </div>
          </div>

          <h2 class="sub-header">垃圾投放地址</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>编号</th>
                  <th>省份</th>
                  <th>城市</th>
                  <th>详细地址</th>
                  <th>联系电话</th>
                  <th><a href="#">增加地址</a></th>
                </tr>
              </thead>
              <tbody>
              <!-- 循环显示列表 -->
              <c:forEach var="ads" items="${sessionScope.Adress}">
	                <tr>
	                  <td>${ads.number}</td>
	                  <td>${ads.province}</td>
	                  <td>${ads.city}</td>
	                  <td>${ads.detail}</td>
	                  <td>${ads.phonenumber}</td>
	                  <td><a href="#">修改</a></td>
	                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
          <h2 class="sub-header">参与过的志愿活动</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>活动名</th>
                  <th>活动时间</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>和颜老师一起扔垃圾！</td>
                  <td>2019/7/20</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
