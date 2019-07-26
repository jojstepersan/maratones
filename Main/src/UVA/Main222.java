/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan 222 - Budget Travel
 *
 */
public class Main222 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static double cost = 0;
    static double minCost ;
    static DecimalFormat df = new DecimalFormat("#.##");
    static int x=1;

    public static void main(String[] args) throws Exception {
        String s;
        Locale.setDefault(Locale.US);
        while (!(s = in.readLine()).equals("-1")) {
            minCost = Double.MAX_VALUE;
            double distance = Double.valueOf(s);
            st = new StringTokenizer(in.readLine());
            Car car = new Car(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));

            int nGasStation = Integer.valueOf(st.nextToken());
            GasStation[] gasStations = new GasStation[nGasStation];
            for (int i = 0; i < nGasStation; i++) {
                st = new StringTokenizer(in.readLine());
                gasStations[i] = new GasStation(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));
            }
            for (int i = 0; i < Math.pow(2, nGasStation); i++) {
                cost = car.costFull;
                car.distance = distance;
                boolean arrive;
                String bin = Integer.toBinaryString(i);
                double lastDistance = 0;
                for (int j = 0; j < bin.length(); j++) {
                    char c = bin.charAt(bin.length()-j-1);
                    if (c == '1') {
                        GasStation gs = gasStations[j];
                        double distanceCapacity =car.tank * car.milesPerGallon;
                        if (distanceCapacity > gs.distance) {
                            cost += 2;
                            double currentCost=(gs.distance/car.milesPerGallon)*gs.costPerGallon;
                            currentCost=currentCost/100;
                            cost+=currentCost;
                            car.distance-=gs.distance-lastDistance;
                            lastDistance=gs.distance;
                        } else {
                            break;
                        }
                    }
                }
                car.distance -= car.milesPerGallon * car.tank;
                arrive = car.distance <= 0;
                if (arrive) {
                    minCost = Math.min(minCost, cost);
                }
            }
            String result=df.format(minCost);
            result=result.replace(",", ".");
            System.out.printf("Data Set #%d\n",x++);
            System.out.printf("minimum cost = $%s\n",result);
           
        }
    }
}

class Car {

    double costFull;
    double milesPerGallon;
    double totalCost;
    double tank;
    double distance;

    public Car(double tank, double milesPerGallon, double costFull) {
        this.tank = tank;
        this.costFull = costFull;
        this.milesPerGallon = milesPerGallon;
        totalCost = 0;
    }

}

class GasStation {

    double distance;
    double costPerGallon;

    public GasStation(double distance, double costPeerGallon) {
        this.distance = distance;
        this.costPerGallon = costPeerGallon;
    }

}
/*
475.6
11.9 27.4 14.98 6
102.0 99.9
220.0 132.9
256.3 147.9
275.0 102.9
277.6 112.9
381.8 100.9
516.3
15.7 22.1 20.87 3
125.4 125.9
297.9 112.9
345.2 99.9
-1

 */
