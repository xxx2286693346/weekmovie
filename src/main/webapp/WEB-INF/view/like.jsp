<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
<form action="/likelist" method="post">
	 <table class="table">
		<tr>
			<td>
				影片名称<input type="text" name="mname" >
			</td>
			<td>
				上映时间<input type="text" name="time">
				至
				<input type="text" name="time2">
			</td>
		</tr>
		<tr>
			<td>
				导演<input type="text" name="dao">
			</td>
			<td>
				价格<input type="text" name="price" placeholder="最低价" >-
				<input type="text" name="price2" placeholder="最高价">
			</td>
		</tr>
		<tr>
			<td>
				年代<input type="text" name="nd">
			</td>
			<td>
				电影时长<input type="text" name="longtime" placeholder="最短时间">-
				<input type="text" name="longtime2" placeholder="最长时间">
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" value="查询影片" onclick="li()">
				<input type="button" value="重置影片" onclick="cz()">
			</td>
		</tr>
	</table>
	</form>
</body>
<script type="text/javascript">

	/* function li(){
		var mname=$("[name='mname']").val();
		var time=$("[name='time']").val();
		var time2=$("[name='time2']").val();
		var dao=$("[name='dao']").val();
		var price=$("[name='price']").val();
		var price2=$("[name='price2']").val();
		var nd=$("#se:checked").val();
		var longtime=$("[name='longtime']").val();
		var longtime2=$("[name='longtime2']").val();
		 $.get(
			"/likelist",
			{
				"mname":mname,
				"time":time,
				"time2":time2,
				"dao":dao,
				"price":price,
				"price2":price2,
				"nd":nd,
				"longtime":longtime,
				"longtime2":longtime
			},
			function(obj){
				if(obj>0){
					alert("查询成功")
					location.href="listli";
				}else{
					alert("查询失败")
					location.href="listli";
				}
			}
		) 
	} */


	function cz(){
		location.reload();
	}
</script>
</html>