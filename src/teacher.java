
public class teacher {
    int teacherId;
    String teacherName;
    Department teacherDepartment;

    public teacher(int TeacherId,String TeacherName,Department TeacherDepartment) {
        teacherId = TeacherId;
        teacherName = TeacherName;
        teacherDepartment = TeacherDepartment;
        System.out.println("TeacherId" + " " + TeacherId);
        System.out.println("TeacherName" + " " + TeacherName);
        System.out.println("TeacherDepartment" + " " + TeacherDepartment);
    }
}
