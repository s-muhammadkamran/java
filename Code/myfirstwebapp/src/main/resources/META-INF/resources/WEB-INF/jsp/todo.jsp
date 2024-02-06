<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>Add Todo Page</title>
  </head>
  <body>
    <div class="container">
        <h1>Enter Todo Details</h1>
        <frm:form method="post" modelAttribute="todo">
            <frm:input type="hidden" path="id" />
            <frm:input type="hidden" path="userName" />
            <frm:input type="hidden" path="isDone" />
            Description: <frm:input type="text" path="description" required="required"/>
            <!--Target Date: < />
            Is Done: < />-->
            <button class="btn btn-primary" type="submit" name="save" title="Save">Save</button>
        </frm:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>