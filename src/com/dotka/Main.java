package com.dotka;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileDownloader.download("https://stooq.pl/q/d/l/?s=msft.us&i=d", "msft.csv");
        FileDownloader.download("https://stooq.pl/q/d/l/?s=goog.us&i=d", "goog.csv");
        FileDownloader.download("https://stooq.pl/q/d/l/?s=ibm.us&i=d", "ibm.csv");

        RateCalculator.recalculateRates("msft.csv");
        RateCalculator.recalculateRates("goog.csv");
        RateCalculator.recalculateRates("ibm.csv");

    }


}
