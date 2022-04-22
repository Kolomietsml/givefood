package com.project.giveFood.dto.сonverterDTO;

import com.project.giveFood.dto.InvoiceDTO;
import com.project.giveFood.entity.Invoice;
import org.springframework.stereotype.Component;

@Component
public class ConverterInvoice {
    public Invoice fromInvoiceDTOtoInvoice (InvoiceDTO invoiceDTO){
        return Invoice.builder().
                invoiceNumber(invoiceDTO.getInvoiceNumber()).
//                products(invoiceDTO.getProductDTOList().stream().map()).
                build();
    }

    public InvoiceDTO fromInvoiceToInvoiceDTO (Invoice invoice){

        return InvoiceDTO.builder().build();
    }

//    List<Product> fromProductsDTOListToProductsList (List<ProductDTO> productDTOList){
//        return productDTOList.stream().map(pDTO -> )
//    }
}
