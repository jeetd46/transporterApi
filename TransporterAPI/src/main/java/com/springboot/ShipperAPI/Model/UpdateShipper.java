package com.springboot.ShipperAPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateShipper {
	private String phoneNo;
	private String emailId;
	private String shipperName;
	private String companyName;
	private String kyc;
	private String gst;
	private String companyStatus;
	private String shipperLocation;
	private Boolean companyApproved;
	private Boolean accountVerificationInProgress;

	private ArrayList<ArrayList<String>> transporterList;
}
