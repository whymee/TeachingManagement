package cqust.entity;

/**
 * @摘要 优质课程竞赛表实体
 * 
 */
public class QualityClassCompetition {
	//优质竞赛表id
	private Integer id;
	//教师id
	private Integer teacherId;
	//竞赛日期
	private String time;
	//竞赛科目
	private String subject;
	//凭证资料
	private String vouchers;
	//所获奖项
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
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
		return "QualityClassCompetition [id=" + id + ", teacherId=" + teacherId + ", time=" + time + ", subject="
				+ subject + ", vouchers=" + vouchers + ", awards=" + awards + ", isAdditPassed=" + isAdditPassed
				+ ", additOpinion=" + additOpinion + ", isEffective=" + isEffective + "]";
	}
	public QualityClassCompetition(Integer id, Integer teacherId, String time, String subject, String vouchers,
			String awards, Integer isAdditPassed, String additOpinion, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.time = time;
		this.subject = subject;
		this.vouchers = vouchers;
		this.awards = awards;
		this.isAdditPassed = isAdditPassed;
		this.additOpinion = additOpinion;
		this.isEffective = isEffective;
	}
	public QualityClassCompetition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
