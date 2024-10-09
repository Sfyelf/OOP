public class StudentManagement {
    private Student[] students = new Student[100];
    private int count = 0; // Đếm số sinh viên đã thêm

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /** Them sinh vien.
     *
     *
     */
    public void addStudent(Student newStudent) {
        if (count < 100) {
            students[count] = newStudent;
            count++;
        }
    }

    /** Sap xep theo group.
     *
     * @return 123
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            boolean groupAppeared = false;
            for (int j = 0; j < i; j++) {
                if (students[i].getGroup().equals(students[j].getGroup())) {
                    groupAppeared = true;
                    break;
                }
            }
            if (!groupAppeared) {
                result.append(students[i].getGroup()).append("\n");
                for (int j = 0; j < count; j++) {
                    if (students[j].getGroup().equals(students[i].getGroup())) {
                        result.append(students[j].getInfo()).append("\n");
                    }
                }
            }
        }
        return result.toString();
    }

    /** Xoa sinh vien voi ma so la id.
     *
     *
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null; // Xóa sinh viên cuối cùng
                count--;
                break;
            }
        }
    }

    /** Kiem tra chuc nang.
     *
     *
     */
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        s1.setGroup("K62CC");

        Student s2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        s2.setGroup("K62CC");

        Student s3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        s3.setGroup("K62CB");

        Student s4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        s4.setGroup("K62CB");

        StudentManagement management = new StudentManagement();
        management.addStudent(s1);
        management.addStudent(s2);
        management.addStudent(s3);
        management.addStudent(s4);

        System.out.println("Danh sách sinh viên theo lớp:");
        System.out.println(management.studentsByGroup());

        System.out.println("S1 và S2 có cùng lớp không? " + StudentManagement.sameGroup(s1, s2));
        System.out.println("S1 và S3 có cùng lớp không? " + StudentManagement.sameGroup(s1, s3));

        management.removeStudent("17020002");
        System.out.println("Danh sách sinh viên sau khi xóa:");
        System.out.println(management.studentsByGroup());
    }
}