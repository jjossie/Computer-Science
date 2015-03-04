package Assignment4;
import java.lang.Math;
public class Time implements Comparable
{
    private int hour;
    private int minute;

    /*
     * Sets the default time to 12:00.
     */
    public Time ()
    {
        this(12, 0);
    }

    /*
     * Sets hour to h and minute to m.
     */
    public Time (int h, int m)
    {
        hour = 0;
        minute = 0;
        if (h >=1 && h <= 23)
            hour = h;
        if (m >= 1 && m <= 59)
            minute = m;

    }
    public String toString ()
    {
        String h = "";
        String m = "";
        if ( hour <10)
            h +="0";
        if (minute <10)
            m +="0";
        h += hour;
        m+=minute;

        return "" + h + ":" + m;
    }
    public int compareTo(Object obj){
        Time t = (Time) obj;
        int x = 0;
        if (this.hour < t.hour){
            x = -1;
        }else if (this.hour > t.hour){
            x = 1;
        }else {
            if (this.minute<t.minute){
                x = -1;
            }
            else if (this.minute>t.minute){
                x = 1;
            }else
                x = 0;
        }
        return x;
    }
    public String difference(Time t){
        int hour = 0, minute = 0;
        hour = Math.abs(this.hour - t.hour);
        minute = Math.abs(this.minute - t.minute);
        if(this.hour > t.hour && this.minute < t.minute){
            minute = 60 - minute;
            hour--;
        }
        if(this.hour < t.hour && this.minute > t.minute){
            minute = 60 - minute;
            hour --;

        }

        if (t.hour == this.hour && t.minute == this.minute){
            hour = 0;
            minute = 0;
        }
        Time t2 = new Time(hour, minute);
        return t2.toString();
    }

}