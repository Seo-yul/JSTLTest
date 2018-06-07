package vo;

public class Member {

	private String userId; // id
	private String userPwd; // password
	private String userName; // name
	private String gender; // gender
	private String hobby; // hobby
	private String birth; // birthDay
	private int age; // age
	private String address;
	private String phone; // phoneNumber
	private String introduce; // introduce
	public Member(String userId, String userPwd, String userName, String gender, String hobby, String birth, int age,
			String address, String phone, String introduce) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.gender = gender;
		this.hobby = hobby;
		this.birth = birth;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.introduce = introduce;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", gender=" + gender
				+ ", hobby=" + hobby + ", birth=" + birth + ", age=" + age + ", address=" + address + ", phone=" + phone
				+ ", introduce=" + introduce + ", getUserId()=" + getUserId() + ", getUserPwd()=" + getUserPwd()
				+ ", getUserName()=" + getUserName() + ", getGender()=" + getGender() + ", getHobby()=" + getHobby()
				+ ", getBirth()=" + getBirth() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + ", getIntroduce()=" + getIntroduce() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
