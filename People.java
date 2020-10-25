package LX2;
public class People {
	String id;
	String name;
	String sex;

	People(String id, String name,String sex) {
		setId(id);
		setName(name);
		setSex(sex);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}
}
