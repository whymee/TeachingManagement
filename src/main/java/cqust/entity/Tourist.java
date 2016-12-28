package cqust.entity;

/**
 * @摘要 游客表实体
 * 
 */
public class Tourist {
	//游客表id
	private Integer id;
	//用户名	
	private String userName;
	//密码	
	private String password;
	//联系电话
	private String contactNumber;
	//
	private String qq;
	//邮箱
	private String email;
	//姓名
	private String name;
	//头像
	private String headPortrait;
	//政治面貌
	private String politicalLandscape;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public String getPoliticalLandscape() {
		return politicalLandscape;
	}
	public void setPoliticalLandscape(String politicalLandscape) {
		this.politicalLandscape = politicalLandscape;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", userName=" + userName + ", password=" + password + ", contactNumber="
				+ contactNumber + ", qq=" + qq + ", email=" + email + ", name=" + name + ", headPortrait="
				+ headPortrait + ", politicalLandscape=" + politicalLandscape + ", isEffective=" + isEffective + "]";
	}
	
	public Tourist(Integer id, String userName, String password, String contactNumber, String qq, String email,
			String name, String headPortrait, String politicalLandscape, Integer isEffective) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.contactNumber = contactNumber;
		this.qq = qq;
		this.email = email;
		this.name = name;
		this.headPortrait = headPortrait;
		this.politicalLandscape = politicalLandscape;
		this.isEffective = isEffective;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
