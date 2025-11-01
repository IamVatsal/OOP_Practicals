public class Prac1 {
    public static void main(String[] args) {
        Date d = new Date();
        d.set_date(12, 9, 2025);
        System.out.println(d.get_date());
    }
}

class Date{ 
    int day;
    int month;
    int year;

    void set_date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    String get_date(){
        String date = String.format("%02d/%02d/%d",day,month,year); 
        return date;
    }
}
