package cqust.entity;

/**
 * @摘要 其他教研成果表实体
 * 
 */
public class OtherTeachingAndResearchAchievements {
	//其他教研表id
	private Integer id;
	//教师id
	private Integer teacherId;
	//教研成果内容
	private String content;
	//时间
	private String time;
	//凭证资料
	private String vouchers;
	//获奖情况
	private String awards;
	//审核是否通过
	private Integer isAdditPassed;
	//审核意见
	private String additOpinion;
	//数据有效性
	private Integer isEffective;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getVouchers() {
		return vouchers;
	}
	public void setVouchers(String vouchers) {
		this.vouchers = vouchers;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public Integer getIsAdditPassed() {
		return isAdditPassed;
	}
	public void setIsAdditPassed(Integer isAdditPassed) {
		this.isAdditPassed = isAdditPassed;
	}
	public String getAdditOpinion() {
		return additOpinion;
	}
	public void setAdditOpinion(String additOpinion) {
		this.additOpinion = additOpinion;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "OtherTeachingAndResearchAchievements [id=" + id + ", teacherId=" + teacherId + ", content=" + content
				+ ", time=" + time + ", vouchers=" + vouchers + ", awards=" + awards + ", isAdditPassed="
				+ isAdditPassed + ", additOpinion=" + additOpinion + ", isEffective=" + isEffective + "]";
	}
	public OtherTeachingAndResearchAchievements(Integer id, Integer teacherId, String content, String time,
			String vouchers, String awards, Integer isAdditPassed, String additOpinion, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.content = content;
		this.time = time;
		this.vouchers = vouchers;
		this.awards = awards;
		this.isAdditPassed = isAdditPassed;
		this.additOpinion = additOpinion;
		this.isEffective = isEffective;
	}
	public OtherTeachingAndResearchAchievements() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
