package cqust.entity;

/**
 * @摘要 超级管理员表实体
 * 
 */
public class SuperManager {
	//超级管理员表id
	private Integer id;
	//用户名
	private String userName;
	//密码
	private String password;
	//头像
	private String headPortrait;
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
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	@Override
	public String toString() {
		return "SuperManager [id=" + id + ", userName=" + userName + ", password=" + password + ", headPortrait="
				+ headPortrait + "]";
	}
	public SuperManager(Integer id, String userName, String password, String headPortrait) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.headPortrait = headPortrait;
	}
	public SuperManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
