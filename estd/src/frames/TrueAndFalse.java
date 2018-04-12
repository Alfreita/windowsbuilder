package frames;

public class TrueAndFalse {

	boolean var=true;

	public boolean isVar() {
		if(var==true){
			setVar(false);
		}else{
			setVar(true);
		}
		return var;
	}

	public void setVar(boolean var) {

		this.var = var;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (var ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrueAndFalse other = (TrueAndFalse) obj;
		if (var != other.var)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrueAndFalse [var=" + var + "]";
	}

}
