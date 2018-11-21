package com.dotka;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class RateCalculator {

    public static void recalculateRates(String fileName) throws IOException {

        BufferedWriter bw = null;
        try {
            File inFile = new File("./src/com/dotka/csv/" + fileName);
            File myFile = new File("./src/com/dotka/csv/" + "Changed" + fileName);
            FileWriter fileWriter = new FileWriter(myFile);
            bw = new BufferedWriter(fileWriter);
            Scanner scanner = new Scanner(inFile);
            final String lineSep = System.getProperty("line.separator");


            scanner.nextLine();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] elems = line.split(",");
                double openPrice = Double.parseDouble(elems[1]);
                double closePrice = Double.parseDouble(elems[4]);
                System.out.println(Arrays.toString(elems));
                System.out.println(openPrice);
                System.out.println(closePrice);
                System.out.println((closePrice - openPrice) / openPrice);
                String change = String.valueOf((closePrice - openPrice) / openPrice);
                bw.write(line + "," + change + lineSep);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            if (bw != null)
                bw.close();
        }

    }
}
