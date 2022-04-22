package com.zensar.olxapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advertise {

	private long id;
	private String title;
	private long price;
	private String category;
	private String description;
	private String username;
	private String createdDate;
	private String modifiedDate;
	private String status;
}
