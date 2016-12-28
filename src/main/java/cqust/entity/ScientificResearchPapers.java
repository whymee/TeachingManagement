package cqust.entity;

/**
 * @摘要 科研论文表实体
 * 
 */
public class ScientificResearchPapers {
	//科研论文表id
	private Integer id;
	//教师id 
	private Integer teacherId;
	//论文题目
	private String thesisTopic;
	//发表日期
	private String publicTime;
	//论文类型
	private String thesisType;
	//所获奖项（如国家一等）
	private String awards;
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
	public String getThesisTopic() {
		return thesisTopic;
	}
	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	public String getPublicTime() {
		return publicTime;
	}
	public void setPublicTime(String publicTime) {
		this.publicTime = publicTime;
	}
	public String getThesisType() {
		return thesisType;
	}
	public void setThesisType(String thesisType) {
		this.thesisType = thesisType;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
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
		return "ScientificResearchPapers [id=" + id + ", teacherId=" + teacherId + ", thesisTopic=" + thesisTopic
				+ ", publicTime=" + publicTime + ", thesisType=" + thesisType + ", awards=" + awards + ", vouchers="
				+ vouchers + ", isAdditPassed=" + isAdditPassed + ", additOpinion=" + additOpinion + ", isEffective="
				+ isEffective + "]";
	}
	
	
	public ScientificResearchPapers(Integer id, Integer teacherId, String thesisTopic, String publicTime,
			String thesisType, String awards, String vouchers, Integer isAdditPassed, String additOpinion,
			Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.thesisTopic = thesisTopic;
		this.publicTime = publicTime;
		this.thesisType = thesisType;
		this.awards = awards;
		this.vouchers = vouchers;
		this.isAdditPassed = isAdditPassed;
		this.additOpinion = additOpinion;
		this.isEffective = isEffective;
	}
	
	
	public ScientificResearchPapers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
