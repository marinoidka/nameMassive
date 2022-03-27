package pro.learnup.javaqa.group2.chernykh2;

public class Addition {

    public static boolean isGreenLight = true;

    private static int maxSpeed = 7;

    public static int droppedOut(int[] speeds) {
        int start = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    start++;
                }
            }
        }
        return start;
    }

    public static int[] speedDroppedOut(int[] speeds) {
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        }
        int[] second = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    second[i] = speed;
                    i++;
                }
            }
        }
        return second;
    }

    public static int[] speedStayedIn(int[] speeds) {
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        } else {
            for (int speed : speeds) {
                cnt++;
            }
        }
        int[] third = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    third[i] = speed;
                    i++;
                }
            }
        } else {
            for (int speed : speeds) {
                third[i] = speed;
                i++;
            }
        }
        return third;
    }

    public static String[] survivors(String[] numberLines) {
        int i = 0;
        for (String line : numberLines) {
            String[] parts = line.split(" ");
            int element = Integer.parseInt(parts[1]);
            if (!isGreenLight) {
                if (element <= maxSpeed) {
                    i++;
                }
            } else {
                if (element >= 0) {
                    i++;
                }
            }
        }
        int j = 0;
        String[] output = new String[i];
        for (String loser : numberLines) {
            String[] parts = loser.split(" ");
            int piece = Integer.parseInt(parts[1]);
            String name = parts[0];
            if (!isGreenLight) {
                if (piece <= maxSpeed) {
                    output[j] = name;
                    j++;
                }
            } else {
                if (piece >= 0) {
                    output[j] = name;
                    j++;
                }
            }
        }
        return output;
    }
}


