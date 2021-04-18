package com.class28.Task1;

public interface WebDriver {
        void openBrowser();
        void closedBrowser();
        void maximizeBrowser();
        void findElements();
    }
    class  chromeDriver implements  WebDriver {
        @Override
        public void openBrowser() {
            System.out.println("chrome open browser");
        }
        @Override
        public void closedBrowser() {
            System.out.println("chrome closed browser");
        }
        @Override
        public void maximizeBrowser() {
            System.out.println("chrome maximize browser");
        }
        @Override
        public void findElements() {
            System.out.println("chrome find elements in  browser");
        }
    }
    class firefoxDriver implements WebDriver {
        @Override
        public void openBrowser() {
            System.out.println("firefoxDriver open browser");
        }
        @Override
        public void closedBrowser() {
            System.out.println("firefoxDriver closed browser");
        }
        @Override
        public void maximizeBrowser() {
            System.out.println("firefoxDriver maximize browser");
        }
        @Override
        public void findElements() {
            System.out.println("firefox find elements in  browser");
        }
    }
    class webdriverTester{
        public static void main(String[] args) {
            WebDriver[ ]driver= {new chromeDriver(),new firefoxDriver()};
            for (WebDriver drivers:driver
            ) {
                drivers.closedBrowser();
                drivers.openBrowser();
                drivers.maximizeBrowser();
                drivers.findElements();
            }
        }
    }
