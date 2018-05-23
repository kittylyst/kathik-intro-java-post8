package kathik;

// https://developer.worldweatheronline.com/api/historical-weather-api.aspx

public final class Main {

    public final String url = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?q=53.236410,-9.725218&date=2018-01-01&enddate=2018-01-31&tp=24&format=csv&key=54a4f43fc39c435fa2c143536183004";

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        // 1. Setup a modular build for the application, using a module-info.java to build a single app module

        // 2. Take the existing code and port to use the new HTTP/2 API provided in (version 10) in an incubator
        // module and remove the dependency on AsynchHTTPClient

        // NOTE: Maven support for post-8 is still developing. You will need to upgrade to at least 3.5.0 and
        // ideally to latest Maven point release. Not all plugins are fully supported with post-8 yet.

        // Alternatively, Gradle is doing somewhat better these days - but still lacks full support
    }
}
