package cqust.entity;

/**
 * @摘要 备课表实体
 * 
 */
public class Lesson {
	//备课表id
	private Integer id;
	//教师id
	private Integer teacherId;
	//备课时间
	private String lessonTime;
	//备课内容
	private String lessonContent;
	//备课班级
	private String lessonClass;
	//备课年级
	private String lessonGrade;
	//备课文件地址
	private String lessonFileAddress;
	//目的课程
	private Integer courseId;
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
	public String getLessonTime() {
		return lessonTime;
	}
	public void setLessonTime(String lessonTime) {
		this.lessonTime = lessonTime;
	}
	public String getLessonContent() {
		return lessonContent;
	}
	public void setLessonContent(String lessonContent) {
		this.lessonContent = lessonContent;
	}
	public String getLessonClass() {
		return lessonClass;
	}
	public void setLessonClass(String lessonClass) {
		this.lessonClass = lessonClass;
	}
	public String getLessonGrade() {
		return lessonGrade;
	}
	public void setLessonGrade(String lessonGrade) {
		this.lessonGrade = lessonGrade;
	}
	public String getLessonFileAddress() {
		return lessonFileAddress;
	}
	public void setLessonFileAddress(String lessonFileAddress) {
		this.lessonFileAddress = lessonFileAddress;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "Lesson [id=" + id + ", teacherId=" + teacherId + ", lessonTime=" + lessonTime + ", lessonContent="
				+ lessonContent + ", lessonClass=" + lessonClass + ", lessonGrade=" + lessonGrade
				+ ", lessonFileAddress=" + lessonFileAddress + ", courseId=" + courseId + ", isEffective=" + isEffective
				+ "]";
	}
	public Lesson(Integer id, Integer teacherId, String lessonTime, String lessonContent, String lessonClass,
			String lessonGrade, String lessonFileAddress, Integer courseId, Integer isEffective) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.lessonTime = lessonTime;
		this.lessonContent = lessonContent;
		this.lessonClass = lessonClass;
		this.lessonGrade = lessonGrade;
		this.lessonFileAddress = lessonFileAddress;
		this.courseId = courseId;
		this.isEffective = isEffective;
	}
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
