package com.zensar.olxapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxapplication.entity.AdvertiseCategory;
import com.zensar.olxapplication.entity.AdvertiseStatus;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {
	
	static List<AdvertiseCategory> categories = new ArrayList<AdvertiseCategory>();
	static {
		categories.add(new AdvertiseCategory(1L, "Furniture"));
		categories.add(new AdvertiseCategory(2L, "cars"));
		categories.add(new AdvertiseCategory(3L, "mobiles"));
		categories.add(new AdvertiseCategory(4L, "Real Estate"));
		categories.add(new AdvertiseCategory(5L, "sports"));
	}
	static List<AdvertiseStatus> status = new ArrayList<AdvertiseStatus>();
	static {
		status.add(new AdvertiseStatus(1L, "OPEN"));
		status.add(new AdvertiseStatus(2L, "CLOSE"));
	}

	@Override
	public List<AdvertiseCategory> getAllCategories() {
		return categories;
	}

	@Override
	public List<AdvertiseStatus> getAllStatus() {
		return status;
	}

}
