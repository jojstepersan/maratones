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
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan 222 - Budget Travel
 *
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Car car;
    static double cost = 0;
    static double minCost = Double.MAX_VALUE;
    static DecimalFormat df = new DecimalFormat("#.#");

    public static void main(String[] args) throws Exception {
        String s;
        while (!(s = in.readLine()).equals("-1")) {
            double distance = Double.valueOf(s);
            st = new StringTokenizer(in.readLine());

            car = new Car(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));
            int nGasStation = Integer.valueOf(st.nextToken());
            GasStation[] gasStations = new GasStation[nGasStation];
            for (int i = 0; i < nGasStation; i++) {
                st = new StringTokenizer(in.readLine());
                gasStations[i] = new GasStation(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));
            }
            for (int i = 0; i < Math.pow(2, nGasStation); i++) {
                cost = car.costFull;
                boolean arrive=false;
                String bin = Integer.toBinaryString(i);
                for (int j = 0; j < bin.length(); j++) {
                    char c = bin.charAt(j);
                    if (c == 1) {
                        GasStation gs = gasStations[j];
                        double mpg = Double.valueOf(df.format(gs.distance / car.milesPerGallon));
                        if (car.tank > mpg) {
                            cost += 2;
                            double gsCost=mpg*gs.costPerGallon;
                            gsCost/=100;
                            gsCost=Double.valueOf(df.format(gsCost));
                            cost+=gsCost;
                        }
                    }
                }
                if(arrive)
                    minCost = Math.min(minCost, cost);
            }
            System.out.println(minCost);
        }
    }
}

class Car {

    double tankFull;
    double costFull;
    double milesPerGallon;
    double totalCost;
    double tank;

    public Car(double tank, double milesPerGallon, double costFull) {
        this.tankFull = tank;
        this.costFull = costFull;
        this.milesPerGallon = milesPerGallon;
        totalCost = 0;
        this.tank = tankFull;
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