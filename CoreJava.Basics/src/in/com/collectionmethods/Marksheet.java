package in.com.collectionmethods;

public class Marksheet implements Comparable<Marksheet>  {

	private String roolno;
	private String fname;
	private int Physics;
	private int Chemistry;
	private int maths;
	
	public static void main(String[] args) {
	
	}
      public String getRoolno() {
		return roolno;
	}
     public void setRoolno(String roolno ) {
		this.roolno = roolno;
	}
     public int getPhysics() {
		return Physics;
	}
     public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getChemistry() {
		return Chemistry;
	}
	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}
	@Override
	public int compareTo(Marksheet m) {
		// TODO Auto-generated method stub
		return this.roolno.compareTo(m.roolno);
	}
  
}
