package com.ecsfin.library.service;

import com.ecsfin.regulatory.service.RegulatoryCompliance;
import org.springframework.stereotype.Component;

@Component("doddFrankCompliance")
public class DoddFrankRegulatoryCompliance implements RegulatoryCompliance {
    @Override
    public String getRegulationName() {
        return "From Dodd Frank";
    }
}
