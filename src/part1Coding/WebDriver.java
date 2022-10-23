package part1Coding;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenShot extends WebDriver{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver{


    @Override
    public void open() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close the Google Chrome");
    }

    @Override
    public String getTitle() {
        String title="Google";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("navigate in Google Chrome");
    }
}
class FireFox implements  RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open FX");
    }

    @Override
    public void close() {
        System.out.println("Close FX");
    }

    @Override
    public String getTitle() {
        String title="Fire Fox";
        return title;

           }

    @Override
    public void navigate() {
        System.out.println("Navigate FX");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        String title="Safari Browser";
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari");
    }
}
class DriverTester{
    public static void main(String[] args) {
        RemoteWebDriver [] driver={new ChromeDriver(),new FireFox(),new SafariDriver()};
        for (int i=0;i< driver.length;i++){
            driver[i].open();
            driver[i].close();
            driver[i].navigate();
            System.out.println(driver[i].getTitle());
        }

    }
}