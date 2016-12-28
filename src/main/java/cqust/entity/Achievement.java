package cqust.entity;

/**
 * @摘要 成绩表实体
 */
public class Achievement {
	
	//成绩表id
	private Integer id;
	//考试id
	private Integer examinationId;
	//考号
	private String examinationNumber;
	//学生姓名
	private String studentName;
	//学生班级
	private String studentClass;
	//学生年级
	private String studentGrade;
	//语文成绩
	private float chinese;
	//数学成绩
	private float math;
	//英语成绩
	private float english;
	//政治成绩
	private float politics;
	//历史成绩
	private float history;
	//地理成绩
	private float geography;
	//体育成绩
	private float sports;
	//美术成绩
	private float arts;
	//音乐成绩
	private float music;
	//物理成绩
	private float physics;
	//化学成绩
	private float chemistry;
	//生物成绩
	private float biology;
	//计算机成绩
	private float computer;
	//数据有效性
	private Integer isEffective;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getExaminationId() {
		return examinationId;
	}
	public void setExaminationId(Integer examinationId) {
		this.examinationId = examinationId;
	}
	public String getExaminationNumber() {
		return examinationNumber;
	}
	public void setExaminationNumber(String examinationNumber) {
		this.examinationNumber = examinationNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}
	public float getChinese() {
		return chinese;
	}
	public void setChinese(float chinese) {
		this.chinese = chinese;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getPolitics() {
		return politics;
	}
	public void setPolitics(float politics) {
		this.politics = politics;
	}
	public float getHistory() {
		return history;
	}
	public void setHistory(float history) {
		this.history = history;
	}
	public float getGeography() {
		return geography;
	}
	public void setGeography(float geography) {
		this.geography = geography;
	}
	public float getSports() {
		return sports;
	}
	public void setSports(float sports) {
		this.sports = sports;
	}
	public float getArts() {
		return arts;
	}
	public void setArts(float arts) {
		this.arts = arts;
	}
	public float getMusic() {
		return music;
	}
	public void setMusic(float music) {
		this.music = music;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
	public float getBiology() {
		return biology;
	}
	public void setBiology(float biology) {
		this.biology = biology;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float computer) {
		this.computer = computer;
	}
	public Integer getIsEffective() {
		return isEffective;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	@Override
	public String toString() {
		return "Achievement [id=" + id + ", examinationId=" + examinationId + ", examinationNumber=" + examinationNumber
				+ ", studentName=" + studentName + ", studentClass=" + studentClass + ", studentGrade=" + studentGrade
				+ ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", politics=" + politics
				+ ", history=" + history + ", geography=" + geography + ", sports=" + sports + ", arts=" + arts
				+ ", music=" + music + ", physics=" + physics + ", chemistry=" + chemistry + ", biology=" + biology
				+ ", computer=" + computer + ", isEffective=" + isEffective + "]";
	}
	public Achievement(Integer id, Integer examinationId, String examinationNumber, String studentName,
			String studentClass, String studentGrade, float chinese, float math, float english, float politics,
			float history, float geography, float sports, float arts, float music, float physics, float chemistry,
			float biology, float computer, Integer isEffective) {
		super();
		this.id = id;
		this.examinationId = examinationId;
		this.examinationNumber = examinationNumber;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentGrade = studentGrade;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.politics = politics;
		this.history = history;
		this.geography = geography;
		this.sports = sports;
		this.arts = arts;
		this.music = music;
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.computer = computer;
		this.isEffective = isEffective;
	}
	public Achievement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
