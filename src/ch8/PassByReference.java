package ch8;

public class PassByReference {
	public static void main(String[] args) {		
		PassByReference reference = new PassByReference();
		reference.callPassByReference();
	}
	
	public void callPassByReference() {
		MemberDTO member = new MemberDTO("Sangmin");
		System.out.println("before passByReference");
		System.out.println("member.name = "+member.name);
		passByReference(member);
		System.out.println("after passByReference");
		System.out.println("member.name = "+member.name);
		
	}
	
	public void passByReference(MemberDTO member) {
		MemberDTO member2= member;
		member.name = "EUNMO";
		member2.name = "HONG";
		System.out.println("member.name = "+member.name);
		System.out.println("member2.name = "+member2.name);
//		member.name = "EUNMO";
//		System.out.println("in passByReference");
//		System.out.println("member.name = "+member.name);
	}
}

class MemberDTO{
	String name;
	MemberDTO(String name){
		this.name = name;
	}
}
