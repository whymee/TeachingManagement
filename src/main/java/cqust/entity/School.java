package cqust.entity;

/**
 * @摘要 学校账户表实体
 * 
 */
public class School {
	//学校账户表id
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//学校名称
	private String schoolName;
	//学校编号
	private String schoolNumber;
	//注册时间
	private String registrationTime;
	//有效期至
	private String validPeriod;
	//学校地址
	private String schoolAddress;
	//学校邮箱
	private String schoolEmail;
	//联系电话（座机）
	private String contactNumber;
	//联系电话（负责人）
	private String telephoneNumber;
	//学校标志图
	private String schoolPicture;
	//校长名字
	private String principal;
	//数据有效性
	private Integer isEffective;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public String getRegistrationTime() {
		return registrationTime;
	}
	public void setRegistrationTime(String registrationTime) {
		this.registrationTime = registrationTime;
	}
	public String getValidPeriod() {
		return validPeriod;
	}
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolEmail() {
		return schoolEmail;
	}
	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getSchoolPicture() {
		return schoolPicture;
	}
	public void setSchoolPicture(String schoolPicture) {
		this.schoolPicture = schoolPicture;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	
	
	@Override
	public String toString() {
		return "School [id=" + id + ", userName=" + userName + ", password=" + password + ", schoolName=" + schoolName
				+ ", schoolNumber=" + schoolNumber + ", registrationTime=" + registrationTime + ", validPeriod="
				+ validPeriod + ", schoolAddress=" + schoolAddress + ", schoolEmail=" + schoolEmail + ", contactNumber="
				+ contactNumber + ", telephoneNumber=" + telephoneNumber + ", schoolPicture=" + schoolPicture
				+ ", principal=" + principal + ", isEffective=" + isEffective + "]";
	}
	
	
	public School(Integer id, String userName, String password, String schoolName, String schoolNumber,
			String registrationTime, String validPeriod, String schoolAddress, String schoolEmail, String contactNumber,
			String telephoneNumber, String schoolPicture, String principal, Integer isEffective) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.schoolName = schoolName;
		this.schoolNumber = schoolNumber;
		this.registrationTime = registrationTime;
		this.validPeriod = validPeriod;
		this.schoolAddress = schoolAddress;
		this.schoolEmail = schoolEmail;
		this.contactNumber = contactNumber;
		this.telephoneNumber = telephoneNumber;
		this.schoolPicture = schoolPicture;
		this.principal = principal;
		this.isEffective = isEffective;
	}
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
