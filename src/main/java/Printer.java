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

    public void print(int numberOfPages, int numberOfCopies) {
        int totalPages = numberOfPages * numberOfCopies;
       if (totalPages < this.paper) {
           this.toner -= totalPages;
           this.paper -= totalPages;
       }
    }

    public int refillPaper(int numberOfPaper) {
        return this.paper += numberOfPaper;
    }

}
