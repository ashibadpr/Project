package Encapsulation;

public class facebookpwd {
	private String pwd="Facebook@123";
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd=pwd;
	}
}
 class Facebook{
	public static void main(String[] args) {
		facebookpwd fbp=new facebookpwd();
		System.out.println(fbp.getpwd());
		fbp.setpwd("Facebook@1234");
		System.out.println(fbp.getpwd());
	}
}
