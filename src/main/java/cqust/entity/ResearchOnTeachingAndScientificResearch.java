package cqust.entity;

/**
 * @摘要 教学科研课题研究表实体
 * 
 */
public class ResearchOnTeachingAndScientificResearch {
	//教学科研课题研究表id
	private Integer id;
	//教师id
	private Integer teacherId;
	//凭证资料
	private String vouchers;
	//教学科研课题研究题目
	private String topic;
	//研究起始日期
	private String startTime;
	//研究结束日期
	private String endTime;
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
	public String getVouchers() {
		return vouchers;
	}
	public void setVouchers(String vouchers) {
		this.vouchers = vouchers;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
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
		return "ResearchOnTeachingAndScientificResearch [id=" + id + ", teacherId=" + teacherId + ", vouchers="
				+ vouchers + ", topic=" + topic + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", isAdditPassed=" + isAdditPassed + ", additOpinion=" + additOpinion + ", isEffective=" + isEffective
				+ "]";
	}
	public ResearchOnTeachingAndScientificResearch(Integer id, Integer teacherId, String vouchers, String topic,
			String startTime, String endTime, Integer isAdditPassed, String additOpinion, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.vouchers = vouchers;
		this.topic = topic;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isAdditPassed = isAdditPassed;
		this.additOpinion = additOpinion;
		this.isEffective = isEffective;
	}
	public ResearchOnTeachingAndScientificResearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
