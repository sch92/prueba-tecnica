<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Goldeneye</title>
    <link rel="stylesheet" href="/style/main.css">
    <script src="/script/main.js" defer></script>
    <script src="/script/departments.js"></script>
    <script src="/script/offices.js"></script>
</head>

<body>
    <div>
        <h1>Goldeneye</h1>
        <#if user??>
            <br>
            <h2>Your email is: </h2><br>
            <#assign email>${user.getEmail()}</#assign>
            <h3>${email}</h3>
        <#else>
        <h2>Email Form</h3>
        <form action="/email" name="form" method="post">
            <label for="name"> Name: </label>
            <input type="text" name="name" required/>
            <label for="surname">Surname: </label>
            <input type="text" name="surname" required/>
            <label for="office">Office Location</label>
            <select id="office" name="office" required>
                <option value="" disabled selected>Select your office location</option>
            </select>
            <label for="department">Department</label>
            <select id="department" name="department" required>
                <option value="" disabled selected>Select your department</option>
            </select>
            <p>
                <input type="submit" value="Submit" /> <input type="reset" value="Reset" />
            </p>
        </form>
        </#if>
    </div>

</body>

</html>