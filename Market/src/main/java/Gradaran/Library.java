package Gradaran;


import Gayanei_Tnain.Employee;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Library {
    private Scanner scanner = new Scanner(System.in);
    private boolean isGradaranOpen = true;

    private final int rentPricePerSecond = 10;

    private long income;

    private ArrayList<Books1> bookList = new ArrayList<>();

    public long getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public boolean isBookExist(String bookName, String bookAutor) {
        for (Books1 book : bookList) {
            if (bookName.equals(book.getBookName()) && bookAutor.equals(book.getBookAutor())) {
                return false;
            }
        }
        return true;
    }

    public void addNewBook(String bookName, String bookAutor) {
        if (isBookExist(bookName, bookAutor)) {
            bookList.add(new Books1(bookName, bookAutor));
            System.out.println("The Book " + bookName + " is add in library");
        } else
            System.out.println("The book " + bookName + " already exist in library");
    }


    public Books1 getBookInfo(String name, String autor) {
        for (Books1 book : bookList) {
            if (name.equals(book.getBookName()) && autor.equals(book.getBookAutor())) {
                return book;
            }
        }
        return null;
    }

    public void rentBookfromLibrary(String bName, String bAutor) {
        if (!isBookExist(bName, bAutor)) {
            Books1 book = getBookInfo(bName, bAutor);
            if (book.isArka()) {
                System.out.println("The book " + bName + " arden trvats e grqaserin ");
            } else {
                book.setRentTime();
                book.changStatus();
                System.out.println(bName + " book successfully taken");
            }
        } else
            System.out.println("We don't have book with this name " + bName + " and this autor name" + bAutor);
    }

    public void returnBookToLibrary(String bName, String bAutor) {
        if (!isBookExist(bName, bAutor)) {
            Books1 book = getBookInfo(bName, bAutor);
            if (!book.isArka()) {
                System.out.println("The book " + bName + " arden veradardzvats e  ");
            } else {
                book.changStatus();
                book.addRentDuration();
                System.out.println(bName + " book successfully returned ");
            }
        } else
            System.out.println("We don't have book with this name " + bName + " and this autor name" + bAutor);
    }



    public void LibraryWork() {

        while (isGradaranOpen) {
            System.out.println("Type action Add if you want Add book in Library");
            System.out.println("Type action Take if you want Take book from Library");
            String Action = scanner.nextLine();
            switch (Action) {
                case "Add":
                    System.out.println("Please write book name ");
                    String bookName = scanner.nextLine();
                    System.out.println("Please write book bAutor ");
                    String bookAutor = scanner.nextLine();
                    addNewBook(bookName, bookAutor);
                    break;
                case "Take":
                    System.out.println("Please write book name which you want to take");
                    String name = scanner.nextLine();
                    System.out.println("Please write bAutor name ");
                    String autor = scanner.nextLine();
                    rentBookfromLibrary(name, autor);
                    break;
                case "Return":
                    System.out.println("Please write book name which you want to return");
                    String ReturnBookName = scanner.nextLine();
                    System.out.println("Please write bAutor name ");
                    String ReturnBookAutor = scanner.nextLine();
                    returnBookToLibrary(ReturnBookName, ReturnBookAutor);
                    break;
                case "Report":
                    System.out.println("REPORT");
                case "Close":
                    isGradaranOpen = false;
                    System.out.println("Gradaran is closed ");
                    break;
                default:
                    System.out.println("default");
            }
        }
    }


    public static void main(String[] args) {
        Library gradaran = new Library();
        gradaran.LibraryWork();
    }
}

