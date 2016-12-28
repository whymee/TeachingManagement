package cqust.entity;

/**
 *@摘要 教师表实体
 * 
 */
public class Teacher {
	//教师表id
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//学校账户
	private Integer schoolId;
	//联系电话
	private String contactNumber;
	//qq
	private String qq;
	//邮箱
	private String email;
	//家庭住址
	private String homeAddress;
	//性别
	private String sex;
	//年龄
	private Integer age;
	//姓名
	private String name;
	//所授科目
	private String subjectsGranted;
	//职称
	private String technicalTitle;
	//所授班级
	private String teachingClass;
	//政治面貌
	private String politicalLandscape;
	//头像
	private String headPortrait;
	//生日
	private String birthday;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubjectsGranted() {
		return subjectsGranted;
	}
	public void setSubjectsGranted(String subjectsGranted) {
		this.subjectsGranted = subjectsGranted;
	}
	public String getTechnicalTitle() {
		return technicalTitle;
	}
	public void setTechnicalTitle(String technicalTitle) {
		this.technicalTitle = technicalTitle;
	}
	public String getTeachingClass() {
		return teachingClass;
	}
	public void setTeachingClass(String teachingClass) {
		this.teachingClass = teachingClass;
	}
	public String getPoliticalLandscape() {
		return politicalLandscape;
	}
	public void setPoliticalLandscape(String politicalLandscape) {
		this.politicalLandscape = politicalLandscape;
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
	
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	public Teacher(Integer id, String userName, String password, Integer schoolId, String contactNumber, String qq,
			String email, String homeAddress, String sex, Integer age, String name, String subjectsGranted,
			String technicalTitle, String teachingClass, String politicalLandscape, String headPortrait,
			String birthday, Integer isEffective) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.schoolId = schoolId;
		this.contactNumber = contactNumber;
		this.qq = qq;
		this.email = email;
		this.homeAddress = homeAddress;
		this.sex = sex;
		this.age = age;
		this.name = name;
		this.subjectsGranted = subjectsGranted;
		this.technicalTitle = technicalTitle;
		this.teachingClass = teachingClass;
		this.politicalLandscape = politicalLandscape;
		this.headPortrait = headPortrait;
		this.birthday = birthday;
		this.isEffective = isEffective;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
