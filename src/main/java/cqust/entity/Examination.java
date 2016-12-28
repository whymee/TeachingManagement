package cqust.entity;

/**
 * @摘要 考试表实体
 * 
 */
public class Examination {

	//考试表id
	private Integer id;
	//考试日期
	private String examinationTime;
	//考试代号
	private String examinationCode;
	//考试班级
	private String examinationClass;
	//考试年级
	private String examinationGrade;
	//数据有效性
	private Integer isEffective;
	//学校账户
	private Integer schoolId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getExaminationTime() {
		return examinationTime;
	}
	public void setExaminationTime(String examinationTime) {
		this.examinationTime = examinationTime;
	}
	public String getExaminationCode() {
		return examinationCode;
	}
	public void setExaminationCode(String examinationCode) {
		this.examinationCode = examinationCode;
	}
	public String getExaminationClass() {
		return examinationClass;
	}
	public void setExaminationClass(String examinationClass) {
		this.examinationClass = examinationClass;
	}
	public String getExaminationGrade() {
		return examinationGrade;
	}
	public void setExaminationGrade(String examinationGrade) {
		this.examinationGrade = examinationGrade;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	@Override
	public String toString() {
		return "Examination [id=" + id + ", examinationTime=" + examinationTime + ", examinationCode=" + examinationCode
				+ ", examinationClass=" + examinationClass + ", examinationGrade=" + examinationGrade + ", isEffective="
				+ isEffective + ", schoolId=" + schoolId + "]";
	}
	public Examination(Integer id, String examinationTime, String examinationCode, String examinationClass,
			String examinationGrade, Integer isEffective, Integer schoolId) {
		super();
		this.id = id;
		this.examinationTime = examinationTime;
		this.examinationCode = examinationCode;
		this.examinationClass = examinationClass;
		this.examinationGrade = examinationGrade;
		this.isEffective = isEffective;
		this.schoolId = schoolId;
	}
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
