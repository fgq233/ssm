<#assign base="${request.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>用户详情</title>

</head>


<body>


    <h2>编号：${user.id!}</h2>
    <h2>姓名：${user.login_name!}</h2>
    <h2>密码：${user.login_pwd!}</h2>
    <h2>机构：${user.default_organ_id}</h2>
    <h2>日期：${user.cjsj?date}</h2>



</body>

</html>