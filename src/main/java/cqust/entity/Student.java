package cqust.entity;

/**
 *@摘要  学生表实体
 * 
 */
public class Student {
	//学生表id
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//学校账户
	private Integer schoolId;
	//姓名
	private String name;
	//性别
	private String sex;
	//年龄
	private Integer age;
	//家庭住址
	private String homeAddress;
	//邮箱
	private String email;
	//
	private String qq;
	//班级
	private String classes;
	//年级
	private String grade;
	//家长姓名
	private String parentName;
	//家长联系电话
	private String parentPhoneNumber;
	//政治面貌
	private String politicalLandscape;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentPhoneNumber() {
		return parentPhoneNumber;
	}
	public void setParentPhoneNumber(String parentPhoneNumber) {
		this.parentPhoneNumber = parentPhoneNumber;
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
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", password=" + password + ", schoolId=" + schoolId
				+ ", name=" + name + ", sex=" + sex + ", age=" + age + ", homeAddress=" + homeAddress + ", email="
				+ email + ", qq=" + qq + ", classes=" + classes + ", grade=" + grade + ", parentName=" + parentName
				+ ", parentPhoneNumber=" + parentPhoneNumber + ", politicalLandscape=" + politicalLandscape
				+ ", headPortrait=" + headPortrait + ", isEffective=" + isEffective + "]";
	}
	
	
	public Student(Integer id, String userName, String password, Integer schoolId, String name, String sex, Integer age,
			String homeAddress, String email, String qq, String classes, String grade, String parentName,
			String parentPhoneNumber, String politicalLandscape, String headPortrait, Integer isEffective) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.schoolId = schoolId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.homeAddress = homeAddress;
		this.email = email;
		this.qq = qq;
		this.classes = classes;
		this.grade = grade;
		this.parentName = parentName;
		this.parentPhoneNumber = parentPhoneNumber;
		this.politicalLandscape = politicalLandscape;
		this.headPortrait = headPortrait;
		this.isEffective = isEffective;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
