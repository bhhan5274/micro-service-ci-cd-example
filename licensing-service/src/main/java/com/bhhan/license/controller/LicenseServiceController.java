package com.bhhan.license.controller;

import com.bhhan.license.domain.License;
import com.bhhan.license.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hbh5274@gmail.com on 2020-04-09
 * Github : http://github.com/bhhan5274
 */

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
@RequiredArgsConstructor
public class LicenseServiceController {
    private final LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicense(@PathVariable("organizationId") String organizationId,
                              @PathVariable("licenseId") String licenseId){
        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withProductName("Teleco")
                .withLicenseType("Seat");
    }

    @RequestMapping(value = "{licenseId}", method = RequestMethod.PUT)
    public String updateLicense(@PathVariable("licenseId") String licenseId){
        return String.format("This is the put");
    }

    @RequestMapping(value = "{licenseId}", method = RequestMethod.POST)
    public String saveLicense(@PathVariable("licenseId") String licenseId){
        return String.format("This is the post");
    }

    @RequestMapping(value = "{licenseId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicense(@PathVariable("licenseId") String licenseId){
        return String.format("This is the Delete");
    }
}
