package com.bhhan.license.repository;

import com.bhhan.license.domain.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hbh5274@gmail.com on 2020-04-10
 * Github : http://github.com/bhhan5274
 */

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    List<License> findByOrOrganizationId(String organizationId);
    License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
