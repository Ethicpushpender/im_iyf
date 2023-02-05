package com.im.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "items")
public class Register {

	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int  id;
	    private String name;
	    private String cName;
		private String registrationId;
	    private String productCategory;
	    private LocalDate dateOfEntry;
	    private Boolean reserved;
	    private String bill;
	    private String warrantyDetails;
	    private String conditions;
	    private String image;
	    private String remarks;
	    
	    
	    // getters and setters

		public Register() {
		}

		public Register(int id, String name,String cName, String registrationId, String productCategory, LocalDate dateOfEntry,
				Boolean reserved, String bill, String warrantyDetails, String conditions, String image, String remarks) {
			super();
			this.id = id;
			this.name = name;
			this.name = cName;
			this.registrationId = registrationId;
			this.productCategory = productCategory;
			this.dateOfEntry = dateOfEntry;
			this.reserved = reserved;
			this.bill = bill;
			this.warrantyDetails = warrantyDetails;
			this.conditions = conditions;
			//this.image = image;
			this.remarks = remarks;
		}

		public int  getId() {
			return id;
		}

		public void setId(int  id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		 public String getcName() {
				return cName;
			}

			public void setcName(String cName) {
				this.cName = cName;
			}

		public String getRegistrationId() {
			return registrationId;
		}

		public void setRegistrationId(String registrationId) {
			this.registrationId = registrationId;
		}

		public String getProductCategory() {
			return productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory = productCategory;
		}

		public LocalDate getDateOfEntry() {
			return dateOfEntry;
		}

		public void setDateOfEntry(LocalDate dateOfEntry) {
			this.dateOfEntry = dateOfEntry;
		}

		public Boolean isReserved() {
			return reserved;
		}

		public void setReserved(Boolean reserved) {
			this.reserved = reserved;
		}

		public String getBill() {
			return bill;
		}

		public void setBill(String bill) {
			this.bill = bill;
		}

		public String getWarrantyDetails() {
			return warrantyDetails;
		}

		public void setWarrantyDetails(String warrantyDetails) {
			this.warrantyDetails = warrantyDetails;
		}

		public String getConditions() {
			return conditions;
		}

		public void setCondition(String conditions) {
			this.conditions = conditions;
		}

		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	
}
