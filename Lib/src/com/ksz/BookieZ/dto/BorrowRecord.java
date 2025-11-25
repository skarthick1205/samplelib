package com.ksz.BookieZ.dto;

public class BorrowRecord {
    private Book book;
    private String borrowDate;
    private String dueDate;
    private boolean returned = false;
    private boolean isFined=false;
    private FineTransaction fineTransaction;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public boolean isFined() {
        return isFined;
    }

    public void setFined(boolean fined) {
        isFined = fined;
    }

    public FineTransaction getFineTransaction() {
        return fineTransaction;
    }

    public void setFineTransaction(FineTransaction fineTransaction) {
        this.fineTransaction = fineTransaction;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
