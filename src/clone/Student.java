package clone;

public class Student implements Cloneable{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    private String name;
    private Teacher teacher;

    protected Student clone() {
        Student s = null;
        try {
            s = (Student)super.clone();
            s.setTeacher(s.getTeacher());
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("YAO");
        s1.setTeacher(new Teacher("kobe"));

        // Student s2 = s1.clone(); 这一句呢 s2 的改变是影响不了 s1 的值的
        Student s2 = s1; // 这一句呢 s2 的改变会改变 s1 的值
        System.out.println(s2.name + "    " + s2.getTeacher().getName()); // 这一步会发现s2和s1的属性都是一模一样的

        s2.setTeacher(new Teacher("dameng"));
        s2.setName("AAA");
        System.out.println(s1.name + "    " + s1.getTeacher().getName());
        System.out.println(s2.name + "    " + s2.getTeacher().getName());
    }
}
