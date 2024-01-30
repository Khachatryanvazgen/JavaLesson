package Gradaran;

import java.time.LocalTime;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Books1 {
    private  final String bookName;
    private final String bookAutor;
    private LocalTime rentStartTime;
    private long rentDurationTime;
    private boolean isArka;

    public long getrentDurationTime(){
        return rentDurationTime;
    }

    public void setRentTime() {
        this.rentStartTime = LocalTime.now();
    }
    public boolean isArka(){
        return isArka;
    }
    public void changStatus(){
        isArka = !isArka;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }


    public Books1 (String bookName, String bookAutor){
        this.bookName = bookName;
        this.bookAutor = bookAutor;
    }

    public void addRentDuration(){
        rentDurationTime += rentStartTime.until(LocalTime.now(), SECONDS);
    }

}
