package com.redteamobile.darwin.service;

import com.redteamobile.darwin.model.entity.Bundle;

public interface BundleService {
    Bundle getBundleByCode(String code) throws Exception;
}
