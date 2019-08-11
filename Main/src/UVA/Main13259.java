/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jojstepersan
 * 13259 - Soccer Championship
 */
public class Main13259 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int X;
    
    public static void main(String[] args) throws Exception {
        String s;
        while ((s = in.readLine()) != null) {
            int t = Integer.valueOf(s);
            int p=0;
            Map<String, Team> tablePos = new HashMap<>();
            for (int i = 0; i < t; i++) {

                String match[] = in.readLine().split("vs.");
                String nameT1 = "", nameT2 = "";
                Team team1, team2;
                String t1[] = match[0].split(" ");

                String t2[] = match[1].split(" ");

                for (int j = 0; j < t1.length - 1; j++) {
                    nameT1 += t1[j] + " ";
                }
                nameT1 = nameT1.trim();

                for (int j = 2; j < t2.length; j++) {
                    nameT2 += t2[j] + " ";
                }
                nameT2 = nameT2.trim();

                if (tablePos.containsKey(nameT1)) {
                    team1 = tablePos.get(nameT1);
                } else {
                    team1 = new Team();
                    team1.teamLost=new ArrayList<>();
                    team1.name = nameT1;
                }
                if (tablePos.containsKey(nameT2)) {
                    team2 = tablePos.get(nameT2);
                } else {
                    team2 = new Team();                    
                    team2.teamLost=new ArrayList<>();
                    team2.name = nameT2;
                }

                int scr1 = Integer.valueOf(t1[t1.length - 1]);
                int scr2 = Integer.valueOf(t2[1]);

                if (scr1 == scr2) {
                    team1.points += 1;
                    team2.points += 1;
                } else if (scr1 > scr2) {
                    team1.points += 3;
                    team2.teamLost.add(team1.name);
                } else {
                    team2.points += 3;                    
                    team1.teamLost.add(team2.name);
                }
                //local
                team1.TotalGoal += scr1;
                team1.diffGoal += scr1 - scr2;
                //visitante
                team2.TotalGoal += scr2;
                team2.diffGoal += scr2 - scr1;
                team2.visitGoal += scr2;

                if (tablePos.containsKey(team1.name)) {
                    tablePos.replace(team1.name, team1);
                } else {
                    tablePos.put(team1.name, team1);
                }
                if (tablePos.containsKey(team2.name)) {
                    tablePos.replace(team2.name, team2);
                } else {
                    tablePos.put(team2.name, team2);
                }
            }
            List<Team> teams = new ArrayList<>();
            tablePos.forEach((k, v) -> teams.add(v));
            Collections.sort(teams);
            for (int i = 0; i <teams.size(); i++) {
                Team teamAux=teams.get(i);
                List<String> nameTeamLost=teamAux.teamLost;
                for (String name : nameTeamLost) {
                    for (int j = i+1; j < teams.size(); j++) {
                        if(name.equals(teams.get(j).name)){
                            p++;
                        }
                        
                    }
                }
            }            
            X=1;
            if(p>0)
                System.out.printf("The paradox occurs %d time(s).\n",p);
            teams.forEach(team -> System.out.println((X++)+". "+team));
        }
    }

}

class Team implements Comparable<Team> {

    String name;
    int points, diffGoal, TotalGoal, visitGoal;
    List<String> teamLost;

    @Override
    public int compareTo(Team t) {
        int c;
        c = t.points - this.points;
        if (c == 0) {
            c = t.diffGoal - this.diffGoal;
            if (c == 0) {
                c = t.TotalGoal - this.TotalGoal;
                if (c == 0) {
                    c = t.visitGoal - this.visitGoal;
                    if (c == 0) {
                        c = this.name.compareTo(t.name);
                    }
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return name;//+ " " + points + " " + diffGoal + " " + TotalGoal + " " + visitGoal+" "+teamLost;
    }
}
/*

*/