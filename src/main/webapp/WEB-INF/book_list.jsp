<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/19 0019
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-6 column" style="margin-top: 20px">
            <select >
                <option>计算机类</option>
            </select>
        </div>
        <div class="col-md-6 column" style="margin-top: 20px">
            <button type="button" class="btn btn-default">新增电子图书</button>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>
                        图书编号
                    </th>
                    <th>
                        图书名称
                    </th>
                    <th>
                        图书摘要
                    </th>
                    <th>
                        上传人
                    </th>
                    <th>
                        上传时间
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pageInfo.list}" var="item">
                    <tr class="success">
                        <td style="width:20%;">
                                ${item.name }
                        </td>
                        <td>
                                ${item.price }
                        </td>
                        <td>
                            <fmt:formatDate value="${item.productionDate}" pattern="yyyy-MM-dd"/>

                        </td>
                        <td style="width:40%;">${item.description }</td>
                        <td>
                            <img src="${item.pic }" style="width:80px;height:80px;" />
                        </td>
                        <td>
                            <button type="button" class="btn btn-warning" onclick="location.href = '${pageContext.request.contextPath}/item/update-ui?id=${item.id }'">修改</button>
                            <button type="button" class="btn btn-warning" onclick="del(${item.id},this)">删除</button>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <ul class="pagination">
                <li>
                    <a href="#">首页</a>
                </li>
                <li>
                    <a href="#">下一页</a>
                </li>
                <li>
                    <a href="#">上一页</a>
                </li>
                <li>
                    <a href="#">尾页</a>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
