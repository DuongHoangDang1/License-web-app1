package hsf302.he180446.duonghd.service;

import hsf302.he180446.duonghd.pojo.License;
import hsf302.he180446.duonghd.repository.LicenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {
    private final LicenseRepository licenseRepository;
    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public void save(License license) {
        licenseRepository.save(license);
    }

    public List<License> findAll() {
        return licenseRepository.findAll();
    }
}
