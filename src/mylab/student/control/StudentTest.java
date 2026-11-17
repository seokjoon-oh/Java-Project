package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradeException;

public class StudentTest {

    public static void main(String[] args) {

        try {
            Student student = new Student("20260001", "김민수", "컴퓨터공학", 3);
            // 오버라이딩 toString()을 이용해서 학생 정보 출력도 해보기
            System.out.println("오버라이딩 한 방법: "+ student); 
            
            System.out.println(student.getName() + " / " + student.getMajor() + " / " 
            +student.getGrade() + "학년");
            
            System.out.println("5학년으로 변경");
            student.setGrade(5);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }
}

