package RPC.R19_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class remote {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        try {
            int t = Integer.valueOf(in.readLine().trim());
            for (int ii = 0; ii < t; ii++) {
                st = new StringTokenizer(in.readLine().trim());
                int n = Integer.valueOf(st.nextToken());
                boolean numbers[] = new boolean[10];
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = true;
                }
                for (int i = 0; i < n; i++) {
                    numbers[Integer.valueOf(st.nextToken())] = false;
                }
                String canal = in.readLine();
                int Canal = Integer.valueOf(canal);
                String min = "", max = "";
                boolean first = true;
                for (int i = 0; i < canal.length(); i++) {
                    char c = canal.charAt(i);
                    int index = Integer.valueOf(c + "");
                    if (!numbers[index]) {
                        if (first) {
                            first = false;
                            for (int j = index; j < numbers.length; j++) {
                                try {
                                    if (numbers[j]) {
                                        max += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                            for (int j = index; j >= 0; j--) {
                                try {
                                    if (numbers[j]) {
                                        min += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        } else {
                            for (int j = 0; j < numbers.length; j++) {
                                try {
                                    if (numbers[j]) {
                                        max += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                            for (int j = numbers.length - 1; j >= 0; j--) {
                                try {
                                    if (numbers[j]) {
                                        min += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    } else {
                        if (first) {

                            for (int j = index; j < numbers.length; j++) {
                                try {
                                    if (numbers[j]) {
                                        max += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                            for (int j = index; j >= 0; j--) {
                                try {
                                    if (numbers[j]) {
                                        min += j;
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        } else {
                            for (int j = 0; j < numbers.length; j++) {
                                try {
                                    if (numbers[j]) {
                                        max += Math.min(j, index);
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                            for (int j = numbers.length - 1; j >= 0; j--) {
                                try {
                                    if (numbers[j]) {
                                        min += Math.max(j, index);
                                        break;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }

                    int MIN, MAX;
                    MIN = Integer.valueOf(min);
                    MAX = Integer.valueOf(max);
                    System.out.println(Math.min((int) Math.abs(Canal - MIN), (int) Math.abs(Canal - MAX)));
                }
            }
        } catch (Exception e) {
        }
    }
}

/*
1 5
250

1 2
250

1 0
250

2 2 5
250

2 5 0
250

2 2 0
250
 
 */
