package dto;

public class customerDTO {

private int cid;
private String cname;
private String cemail;
private String phone;
private String age;
private String gender;

public customerDTO(int cid, String cname, String cemail, String phone, String age, String gender) {

	this.cid=cid;
	this.cname=cname;
	this.cemail=cemail;
	this.phone=phone;
    this.age=age; 
     this.gender=gender;

 }

public customerDTO() {

}

public int getCid() {

	return cid;

}

public void setCid(int cid) {

	this.cid = cid;

}

public String getCname() {

	return cname;

}

public void setCname(String cname) {

	this.cname = cname;

}

public String getCemail() {

	return cemail;

}

public void setCemail(String cemail) {

	this.cemail = cemail;

}

public String getPhone() {

	return phone;

}

public void setPhone(String phone) {

	this.phone = phone;

}

public String getAge() {

	return age;

}

public void setAge(String age) {

	this.age = age;

}

public String getGender() {

	return gender;

}

public void setGender(String gender) {

	this.gender = gender;

}


@Override

public String toString() {
	return "customerDTO [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", phone=" + phone + ", age=" + age + ", gender=" + gender + "]";
}



}
