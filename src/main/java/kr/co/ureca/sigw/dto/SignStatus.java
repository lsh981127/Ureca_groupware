package kr.co.ureca.sigw.dto;

public enum SignStatus {
	
	PRGS(0), // 진행
	APRO(1), // 승인 
	RJCT(2); // 반려 
	
	private final int value;
    
	SignStatus(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
   	
}
