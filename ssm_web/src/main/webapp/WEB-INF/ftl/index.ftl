<#include "base.ftl">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>主页面</title>
    <script type="text/javascript" src="${base}/medias/js/jquery-1.8.3.js"></script>

    <script>
        $(function () {
            // alert("主页面");
        })
    </script>
</head>


<body>

    <h3><a href="${base}/user/addUserPage">1、新增用户</a></h3>

    <h3><a href="${base}/user/deleteUser?id=2">2、删除用户</a></h3>

    <h3><a href="${base}/user/updateUser?id=3&login_name=刘亦菲">3、更新用户</a></h3>

    <h3><a href="${base}/user/findUserByName?userName=刘亦菲">4、基本查询</a></h3>

    <h3><a href="${base}/user/findUserLikeName?userName=g">5、模糊查询</a></h3>

    <h3><a href="${base}/user/getUserByIds1">6、集合查询1</a></h3>

    <h3><a href="${base}/user/getUserByIds2">7、集合查询2</a></h3>

    <BR>
    <h3><a href="${base}/user/getUsers">8、一对一</a></h3>

    <h3><a href="${base}/user/getOrganUsers">9、一对多</a></h3>


</body>

</html>