<#assign base="${request.contextPath}">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>机构下所有用户(一对多演示)</title>
</head>


<body>

<#if organList?? && (organList?size>0)>
    <#list organList as entity>
        机构名称：${entity.jgmc}  &nbsp;&nbsp;
        创建时间：${entity.cjsj?date}  &nbsp;&nbsp;
        所有用户：
        <#if entity.userList?? && (entity.userList?size>0)>
            <#list entity.userList as user>
                &nbsp;&nbsp; ${user.login_name}
            </#list>
        </#if>
        <BR><BR>
    </#list>
</#if>



</body>

</html>