<#assign base="${request.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>用户列表</title>
</head>


<body>

    <#if userList?? && (userList?size>0)>
        <#list userList as user>
            ${user.login_name!''} &nbsp; ${user.organ.jgmc!''}<BR>
        </#list>
    </#if>


</body>

</html>