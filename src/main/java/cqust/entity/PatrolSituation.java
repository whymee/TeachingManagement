package cqust.entity;

/**
 * @摘要 巡课情况表实体
 * 
 */
public class PatrolSituation {
	//巡课情况表id
	private Integer id;
	//课程id
	private Integer courseId;
	//检查结果评价
	private String inspectionResultEvaluation;
	//评价等级
	private String evaluationGrade;
	//数据有效性
	private Integer isEffective;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getInspectionResultEvaluation() {
		return inspectionResultEvaluation;
	}
	public void setInspectionResultEvaluation(String inspectionResultEvaluation) {
		this.inspectionResultEvaluation = inspectionResultEvaluation;
	}
	public String getEvaluationGrade() {
		return evaluationGrade;
	}
	public void setEvaluationGrade(String evaluationGrade) {
		this.evaluationGrade = evaluationGrade;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "PatrolSituation [id=" + id + ", courseId=" + courseId + ", inspectionResultEvaluation="
				+ inspectionResultEvaluation + ", evaluationGrade=" + evaluationGrade + ", isEffective=" + isEffective
				+ "]";
	}
	public PatrolSituation(Integer id, Integer courseId, String inspectionResultEvaluation, String evaluationGrade,
			Integer isEffective) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.inspectionResultEvaluation = inspectionResultEvaluation;
		this.evaluationGrade = evaluationGrade;
		this.isEffective = isEffective;
	}
	public PatrolSituation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
