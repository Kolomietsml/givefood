package com.project.giveFood.controller;

import com.project.giveFood.dto.InvoiceDTO;
import com.project.giveFood.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
@AllArgsConstructor
public class InvoicesController {
    private final InvoiceService invoiceService;

    @PostMapping("/save")
    public InvoiceDTO saveInvoice(InvoiceDTO invoiceDTO) {
        return invoiceService.saveInvoice(invoiceDTO);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteInvoice (@PathVariable long numberInvoice){
        invoiceService.deleteInvoice(numberInvoice);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/findByNumber")
    public InvoiceDTO findInvoiceByNumber (@RequestParam long numberInvoice){
        return invoiceService.findInvoiceByNumber(numberInvoice);
    }
    @GetMapping("/findAll")
    public List<InvoiceDTO> findAll (){
        return invoiceService.findAllInvoice();
    }

}
