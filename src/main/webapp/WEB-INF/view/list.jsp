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
<input type="button" value="查询影片" onclick="like()">
<input type="button" value="添加影片"> 
<input type="button" value="删除影片" onclick="dele()">  
<form action="list" method="post">
	<input type="hidden" name="zd" value="${zd}">
	<input type="hidden" name="zhi" value="${zhi}">
</form>
	<table class="table">
		<tr>
			<td>
			<input type="button" value="反选" onclick="fx()">
				<input type="checkbox" name="cc" onclick="qx()">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间
				<input type="button" value="^" onclick="orby('time')">
			</td>
			<td>时长
				<input type="button" value="^" onclick="orby('longtime')">
			</td>
			<td>类型</td>
			<td>年代
				<input type="button" value="^" onclick="orby('nd')">
			</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${moList}" var="s">
			<tr>
				<td>
				<input type="checkbox" name="ck" value="${s.id}">
				</td>
				<td>${s.mname}</td>
				<td>${s.dao}</td>
				<td>${s.price}</td>
				<td>
				${s.time}
				</td>
				<td>${s.longtime}</td>
				<td>${s.lx}</td>
				<td>${s.nd}</td>
				<td>${s.qy}</td>
				<td>${s.zt}</td>
				<td id="ii">
				<input type="button" name="nn" value="详情">
					<input type="button" name="xx" id="${s.id}" value="下架" onclick="xj(${s.id})">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				当前是第${info.pageNum}页/共${info.pages}页  共${info.total}条数据
				<input type="button" value="首页" onclick="page(1)">
				<input type="button" value="上一页" onclick="page(${info.prePage})">
				<input type="button" value="下一页" onclick="page(${info.nextPage})">
				<input type="button" value="尾页" onclick="page(${info.pages})">
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function page(pageNum){
		location.href="/list?pageNum="+pageNum;
	}
	
	function qx(){
		var ch= document.getElementsByName("ck");
		for ( var i=0 in ch) {
			ch[i].checked=true;
		}
	}
	
	function fx(){
		var ch= document.getElementsByName("ck");
		for ( var i=0 in ch) {
			ch[i].checked=!ch[i].checked
		}
	} 
	
	function dele(){
		var zhi= $("[name='ck']:checked").map(function(){
			return this.value;
		}).get().join();
		
		alert(zhi)
		if(confirm("确定删除值为"+zhi+"的数据吗")){
			$.post(
				"/dele",
				{"zhi":zhi},
				function(obj){
					if(obj){
						alert("删除成功")
						location.href="list";
					}else{
						alert("删除失败")
						location.href="list";
					}
				}
			)
		}else{
			location.reload();
		}
	}
	
	
	function like(){
		location.href="like";
	}
	
	
	function orby(zd){
		$("[name='zd']").val(zd);
		var zhi= $("[name='zhi']").val();
		if(zhi=='asc'){
			$("[name='zhi']").val("desc");
		}else if(zhi=='desc'){
			$("[name='zhi']").val("asc");
		}
		page(1);
		$("form").submit();
	}
	
	
	function xj(id){
		//alert(id)
		var name=$("[name='xx']").val();
		var name1="上架";
		var name2="下架";
		if(name==name2){
			
			$("#"+id+"").remove();
			$("[name='nn']").after("<input type='button' name='xx' id="+id+" value="+name1+" onclick='xj("+id+")''>")
		}
		/* if(name==name1){
			var name= $("#"+id+"").val("下架");
			name2+=name;
			alert(name2)
			location.href="/xj?id="+id;
			var name1="";
		} */
	}
</script>
</html>