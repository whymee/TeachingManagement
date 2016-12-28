package cqust.entity;

/**
 * @摘要 备课检查情况表实体
 * 
 */
public class LessonPreparationCheck {
	//备课检查情况表id
	private Integer id;
	//备课id
	private Integer lessonId;
	//接茬结果评价
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
	public Integer getLessonId() {
		return lessonId;
	}
	public void setLessonId(Integer lessonId) {
		this.lessonId = lessonId;
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
		return "LessonPreparationCheck [id=" + id + ", lessonId=" + lessonId + ", inspectionResultEvaluation="
				+ inspectionResultEvaluation + ", evaluationGrade=" + evaluationGrade + ", isEffective=" + isEffective
				+ "]";
	}
	public LessonPreparationCheck(Integer id, Integer lessonId, String inspectionResultEvaluation,
			String evaluationGrade, Integer isEffective) {
		super();
		this.id = id;
		this.lessonId = lessonId;
		this.inspectionResultEvaluation = inspectionResultEvaluation;
		this.evaluationGrade = evaluationGrade;
		this.isEffective = isEffective;
	}
	public LessonPreparationCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
