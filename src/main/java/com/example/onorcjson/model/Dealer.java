package com.example.onorcjson.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dealer {
	private int id;
    private String address;
    private String nomineeFatherName;
    
    @JsonProperty("fps_OwnerFatherName")
    private String fpsOwnerFatherName; // note the naming convention here
    private String fpsid;
    private String fpsname;
    private String fpstype;
    private String gender;
    private String fpsarea;
    private String pincode;
    private int age;
    private String latitude;
    private String vigilance;
    private String districtName;
    
    @JsonProperty("validity_Upto")
    private String validityUpto; // note the naming convention here
    private String longitude;
    private String accuracy;
    
    @JsonProperty("aadhaar_No")
    private String aadhaarNo; // note the naming convention here
    private String fpsownerName;
    private String mobileNo;
    
    @JsonProperty("license_No")
    private String licenseNo; // note the naming convention here
    
    @JsonProperty("fps_Issue_Date")
    private String fpsIssueDate; // note the naming convention here
    private String tehsilName;
    
    @JsonProperty("auth_Type")
    private String authType; // note the naming convention here
    private String fpsnomineeName;
    
    @JsonProperty("fps_Open_Mode")
    private String fpsOpenMode; // note the naming convention here
    
    @JsonProperty("fps_MobileNo")
    private String fpsMobileNo; // note the naming convention here
    private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNomineeFatherName() {
		return nomineeFatherName;
	}
	public void setNomineeFatherName(String nomineeFatherName) {
		this.nomineeFatherName = nomineeFatherName;
	}
	public String getFpsOwnerFatherName() {
		return fpsOwnerFatherName;
	}
	public void setFpsOwnerFatherName(String fpsOwnerFatherName) {
		this.fpsOwnerFatherName = fpsOwnerFatherName;
	}
	public String getFpsid() {
		return fpsid;
	}
	public void setFpsid(String fpsid) {
		this.fpsid = fpsid;
	}
	public String getFpsname() {
		return fpsname;
	}
	public void setFpsname(String fpsname) {
		this.fpsname = fpsname;
	}
	public String getFpstype() {
		return fpstype;
	}
	public void setFpstype(String fpstype) {
		this.fpstype = fpstype;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFpsarea() {
		return fpsarea;
	}
	public void setFpsarea(String fpsarea) {
		this.fpsarea = fpsarea;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getVigilance() {
		return vigilance;
	}
	public void setVigilance(String vigilance) {
		this.vigilance = vigilance;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getValidityUpto() {
		return validityUpto;
	}
	public void setValidityUpto(String validityUpto) {
		this.validityUpto = validityUpto;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getFpsownerName() {
		return fpsownerName;
	}
	public void setFpsownerName(String fpsownerName) {
		this.fpsownerName = fpsownerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public String getFpsIssueDate() {
		return fpsIssueDate;
	}
	public void setFpsIssueDate(String fpsIssueDate) {
		this.fpsIssueDate = fpsIssueDate;
	}
	public String getTehsilName() {
		return tehsilName;
	}
	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getFpsnomineeName() {
		return fpsnomineeName;
	}
	public void setFpsnomineeName(String fpsnomineeName) {
		this.fpsnomineeName = fpsnomineeName;
	}
	public String getFpsOpenMode() {
		return fpsOpenMode;
	}
	public void setFpsOpenMode(String fpsOpenMode) {
		this.fpsOpenMode = fpsOpenMode;
	}
	public String getFpsMobileNo() {
		return fpsMobileNo;
	}
	public void setFpsMobileNo(String fpsMobileNo) {
		this.fpsMobileNo = fpsMobileNo;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
    
}
