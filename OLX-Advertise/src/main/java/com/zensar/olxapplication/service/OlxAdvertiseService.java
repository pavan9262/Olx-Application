package com.zensar.olxapplication.service;

import java.util.List;

import com.zensar.olxapplication.entity.Advertise;

public interface OlxAdvertiseService {

	Advertise addAdvertise(Advertise ads, String username, String password);

	Advertise updateAdvertise(long id, Advertise advertise, String username, String password);

	List<Advertise> getAllCategories(String username, String password);

	Advertise getSpecificAdvertisement(long id, String username, String password);

	boolean deleteSpecificAdvertise(long id, String username, String password);

	Advertise searchfilterCriteria(long id);

	List<Advertise> searchText();

	Advertise getAdvertiseDetails(long id, String username, String password);

}
