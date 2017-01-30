/**
 * Created by abhishek.ar on 28/01/17.
 */
//Given a timestamp in hh:mm:ss format find whether second hand
// lies in larger or smaller area formed by hour and minute hands.

//http://stackoverflow.com/questions/34267968/how-to-find-if-the-second-hand-of-a-clock-lies-in-the-larger-area-or-smaller-one

public class TimeStamp {
    public static final String larger ="larger";
    public static final String smaller = "smaller";
    public static String checkHalves(String time){
        int hrFactor = 360/12;
        int minFactor = 360/60;
        int secFactor = 360/60;
        String[] timestamp = time.split(":");
        if (timestamp.length == 3){
            int hrAngle = hrFactor * Integer.parseInt(timestamp[0]);
            int minAngle = minFactor * Integer.parseInt(timestamp[1]);
            int secAngle = secFactor * Integer.parseInt(timestamp[2]);

            //Case when hr hand angle is grateer than minute hand
            if (hrAngle >= minAngle){
                int area1 = hrAngle - minAngle;
                int area2 = 360 - area1;

                if (secAngle <= hrAngle && secAngle >= minAngle){
                    if (area1 >= area2){
                        return larger;
                    } else {
                        return smaller;
                    }
                } else {
                    if (area1 >= area2)
                        return smaller;
                    else
                        return larger;
                }
            } else {
                int area1 = minAngle - hrAngle;
                int area2 = 360 -area1;

                if (secAngle <= minAngle && secAngle >= hrAngle){
                    if (area1 >= area2){
                        return larger;
                    } else {
                        return smaller;
                    }
                } else {
                    if (area1 >= area2)
                        return smaller;
                    else
                        return larger;
                }
            }

        }
        return "";
    }

    public static void main(String [] args){
        System.out.println(checkHalves("10:10:11"));
    }
}
