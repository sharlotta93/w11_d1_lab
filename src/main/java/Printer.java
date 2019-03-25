public class Printer {

    private int paper;
    private int toner;


    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int checkPaper() {
        return this.paper;
    }

    public int checkToner() {
        return this.toner;
    }

    public boolean printingRequest(int numberOfPages, int numberOfCopies) {
        int totalPages = numberOfPages * numberOfCopies;
        return (totalPages < this.paper);
    }

    public int print(int numberOfPages, int numberOfCopies) {
       if (this.printingRequest(numberOfPages, numberOfCopies)) {
           this.toner -= (numberOfPages * numberOfCopies);
           return this.paper -= (numberOfPages * numberOfCopies);
       } else {
           return this.paper;
       }
    }

    public int refillPaper(int numberOfPaper) {
        return this.paper += numberOfPaper;
    }

}
