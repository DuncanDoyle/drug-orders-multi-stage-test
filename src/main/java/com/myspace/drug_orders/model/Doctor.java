package com.myspace.drug_orders.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class Doctor implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("E-Mail")
	private java.lang.String email;
	@org.kie.api.definition.type.Label("Mobile Number")
	private java.lang.String mobileNo;

	public Doctor() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(java.lang.String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Doctor(java.lang.String name, java.lang.String email,
			java.lang.String mobileNo) {
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
	}

}
