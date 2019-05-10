/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 *
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Car car;
    public static void main(String[] args) throws Exception {
        String s;
        while (!(s = in.readLine()).equals("-1")) {
            double distance = Double.valueOf(s);
            st = new StringTokenizer(in.readLine());
            
            car =new Car(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));
            int nGasStation=Integer.valueOf(st.nextToken());
            GasStation[] gasStations=new GasStation[nGasStation];
            for (int i = 0; i < nGasStation; i++) {
                st=new StringTokenizer(in.readLine());
                gasStations[i]=new GasStation(Double.valueOf(st.nextToken()), Double.valueOf(st.nextToken()));
            }
            for (int i = 0; i < Math.pow(2,nGasStation); i++) {
                
            }
        }
    }
}

class Car {

    double tank;
    double costFull;
    double milesPerGallon;
    double totalCost;

    public Car(double tank, double milesPerGallon, double costFull) {
        this.tank = tank;
        this.costFull = costFull;
        this.milesPerGallon = milesPerGallon;
        totalCost=0;
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
