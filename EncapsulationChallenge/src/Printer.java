public class Printer {

    private int tonnerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {

        //tonnerLevel
        this.tonnerLevel = (tonnerLevel >= 0 && tonnerLevel < 100)? this.tonnerLevel: -1;
        //Others
        this.pagesPrinted = 0; //initial value = 0
        this.duplex = duplex;
    }

    public int addTonner(int tonerAmmount){
        if (tonnerLevel + tonerAmmount > 100 || tonnerLevel +tonerAmmount < 0) {
            return -1;
        } else {
            tonnerLevel += tonerAmmount;
            return tonnerLevel;
        }

    }
    public int printPages(int pages) {
        int jobPages = (duplex)? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
