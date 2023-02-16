package chap05_example;

public class Course {
	//상수는 미리 값을 할당해놓고 사용
    private int cNo;
    private String cName;
    private int cScore;
    private String cMAJOR;
	
    //기본생성자
    public Course() {
    	cNo=1;
    	cName = "자바";
    	cScore = 3;
    	
    }
    
    //매개변수인 cNo과 멤버변수 cNo은 다른 변수다.
    //매개변수 cNo은 생성자 함수를 호출했을 때 보내주는 값을 받기 위한 변수
    public Course(int cNo) {
    	//this 객체 : 현재 속해있는 클래스를 지칭
    	//매개변수로 받아온 cNo과 멤버변수 cNo을 확실하게 구분하기 위해서 this 사용
    	this.cNo = cNo;
    }
    
    public Course(int cNo, String cName) {
    	this.cNo = cNo;
    	this.cName = cName;
    	
    }
    
    public Course(int cNo, String cName, int cScore) {
    	//Course의 생성자 호출
    	//매개변수가 두 개인 생성자에서 cNo, cName 속성을 초기화 해주기 때문에
    	//현재 생성자에서 따로 cNo, cName에 대한 초기화 작업이 필요가 없어짐
    	this(cNo, cName); //Course 생성자 호출
    	
    	this.cNo = cNo;
    	this.cName = cName;
    	this.cScore = cScore;
    }
    
    
    
    public String getcMAJOR() {
		return cMAJOR;
	}

	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcScore() {
		return cScore;
	}
	public void setcScore(int cScore) {
		this.cScore = cScore;
	}
   
}
