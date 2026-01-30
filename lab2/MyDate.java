public class MyDate {
    private int month;
    private int day;
    private int year;

    public MyDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
    public void setMonth( int month) {
        this.month = month;
    }
    public void setDay( int day) {
        this.day = day;
    }
    public void setYear( int year) {
        this.year = year;
    }
    public int  getMonth( int month) {
        return month;
    }
    public int getDay ( int day) {
        return day;
    }
    public int getYear ( int year)  {
        return year;
    }
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
 
