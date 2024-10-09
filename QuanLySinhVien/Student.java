public class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    /** Khoi tao voi id, name, group, email.
     *
     * @param name a
     * @param id b
     * @param group c
     * @param email d
     */
    public Student(String name, String id, String group, String email) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.email = email;
    }

    /** Khoi tao.
     *
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /** Khoi tao voi name, id, email.
     *
     * @param name a
     * @param id b
     * @param email c
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        group = "K62CB";
        this.email = email;
    }

    /** Khoi tao sao chep.
     *
     * @param s s
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /** Tra ve thong tin.
     *
     * @return 123
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /** Chay thu main.
     *
     * @param args abc
     */
    public static void main(String[] args) {
        Student student1 = new Student("Nguyen Van An", "17020001", "K62CC", "17020001@vnu.edu.vn");

        System.out.println(student1.getInfo());
    }
}
