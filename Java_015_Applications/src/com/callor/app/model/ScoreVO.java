package com.callor.app.model;
/*
 * 성적처리를 하기 위한 VO 클래스
 * 학번, 학생이름, 국어, 영어, 수학, 총점, 평균
 */
public class ScoreVO {

	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	
	private Integer total;
	private float avg;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getKor() {
		return kor;
	}
	public void setKor(Integer kor) {
		this.kor = kor;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getTotal() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		return sum;
	}
	
	public float getAvg() {
		Integer sum = this.kor;
		sum += this.eng;
		sum += this.math;
		
		float avg = (float)sum/3;
		return avg;
	}
	
	
	/*
	 * 재정의 (Alt + Shift + s => generate toString)
	 * 상속받을 클래스에 있는 method를
	 * 내맘대로 다시 만들어쓰기
	 * 
	 * 재활용
	 * toString() method는
	 * 		Object 클래스로부터 상속받은
	 * 		모든 클래스로 만든 객체에서 호출할 수 있다
	 * VO 클래스에서는 VO의 변수들에 담긴 값을
	 * 		확인하는 용도로 재정의하여 활용한다
	 */
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name 
				+ ", kor=" + kor + ", eng=" + eng 
				+ ", math=" + math + ", total=" + total 
				+ ", avg=" + avg + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
