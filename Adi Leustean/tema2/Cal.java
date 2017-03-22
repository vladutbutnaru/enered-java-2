public class Cal extends Animal implements Callable {

	private String prop;
	private String prop1;

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	@Override
	public void call() {
		System.out.println("^~^");
		System.out.println(getVorbeste());
		System.out.println();
	}

}
