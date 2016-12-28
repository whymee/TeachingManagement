package cqust.entity;

/**
 *@摘要 教导处表实体
 * 
 */
public class TeachingOffice {
	//教导处表id
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//学校账户id
	private Integer schoolId;
	//联系电话（教导处负责人）
	private String telephoneNumber;
	//座机号码
	private String contactNumber;
	//教导处邮箱
	private String teachingOfficeEmail;
	//头像
	private String headPortrait;
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
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTeachingOfficeEmail() {
		return teachingOfficeEmail;
	}
	public void setTeachingOfficeEmail(String teachingOfficeEmail) {
		this.teachingOfficeEmail = teachingOfficeEmail;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	
	@Override
	public String toString() {
		return "TeachingOffice [id=" + id + ", userName=" + userName + ", password=" + password + ", schoolId="
				+ schoolId + ", telephoneNumber=" + telephoneNumber + ", contactNumber=" + contactNumber
				+ ", teachingOfficeEmail=" + teachingOfficeEmail + ", headPortrait=" + headPortrait + ", isEffective="
				+ isEffective + "]";
	}
	
	public TeachingOffice(Integer id, String userName, String password, Integer schoolId, String telephoneNumber,
			String contactNumber, String teachingOfficeEmail, String headPortrait, Integer isEffective) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.schoolId = schoolId;
		this.telephoneNumber = telephoneNumber;
		this.contactNumber = contactNumber;
		this.teachingOfficeEmail = teachingOfficeEmail;
		this.headPortrait = headPortrait;
		this.isEffective = isEffective;
	}
	
	public TeachingOffice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
