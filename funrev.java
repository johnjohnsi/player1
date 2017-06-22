package guvi;

 class funrev {
	String str="john";
	void display(){
		StringBuffer str2=new StringBuffer(str).reverse();
		System.out.println(str2);
	}
	public static void main(String[] args) {
	funrev f=new funrev();
	f.display();

	}

}
