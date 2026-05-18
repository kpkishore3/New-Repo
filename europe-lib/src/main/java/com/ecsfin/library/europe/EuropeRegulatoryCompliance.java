package com.ecsfin.library.europe;

import com.ecsfin.regulatory.service.RegulatoryCompliance;
import org.springframework.stereotype.Component;

@Component("wireDisclosureCompliance")
public class EuropeRegulatoryCompliance implements RegulatoryCompliance {
    @Override
    public String getRegulationName() {
        return "From Wire disclosure";
    }
}
