import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
         printer = new Printer(1000,900);
    }

    @Test
    public void hasSheets(){
        assertEquals(1000,printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(900,printer.getToner());
    }

    @Test
    public void successfulPrint(){
        printer.print(10,1);
        assertEquals(990,printer.getSheets());
        assertEquals(890,printer.getToner());
    }

    @Test
    public void failedPrint(){
        printer.print(100,100);
        assertEquals(1000,printer.getSheets());
    }

}
