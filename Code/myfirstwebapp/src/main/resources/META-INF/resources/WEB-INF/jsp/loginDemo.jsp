<html>
  <head>
    <title>Login Demo Page</title>
  </head>
  <body>
    <form>      
      <div>
        <table>
          <tr>
            <td cols pan="2" align="center">
              <h1>Welcome to login demo</h1>
            </td>
          </tr>
          <tr>
            <td>
              <label for="userName">User Name:</label>
            </td>
            <td>
              <input type="text" name="userName" value="${name}" />
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
            <td align="right">
              <button type="submit" name="login" title="Login">Login</button>
              <button type="reset" name="cancel" title="Cancel">Cancel</button>
            </td>
          </tr>
        </table>
      </div>
    </form>
  </body>
</html>