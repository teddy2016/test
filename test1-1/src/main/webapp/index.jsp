<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>test</title>
<!-- <meta http-equiv="refresh" content="0;url=${pageContext.request.contextPath}/main/index.do"> -->
</head>
<body>
<script type="text/javascript">
window.onload = function(){ 
	location.href = "${pageContext.request.contextPath}/main/index.do";
	return;
}
</script>
</body>
</html>
