package Java.Home.Key.april.service.model;

public class ScoreVO {
	
	private String num;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer soc;
	private Integer sci;
	
	private Integer total;
	private Float avg;
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
	public Integer getSoc() {
		return soc;
	}
	public void setSoc(Integer soc) {
		this.soc = soc;
	}
	public Integer getSci() {
		return sci;
	}
	public void setSci(Integer sci) {
		this.sci = sci;
	}
	public Integer getTotal() {
	Integer total = this.kor + this.eng + this.math + this.soc + this.sci;
		return total;
	}
	
	public Float getAvg() {
		Float avg = (float)this.getTotal()/3;
		return avg;
	}
	
	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", soc="
				+ soc + ", sci=" + sci + ", total=" + this.getTotal() + ", avg=" + this.getAvg() + "]";
	}
	
	
	
	
	
}
