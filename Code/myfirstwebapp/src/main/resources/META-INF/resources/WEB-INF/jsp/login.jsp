<!DOCTYPE html>
<html>
  <head>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
    <title>Login Page</title>
  </head>
  <body>
    <div class="container">
        <form name="loginForm" method="post" class="form">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">
                            <h1>Welcome to login</h1>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <label for="userName">User Name:</label>
                        </td>
                        <td>
                            <input type="text" name="userName" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="password">Password:</label>
                        </td>
                        <td>
                            <input type="password" name="password" />
                        </td
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button class="btn btn-primary" type="submit" name="login" title="Login">Login</button>
                            <button class="btn btn-warning" type="cancel" name="cancel" title="Cancel">Cancel</button>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" align="left">
                            <pre>${loginError}</pre>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>