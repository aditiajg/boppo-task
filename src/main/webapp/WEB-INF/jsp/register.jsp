<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
</head>
<body>
    <div> 
        <h2>User Registration</h2>
        <form action="registration" method="post" name="registrtion_form"> 
            <table>
                <tr>
                    <td>
                        <label for="first_name">First Name:</label>
                    </td>
                    <td>
                        <input type="text" name="first_name" id="first_name" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="last_name">Last Name:</label>
                    </td>
                    <td>
                        <input type="text" name="last_name" id="last_name"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="email_id">Email ID:</label>
                    </td>
                    <td>
                        <input type="email" name="email_id" id="email_id"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="password">Password:</label>
                    </td>
                    <td>
                        <input type="password" name="password" id="password"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="confirm_password">Confirm Password:</label>
                    </td>
                    <td>
                        <input type="password" name="confirm_password" id="confirm_password"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="employee_id">Employee ID:</label>
                    </td>
                    <td>
                        <input type="text" name="employee_id" id="employee_id"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="organization_name">Organization Name:</label>
                    </td>
                    <td>
                        <input type="text" name="organization_name" id="organization_name"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <button type="submit">Register</button>
                    </td>
                    <td>
                        <button type="reset">Reset</button>
                    </td>
                </tr>
            </table>
        </form>
    </div> 
</body>
</html>