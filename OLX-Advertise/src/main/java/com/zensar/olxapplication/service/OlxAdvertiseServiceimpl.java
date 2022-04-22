package com.zensar.olxapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxapplication.entity.Advertise;

@Service
public class OlxAdvertiseServiceimpl implements OlxAdvertiseService {

	static List<Advertise> advertises = new ArrayList<Advertise>();

	static {
		advertises.add(new Advertise(1L, "laptop sale", 54000L, "Electronic goods", "intel core 3 Sony Vaio", "anand",
				"21-04-2022", "21-04-2022", "OPEN"));
		advertises.add(new Advertise(2L, "Sofa available for sale", 30000L, "Furniture",
				"Sofa 5 years Old available for sale in pune", "anand", "22-04-2022", "22-04-2022", "OPEN"));
	}

	@Override
	public Advertise addAdvertise(Advertise ads, String username, String password) {
		if (username.equals("anand") && password.equals("anand123")) {
			advertises.add(ads);
			ads.setCategory("Electronic goods");
			ads.setUsername("anand");
			ads.setCreatedDate("21/04/2022");
			ads.setModifiedDate("22/04/22");
			ads.setStatus("OPEN");
			return ads;
		}

		return null;
	}

	@Override
	public Advertise updateAdvertise(long id, Advertise advertise, String username, String password) {
		if (username.equals("anand") && password.equals("anand123")) {
			Advertise ads = updateAdvertise(id, advertise, "anand", "anand123");
			ads.setTitle(advertise.getTitle());
			ads.setPrice(advertise.getPrice());
			ads.setDescription(advertise.getDescription());

			return ads;
		}

		return null;
	}

	@Override
	public List<Advertise> getAllCategories(String username, String password) {
		if(username.equals("anand")&&password.equals("anand123")) {
			return advertises;
			}
			return null;
	}

	@Override
	public Advertise getSpecificAdvertisement(long id, String username, String password) {
		if (username.equals("anand") && password.equals("anand123")) {

			for (Advertise advertise : advertises) {

				if (advertise.getId() == id) {
					return advertise;
				}
			}
		}
		return null;
	}

	@Override
	public boolean deleteSpecificAdvertise(long id, String username, String password) {
		if (username.equals("anand") && password.equals("anand123")) {
			for (Advertise advertise : advertises) {
				if (advertise.getId() == id) {
					advertises.remove(advertise);

					return true;
				}

			}

		}
		return false;

	}

	@Override
	public Advertise searchfilterCriteria(long id) {
		for (Advertise advertise : advertises) {

			if (advertise.getId() == id) {
				return advertise;
			}
		}
		return null;
	}

	@Override
	public List<Advertise> searchText() {
		return advertises;
	}

	@Override
	public Advertise getAdvertiseDetails(long id, String username, String password) {

		if (username.equals("anand") && password.equals("anand123")) {

			for (Advertise advertise : advertises) {

				if (advertise.getId() == id) {
					return advertise;
				}
			}
		}
		return null;
	}

}
