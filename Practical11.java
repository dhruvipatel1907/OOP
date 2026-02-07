/**Design a class Time with hours (int) and minutes (int) as data members. Include method 
setTime(int h, int m) to initialize the time and displayTime() to display the time. Implement 
a method addTime(Time t1, Time t2) that takes two Time objects as arguments, adds their 
hours and minutes, and stores the result in the calling object. Do not use constructors for 
initialization in this specific practical.*/

class Time
{
    int hours;
    int minutes;

    void setTime(int h, int m)
    {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2)
    {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60)
        {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
    }

    void displayTime()
    {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args)
    {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(2, 45);
        t2.setTime(1, 30);

        t3.addTime(t1, t2);

        t3.displayTime();
    }
}
