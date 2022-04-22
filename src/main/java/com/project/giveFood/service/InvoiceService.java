package com.project.giveFood.service;

import com.project.giveFood.dto.InvoiceDTO;

import java.util.List;

public interface InvoiceService {
    InvoiceDTO saveInvoice(InvoiceDTO invoiceDTO);

    void deleteInvoice(long invoiceNumber);

    InvoiceDTO findInvoiceByNumber(long numberInvoice);

    List<InvoiceDTO> findAllInvoice();
}
