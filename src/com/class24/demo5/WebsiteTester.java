package com.class24.demo5;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new FireFox();
        webDriver.openWebsite();
        webDriver.sighnupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.closenWebsite();


        WebDriver[] webDriverArray={new GoogleChrome(),new FireFox()};
        for(WebDriver webdriver:webDriverArray){

            webDriver.openWebsite();
            webDriver.sighnupWebsite();
            webDriver.downloadAFileFromWebsite();
            webDriver.closenWebsite();

        }
        /*
        FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.sighnupWebsite();
        fireFox.downloadAFileFromWebsite();
        fireFox.closenWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.sighnupWebsite();
        googleChrome.downloadAFileFromWebsite();
        googleChrome.closenWebsite();
*/
    }
}
