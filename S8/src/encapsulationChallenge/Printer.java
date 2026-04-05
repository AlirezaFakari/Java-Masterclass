package encapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, Boolean duplex) {
        this.tonerLevel = (tonerLevel<0) ? -1 : tonerLevel;
        this.duplex = duplex;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public int addToner(int tonerAmount) {
        if((tonerAmount+tonerLevel) <0 || (tonerAmount+tonerLevel) > 100)
            return -1;
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages) {
        pagesPrinted += pages;
        if(duplex==true){
            System.out.println("Printing in duplex mode");
            return pages/2 + pages%2;
        }
        return pages;
    }
}
