package practice08;

public class Teacher extends Person {

	private Klass klass;
	private boolean haveKlass;

	public Teacher(int id, String name, int age) {
		super(id, name, age);
		this.haveKlass = false;
	}

	public Teacher(int id, String name, int age, Klass klass) {
		super(id, name, age);
		this.klass = klass;
		this.haveKlass = true;
	}

	@Override
	public String introduce() {
		return String.format(super.introduce() + " I am a Teacher. I teach %s.", getKlassDisplayName());
	}

	public String introduceWith(Student student) {
		String isTeachStudentStr = isTeaching(student) ?
				" I teach " + student.getName() + "." :
				" I don't teach " + student.getName() + ".";
		return String.format(super.introduce() + " I am a Teacher.%s",
				isTeachStudentStr);
	}

	public String getKlassDisplayName() {
		if (this.haveKlass) {
			return this.klass.getDisplayName();
		}
		return "No Class";
	}

	public boolean isTeaching(Student student) {
		if (this.klass.getDisplayName().equals(student.getKlassName())) {
			return true;
		}
		return false;
	}

	public Klass getKlass() {
		return klass;
	}

	public void setKlass(Klass klass) {
		this.klass = klass;
	}

	public boolean isHaveKlass() {
		return haveKlass;
	}

	public void setHaveKlass(boolean haveKlass) {
		this.haveKlass = haveKlass;
	}
}
