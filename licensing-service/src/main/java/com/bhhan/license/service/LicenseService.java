package com.bhhan.license.service;

import com.bhhan.license.domain.License;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by hbh5274@gmail.com on 2020-04-09
 * Github : http://github.com/bhhan5274
 */

@Service
public class LicenseService {
    public License getLicense(String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId(UUID.randomUUID().toString())
                .withProductName("Test Product Name")
                .withLicenseType("PerSeat");
    }

    public void saveLicense(License license){

    }

    public void updateLicense(License license){

    }

    public void deleteLicense(License license){

    }
}
