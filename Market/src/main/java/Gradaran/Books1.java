package Gradaran;

import java.time.LocalTime;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Books1 {
    private String bookName;
    private String bookAutor;
    private LocalTime rentStartTime;
    private long rentDurationTime;
    private boolean isArka;
    private final int rentPricePerSecond = 10;

    private long income;

    public long getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public long getrentDurationTime() {
        return rentDurationTime;
    }

    public void setRentTime() {
        this.rentStartTime = LocalTime.now();
    }

    public boolean isArka() {
        return isArka;
    }

    public void changStatus() {
        isArka = !isArka;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }


    public Books1(String bookName, String bookAutor) {
        this.bookName = bookName;
        this.bookAutor = bookAutor;
    }

    public void fillBookInfo(String bookName, String bookAutor) {
        this.bookName = bookName;
        this.bookAutor = bookAutor;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please write book name ");
        this.bookName = scanner1.nextLine();
        System.out.println("Please write book bAutor ");
        this.bookAutor = scanner1.nextLine();
    }

    public void addRentDuration() {
        rentDurationTime = rentStartTime.until(LocalTime.now(), SECONDS);
    }

    public void calculateIncome() {
        income += rentPricePerSecond * (rentDurationTime + rentStartTime.until(LocalTime.now(), SECONDS));
    }

}
