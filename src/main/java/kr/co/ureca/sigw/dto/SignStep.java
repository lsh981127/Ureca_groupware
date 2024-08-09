package kr.co.ureca.sigw.dto;

public enum SignStep {

	STEP_0("0"), // "0" : 본인상신만 한 단계
	STEP_1("1"), // "1" : 1번 결재자가 결재한 단계 
	STEP_2("2"), // "2" : 2번 결재자자 결재한 단계
	STEP_3("3"); // "3" : 3번 결재자자 결재한 단계
	
	private final String value;
    
	SignStep(String value){
        this.value = value;
    }
    
    public String getValue(){
        return value;
    }
}
