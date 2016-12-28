package cqust.entity;

/**
 *@摘要 课程表实体
 * 
 */
public class Course {
	//课程id
	private Integer id;
	//教师id
	private Integer teacherId;
	//科目
	private String subject;
	//周几
	private Integer whichWeeks;
	//第几节
	private Integer whichCourse;
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
	public Integer getWhichWeeks() {
		return whichWeeks;
	}
	public void setWhichWeeks(Integer whichWeeks) {
		this.whichWeeks = whichWeeks;
	}
	public Integer getWhichCourse() {
		return whichCourse;
	}
	public void setWhichCourse(Integer whichCourse) {
		this.whichCourse = whichCourse;
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
		return "Course [id=" + id + ", teacherId=" + teacherId + ", subject=" + subject + ", whichWeeks=" + whichWeeks
				+ ", whichCourse=" + whichCourse + ", classes=" + classes + ", grade=" + grade + ", isEffective="
				+ isEffective + "]";
	}
	public Course(Integer id, Integer teacherId, String subject, Integer whichWeeks, Integer whichCourse,
			String classes, String grade, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.subject = subject;
		this.whichWeeks = whichWeeks;
		this.whichCourse = whichCourse;
		this.classes = classes;
		this.grade = grade;
		this.isEffective = isEffective;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
