package com.zensar.olxapplication.service;

import java.util.List;

import com.zensar.olxapplication.entity.AdvertiseCategory;
import com.zensar.olxapplication.entity.AdvertiseStatus;

public interface AdvertiseService {
	
	List<AdvertiseCategory> getAllCategories();
	List<AdvertiseStatus> getAllStatus();
}
