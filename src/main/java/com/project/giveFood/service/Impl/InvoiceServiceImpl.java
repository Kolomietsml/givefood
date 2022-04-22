package com.project.giveFood.service.Impl;

import com.project.giveFood.dto.InvoiceDTO;
import com.project.giveFood.dto.сonverterDTO.ConverterInvoice;
import com.project.giveFood.repo.InvoiceRepo;
import com.project.giveFood.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepo invoiceRepo;
    private final ConverterInvoice converterInvoice;

    @Override
    public InvoiceDTO saveInvoice(InvoiceDTO invoiceDTO) {
        return converterInvoice.fromInvoiceToInvoiceDTO(invoiceRepo.save(converterInvoice.fromInvoiceDTOtoInvoice(invoiceDTO)));
    }

    @Override
    public void deleteInvoice(long invoiceNumber) {
        invoiceRepo.deleteById(invoiceNumber);
    }

    @Override
    public InvoiceDTO findInvoiceByNumber(long numberInvoice) {
//        Invoice invoice = invoiceRepo.findById(numberInvoice).get();
//        if (invoice != null){
//            return converterInvoice.fromInvoiceToInvoiceDTO(invoice);
//        }
//        return null;
        return converterInvoice.fromInvoiceToInvoiceDTO(invoiceRepo.findById(numberInvoice).get()); //if null ???
    }

    @Override
    public List<InvoiceDTO> findAllInvoice() {
        return invoiceRepo.findAll().stream().map(converterInvoice::fromInvoiceToInvoiceDTO).collect(Collectors.toList());
    }
}