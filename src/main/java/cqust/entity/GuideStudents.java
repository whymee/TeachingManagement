package cqust.entity;

/**
 * @摘要 指导学生表实体
 * 
 */
public class GuideStudents {
	//指导学生表id
	private Integer id;
	//教师id
	private Integer teacherId;
	//指导内容
	private String guideContent;
	//起始时间
	private String startTime;
	//结束时间
	private String endTime;
	//凭证资料
	private String vouchers;
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
	public String getGuideContent() {
		return guideContent;
	}
	public void setGuideContent(String guideContent) {
		this.guideContent = guideContent;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getVouchers() {
		return vouchers;
	}
	public void setVouchers(String vouchers) {
		this.vouchers = vouchers;
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
		return "GuideStudents [id=" + id + ", teacherId=" + teacherId + ", guideContent=" + guideContent
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", vouchers=" + vouchers + ", isAdditPassed="
				+ isAdditPassed + ", additOpinion=" + additOpinion + ", isEffective=" + isEffective + "]";
	}
	public GuideStudents(Integer id, Integer teacherId, String guideContent, String startTime, String endTime,
			String vouchers, Integer isAdditPassed, String additOpinion, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.guideContent = guideContent;
		this.startTime = startTime;
		this.endTime = endTime;
		this.vouchers = vouchers;
		this.isAdditPassed = isAdditPassed;
		this.additOpinion = additOpinion;
		this.isEffective = isEffective;
	}
	public GuideStudents() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
