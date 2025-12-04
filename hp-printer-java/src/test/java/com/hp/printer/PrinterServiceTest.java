package com.hp.printer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrinterServiceTest {

    private final PrinterService printerService = new PrinterService();

    @Test
    void discoverPrinters_shouldReturnAtLeastOnePrinter() {
        List<String> printers = printerService.discoverPrinters();
        assertNotNull(printers, "Printer list should not be null");
        assertFalse(printers.isEmpty(), "Printer list should not be empty");
    }

    @Test
    void sendPrintJob_shouldReturnTrueForStub() {
        boolean result = printerService.sendPrintJob("HP-Printer-Stub-001", "/path/to/document.pdf");
        assertTrue(result, "Stub implementation should always return true");
    }

    @Test
    void getPrinterStatus_shouldReturnNonEmptyStatus() {
        String status = printerService.getPrinterStatus("HP-Printer-Stub-001");
        assertNotNull(status, "Status should not be null");
        assertFalse(status.isBlank(), "Status should not be blank");
    }
}
