package cqust.entity;

/**
 * @摘要 作业表实体
 * 
 */
public class Task {
	//作业表id
	private Integer id;
	//教师
	private Integer teacherId;
	//科目
	private String subject;
	//布置日期
	private String layoutTime;
	//作业内容
	private String taskContent;
	//批改情况（百分比）
	private String correctingTheSituation;
	//学生完成情况（百分比）
	private String studentsCompletedTheSituation;
	//班级
	private String classes;
	//年级
	private String grade;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLayoutTime() {
		return layoutTime;
	}
	public void setLayoutTime(String layoutTime) {
		this.layoutTime = layoutTime;
	}
	public String getTaskContent() {
		return taskContent;
	}
	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
	}
	public String getCorrectingTheSituation() {
		return correctingTheSituation;
	}
	public void setCorrectingTheSituation(String correctingTheSituation) {
		this.correctingTheSituation = correctingTheSituation;
	}
	public String getStudentsCompletedTheSituation() {
		return studentsCompletedTheSituation;
	}
	public void setStudentsCompletedTheSituation(String studentsCompletedTheSituation) {
		this.studentsCompletedTheSituation = studentsCompletedTheSituation;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", teacherId=" + teacherId + ", subject=" + subject + ", layoutTime=" + layoutTime
				+ ", taskContent=" + taskContent + ", correctingTheSituation=" + correctingTheSituation
				+ ", studentsCompletedTheSituation=" + studentsCompletedTheSituation + ", classes=" + classes
				+ ", grade=" + grade + ", isEffective=" + isEffective + "]";
	}
	public Task(Integer id, Integer teacherId, String subject, String layoutTime, String taskContent,
			String correctingTheSituation, String studentsCompletedTheSituation, String classes, String grade,
			Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.subject = subject;
		this.layoutTime = layoutTime;
		this.taskContent = taskContent;
		this.correctingTheSituation = correctingTheSituation;
		this.studentsCompletedTheSituation = studentsCompletedTheSituation;
		this.classes = classes;
		this.grade = grade;
		this.isEffective = isEffective;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
