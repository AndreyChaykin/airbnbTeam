<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/indexpage/shift.css" rel="stylesheet">
    <link rel="stylesheet" href="css/indexpage/bootstrap.css">
    <link rel="stylesheet" href="css/indexpage/style.css">
    <link rel="stylesheet" href="css/indexpage/popup.css">
    <link rel="stylesheet" href="css/indexpage/searchbox.css">
</head>

<body>
<div class="nav">
    <div class="container">
        <div class="logo">
        </div>
        <%--<ul class="pull-left">--%>
        <%--<li><a href="#">Name</a></li>--%>
        <%--<li><a href="#">Browse</a></li>--%>
        <%--</ul>--%>
        <ul class="pull-right">
            <li><a href="#">Become Host</a></li>
            <li><a href="#signup">Sign Up</a></li>
            <li><a href="#autorization">Log In</a></li>
            <li><a href="#">Help</a></li>
        </ul>
    </div>
</div>

<a href="#x" class="overlay" id="signup"></a>

<div class="popup">
    <form method="post" action="/main" class="signup">
        <p>
            <label for="login">Login</label>
            <input type="text" name="login" id="login" value="login">
        </p>

        <p>
            <label for="password">Password</label>
            <input type="password" name="password" id="password" value="password">
        </p>

        <p class="login-submit">
            <button type="submit" class="login-button">Entry</button>
        </p>

        <p class="forgot-password"><a href="index.html">Forgot password?</a></p>
    </form>
    <a class="close" title="Close" href="#close"></a>
</div>

<a href="#x" class="overlay" id="autorization"></a>

<div class="popup">
    <form method="post" action="/main" class="login">
        <p>
            <label for="log">Login</label>
            <input type="text" name="login" id="log" value="name@example.com">
        </p>

        <p>
            <label for="pass">Password</label>
            <input type="password" name="password" id="pass" value="4815162342">
        </p>

        <p class="login-submit">
            <button type="submit" class="login-button">Entry</button>
        </p>

        <%--<p class="forgot-password"><a href="index.html">Forgot password?</a></p>--%>
    </form>
    <a class="close" title="Close" href="#close"></a>
</div>

<div class="jumbotron">
    <div class="container">
        <h1>Find a place to stay.</h1>

        <p>Rent from people in over 34,000 cities and 192 countries.</p>
        <a href="#">Learn More</a>
    </div>
</div>
<div style="background-color: rgba(17, 13, 16, 0.22); padding: 2px">
<form class="form-wrapper cf">
    <input type="text" placeholder="City" required>
    <input type="text" placeholder="DataIn" required>
    <input type="text" placeholder="DataOUT" required>
    <button type="submit">Search</button>
</form>
</div>
<div class="neighborhood-guides">
    <div class="container">
        <h2>Neighborhood Guides</h2>

        <p>Not sure where to stay? We've created neighborhood guides for cities all around the world.'</p>

        <div class="row">
            <div class="col-md-4">
                <div class="thumbnail">
                    <h2>Kiev</h2>
                    <a href="google.com.ua"><img src="images/kiev.jpg"></a>
                </div>
                <div class="thumbnail">
                    <h2>Stockholm</h2>
                    <img src="images/stockholm.jpg">
                </div>
            </div>

            <div class="col-md-4">
                <div class="thumbnail">
                    <h2>New-York</h2>
                    <img src="images/newyork.jpg">
                </div>
                <div class="thumbnail">
                    <h2>Miami</h2>
                    <img src="images/miami.jpg">
                </div>
            </div>

            <div class="col-md-4">
                <div class="thumbnail">
                    <%--<img src="http://goo.gl/0Kd7UO">--%>
                    <img src="images/invite.png">
                </div>
            </div>
        </div>
    </div>
</div>

<div class="learn-more">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h3>Travel</h3>

                <p>From apartments and rooms to treehouses and boats: stay in unique spaces in 192 countries.</p>

                <p><a href="#">See how to travel on Airbnb</a></p>
            </div>
            <div class="col-md-4">
                <h3>Host</h3>

                <p>Renting out your unused space could pay your bills or fund your next vacation.</p>

                <p><a href="#">Learn more about hosting</a></p>
            </div>
            <div class="col-md-4">
                <h3>Trust and Safety</h3>

                <p>From Verified ID to our worldwide customer support team, we've got your back.</p>

                <p><a href="#">Learn about trust at Airbnb</a></p>
            </div>
        </div>
    </div>
</div>
<footer class="footer-distributed">

    <div class="footer-left">

        <h3>GoIT<span>Info</span></h3>

        <p class="footer-links">
            <a href="http://www.goit.ua">GoITHome</a>
            ·
            <a href="http://www.goit.ua/category/events/">GoEvents</a>
            ·
            <a href="http://goit.ua/contacts.html">Contact</a>
            ·
            <a href="#">About</a>
            ·
            <a href="#">Faq</a>
            ·
            <a href="#">Contact</a>
        </p>

        <p class="footer-company-name">GoIT 2016</p>
    </div>

    <div class="footer-center">

        <div>
            <i class="fa fa-map-marker"></i>

            <p><span>22 Rybalska str.</span> Kiev, Ukraine</p>
        </div>

        <div>
            <i class="fa fa-phone"></i>

            <p>+38 093 9865586</p>
        </div>

        <div>
            <i class="fa fa-envelope"></i>

            <p><a href="mailto:info@goit.com.ua">info@goit.com.ua</a></p>
        </div>

    </div>

    <div class="footer-right">

        <p class="footer-company-about">
            <span>Join us on</span>
        </p>

        <div class="footer-icons">

            <a href="https://www.facebook.com/goITclub/?fref=nf"><i class="fa fa-facebook-square"></i></a>
            <%--<a href="https://twitter.com/mauriliobsfilho"><i class="fa fa-twitter"></i></a>--%>
            <%--<a href="https://br.linkedin.com/in/andriy.chayikin"><i class="fa fa-linkedin"></i></a>--%>
            <a href="https://github.com/baygoit/GoJava"><i class="fa fa-github"></i></a>

        </div>

    </div>

</footer>
</body>
</html>