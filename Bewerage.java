class Bewerage {

	private String name, weight, packageType;

	public Bewerage(String name, String weight, String packageType) {
		this.weight = weight;
		this.packageType = packageType;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "   вес  " + weight + ",   упаковка: " + packageType
				+ "\n";
	}
}
