<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/19 0019
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>图书添加页面</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form">
                <div class="form-group">
                    <label for="booKname"></label>
                    <trans>
                        图书名称
                    </trans><input type="text" class="form-control" id="booKname" />
                </div>
                <div class="form-group">
                    <label for="summary"></label>
                    <trans>
                        图书摘要
                    </trans>
                    <input type="text" class="form-control" id="summary" />
                </div>
                <div class="form-group">
                    <label for="uploaduser"></label>
                    <trans>
                        上传人
                    </trans>
                    <input type="text" class="form-control" id="uploaduser" />
                </div>
                <div class="form-group">
                    <label for="createdate"></label>
                    <trans>
                        上传时间
                    </trans>
                    <input type="datetime-local" class="form-control" id="createdate" />
                </div>
                <div>
                    <button >提交</button>
                    <button >返回</button>
                </div>


            </form>
        </div>
    </div>
</div>
</body>
</html>
