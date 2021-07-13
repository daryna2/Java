package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel>-1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

        this.numberOfPages = 0;
        this.duplexPrinter = duplexPrinter;
    }


    public int fillUpToner(int refilling) {
        if (refilling > 0 && refilling <= 100) {
            if (this.tonerLevel + refilling > 100) {
                return -1;
            }
            this.tonerLevel += refilling;
            return tonerLevel;
        } else {
            return -1;
        }
    }

    public int printedPage(int printedPages) {
        int numberOfPages = printedPages;
        if(this.duplexPrinter) {
        numberOfPages /= 2;
            System.out.println("Printing in duplex mode");
    }
        this.numberOfPages +=numberOfPages;
        return numberOfPages;
        }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}



