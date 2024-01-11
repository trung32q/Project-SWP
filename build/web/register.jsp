<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Form</title>
    <link rel="stylesheet" href="css/styleRegister.css">
    <script defer src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
            integrity="sha384-rOA1PnstxnOBLzCLMcre8ybwbTmemjzdNlILg8O7z1lUkLXozs4DHonlDtnE7fpc"
            crossorigin="anonymous"></script>
</head>
<script>
    function validateEmail() {
        var emailInput = document.getElementById("emailInput").value;
        var emailRegex = /^.{2}@fe\.edu\.vn$/;

        if (emailRegex.test(emailInput)) {
            alert("Email is valid");
        } else {
            alert("Invalid email format. Please use __@fe.edu.vn");
            return false; // Prevent form submission
        }
    }
</script>
<body>
    
    <div class="login-box">
        <h2>Register</h2>
        <div class="social-container">
            <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
            <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>      
        </div>
        <span>or register your new account</span>
        <form action="confirmcaptcha" method="GET" onsubmit="return validateEmail()">
            <div class="user-box">
                <input type="text" id="emailInput" name="email" required="">
                <label>Email</label>
            </div>

            <div class="user-box">
                <input type="text" name="username" required="">
                <label>Username</label>
            </div>

            <div class="user-box">
                <input type="password" name="password" required="">
                <label>Password</label>
            </div>

            <div class="user-box">
                <input type="password" name="re_password" required="">
                <label>Re-Enter Password</label>
            </div>

            <div class="button-submit">
                <button type="submit">Submit</button>
         
            </div>
        </form>
        <div class="form-switch" id="formSwitch">
            Have an account? <a href="login.html"> Sign up here</a>
        </div>
    </div>
</body>
</html>
