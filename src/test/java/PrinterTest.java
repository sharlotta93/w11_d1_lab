import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 20);
    }

    @Test
    public void hasPaper() {
        assertEquals(10, printer.checkPaper());
    }

    @Test
    public void canPrintingTrue() {
        printer.print(2, 3);
        assertEquals(4, printer.checkPaper());
    }

    @Test
    public void canPrintingFalse() {
        printer.print(6, 3);
        assertEquals(10, printer.checkPaper());
    }

    @Test
    public void canRefillPaper() {
        printer.refillPaper(20);
        assertEquals(30, printer.checkPaper());
    }

    @Test
    public void canReduceToner() {
        printer.print(2, 2);
        assertEquals(16, printer.checkToner());
    }
}



//    Modify the printer so that it reduces the toner by 1 for each page printed.
