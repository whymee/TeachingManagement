package cqust.entity;

/**
 * @摘要 学困生表实体
 * 
 */
public class StudentsWithLearningDifficulties {
	//学困生id
	private Integer id;
	//学生id
	private Integer studentId;
	//学困原因
	private String reasonsForLearningDifficulties;
	//学困科目
	private String subjectForLearningDifficulties;
	//数据有效性
	private Integer isEffective;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getReasonsForLearningDifficulties() {
		return reasonsForLearningDifficulties;
	}
	public void setReasonsForLearningDifficulties(String reasonsForLearningDifficulties) {
		this.reasonsForLearningDifficulties = reasonsForLearningDifficulties;
	}
	public String getSubjectForLearningDifficulties() {
		return subjectForLearningDifficulties;
	}
	public void setSubjectForLearningDifficulties(String subjectForLearningDifficulties) {
		this.subjectForLearningDifficulties = subjectForLearningDifficulties;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	
	@Override
	public String toString() {
		return "StudentsWithLearningDifficulties [id=" + id + ", studentId=" + studentId
				+ ", reasonsForLearningDifficulties=" + reasonsForLearningDifficulties
				+ ", subjectForLearningDifficulties=" + subjectForLearningDifficulties + ", isEffective=" + isEffective
				+ "]";
	}
	
	public StudentsWithLearningDifficulties(Integer id, Integer studentId, String reasonsForLearningDifficulties,
			String subjectForLearningDifficulties, Integer isEffective) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.reasonsForLearningDifficulties = reasonsForLearningDifficulties;
		this.subjectForLearningDifficulties = subjectForLearningDifficulties;
		this.isEffective = isEffective;
	}
	
	public StudentsWithLearningDifficulties() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
