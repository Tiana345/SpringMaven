<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<html>
<head>
	<title>Home</title>
</head>
<body>
<%@ include file="Header.jsp" %>
<div>

 <img src="<c:url value="../images/cuisine.jpg" />" />
 
</div>

<article aria-label="notification" id="privacyNotification" class="privacy-notification">
    <div class="privacy-notification__div">
        <img alt="Allrecipes" class="privacy-notification__logo" height="36" src="https://secureimages.allrecipes.com/ar-images/ARlogo.svg" width="96">
        <p class="privacy-notification__p">
            Welcome! To bring you the best content on our sites and applications, Meredith partners with third party advertisers to serve digital ads, including personalized digital ads. Those advertisers use tracking technologies to collect information about your activity on our sites and applications and across the Internet and your other apps and devices.
            <br /><br />
            You always have the choice to experience our sites without personalized advertising based on your web browsing activity by visiting the <a href="http://optout.aboutads.info/?c=2#!/" target="_blank">DAA's Consumer Choice page</a>, the <a href="http://optout.networkadvertising.org/?c=1#!/" target="_blank">NAI's website</a>, and/or the <a href="http://www.youronlinechoices.com/" target="_blank">EU online choices page</a>, from each of your browsers or devices. To avoid personalized advertising based on your mobile app activity, you can install the <a href="http://www.aboutads.info/appchoices" target="_blank">DAA's AppChoices app here</a>. You can find much more information about your privacy choices in <a href="http://www.meredith.com/legal/eu-privacy" target="_blank">our privacy policy</a>. Even if you choose not to have your activity tracked by third parties for advertising services, you will still see non-personalized ads on our sites and applications.
            <br /><br />
            By clicking continue below and using our sites or applications, you agree that we and our third party advertisers can:
        </p>
        <ul class="privacy-notification__ul">
            <li>transfer your data to the United States or other countries; and</li>
            <li>process and share your data so that we and third parties may serve you with personalized ads, subject to your choices as described above and in <a href="http://www.meredith.com/legal/eu-privacy" target="_blank">our privacy policy</a>.</li>
        </ul>
        <div class="privacy-notification__footer">
            <a href="" onclick="closeAndViewSite()" class="btns-one-small continue">Continue</a>
        </div>
        
        <a id="privacy-notification_dsar" class="dsar-link" href="" target="_blank" rel="noopener">EU Data Subject Requests</a>

    </div>
</article>
</body>


</html>