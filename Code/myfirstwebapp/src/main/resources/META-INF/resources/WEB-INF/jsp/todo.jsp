<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>Add Todo Page</title>
  </head>
  <body>
    <div class="container">
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">
            <form:input type="hidden" path="id" />
            <form:input type="hidden" path="userName" />
            <form:input type="hidden" path="isDone" />
            Description: <form:input type="text" path="description" required="required"/>
            <!--Target Date: < />
            Is Done: < />-->
            <input class="btn btn-success" type="submit" />
        </form:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>