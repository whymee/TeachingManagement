package cqust.entity;

/**
 * @摘要 公告表实体
 */
public class Announcement {
	//公告id
	private Integer id;
	//学校账户
	private Integer schoolId;
	//发表单位
	private String publicUnit;
	//发表时间
	private String publicTime;
	//题目
	private String title;
	//内容
	private String content;
	//数据是否有效
	private Integer isEffective;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public String getPublicUnit() {
		return publicUnit;
	}
	public void setPublicUnit(String publicUnit) {
		this.publicUnit = publicUnit;
	}
	public String getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(String publicTime) {
		this.publicTime = publicTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "Announcement [id=" + id + ", schoolId=" + schoolId + ", publicUnit=" + publicUnit + ", publicTime="
				+ publicTime + ", title=" + title + ", content=" + content + ", isEffective=" + isEffective + "]";
	}
	public Announcement(Integer id, Integer schoolId, String publicUnit, String publicTime, String title,
			String content, Integer isEffective) {
		super();
		this.id = id;
		this.schoolId = schoolId;
		this.publicUnit = publicUnit;
		this.publicTime = publicTime;
		this.title = title;
		this.content = content;
		this.isEffective = isEffective;
	}
	public Announcement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
