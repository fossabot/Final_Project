<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<script type='text/javascript'> 
		window.parent.CKEDITOR.tools.callFunction('${CKEditorFuncNum}', '${file_path}', '파일 전송 완료.'); 
	</script>
</body>
</html>