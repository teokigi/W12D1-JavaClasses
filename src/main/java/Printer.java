public class Printer {

    private int sheetsOfPaperInTray;
    private int tonerVolume;

    public Printer(int sheets,int toner){
        this.sheetsOfPaperInTray = sheets;
        this.tonerVolume = toner;
    }

    public int getSheets(){
        return this.sheetsOfPaperInTray;
    }

    public int getToner(){
        return this.tonerVolume;
    }

    public void print(int pages,int copies){
        int requiredSheets = pages * copies;

        if (this.sheetsOfPaperInTray >= requiredSheets) {
            this.tonerVolume -= requiredSheets;
            this.sheetsOfPaperInTray -= requiredSheets;
        }
    }

}
