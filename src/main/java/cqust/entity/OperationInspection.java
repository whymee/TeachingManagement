package cqust.entity;

/**
 *@摘要 作业巡查表实体
 * 
 */
public class OperationInspection {
	//作业巡查表id
	private Integer id;
	//作业id
	private Integer taskId;
	//检查结果评价
	private String inspectionResultEvaluation;
	//评级等级
	private String evaluationGrade;
	//数据有效性
	private Integer isEffective;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
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
		return "OperationInspection [id=" + id + ", taskId=" + taskId + ", inspectionResultEvaluation="
				+ inspectionResultEvaluation + ", evaluationGrade=" + evaluationGrade + ", isEffective=" + isEffective
				+ "]";
	}
	public OperationInspection(Integer id, Integer taskId, String inspectionResultEvaluation, String evaluationGrade,
			Integer isEffective) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.inspectionResultEvaluation = inspectionResultEvaluation;
		this.evaluationGrade = evaluationGrade;
		this.isEffective = isEffective;
	}
	public OperationInspection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
