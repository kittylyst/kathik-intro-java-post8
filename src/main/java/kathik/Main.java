package kathik;

// https://developer.worldweatheronline.com/api/historical-weather-api.aspx

public final class Main {

    public final String url = "http://api.worldweatheronline.com/premium/v1/past-weather.ashx?q=53.236410,-9.725218&date=2018-01-01&enddate=2018-01-31&tp=24&format=csv&key=54a4f43fc39c435fa2c143536183004";

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        // To get a sequence of temperatures we must parse the CSV according to the following rules:
        // 1.	ignore lines starting with # that correspond to comments;
        // 2.	filter alternate lines
        // 3.	extract the third value corresponding to temperature in Celsius;
        // 4.	convert to int

        // Use the stream API to calculate:

        //   (i) Average temp over a month

        //   (ii) Average windspeed over a month.

        // A. Build test cases using the provided CSV file

        // B. Use the live URL provided, and the Asynch HTTP client mentioned in the POM file, to get live data
        // E.g. the asyncHttpClient() method

        // C. Customize to a location (& time period of interest)

        // D. Extend to a 1-degree x 1-degree area, rather than a single point.

        //   (i) How fine a grid will the data support?

        //   (ii) Design an efficient parallel approach - does this improve the calculation?
    }
}
