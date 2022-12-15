import stream.classes.Student;
import stream.enums.Gender;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Asi", "Asianova", BigDecimal.valueOf(1000), 20, Gender.FEMALE);
        Student student2 = new Student("Nik", "Nika", BigDecimal.valueOf(1200), 21, Gender.MALE);
        Student student3 = new Student("Alex", "Alexi", BigDecimal.valueOf(1500), 22, Gender.MALE);
        Student student4 = new Student("Nazi", "Nazimova", BigDecimal.valueOf(2000), 24, Gender.FEMALE);
        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4));
        System.out.println("""
                1.aty 'A' mn bashtalgan studenterdi chigariniz!
                2.Jashi 15ten chon jana akchasin chigarini!
                3.En kop akchasin barlar chiksin!
                4.En kop akchasin bar kizdi chiksin!
                5.Bardik studenterdin atyn chigar!
                6.Bardik studenterdin akchasina 1000 kosh!
                7.Birinchi studentin atyn chigar!
                8.Kancha student bar chigar!
              
                """);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (true) {
            switch (num) {

                case 1 -> {
                    List<Student> studentList1 = studentList.stream().filter(student -> student.getFirsName().contains("A")).toList();
                    System.out.println(studentList1);
                }
                case 2 -> studentList.stream().filter(student -> student.getAge() > 18 && student.getMoney().intValue() > 1200).forEach(System.out::println);
               case 3-> {
                   Student student = studentList.stream().max(Comparator.comparing(Student::getMoney)).orElseThrow();
                   System.out.println(student);
               }
            case 4-> System.out.println(studentList.stream().filter(student5 -> student5.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Student::getMoney)).orElseThrow());
           case 5-> System.out.println(studentList.stream().map(Student::getFirsName).toList());
           case 6 -> studentList.stream().map(student5 -> student5.getMoney().add(new BigDecimal(1000))).forEach(System.out::println);
            case 7-> System.out.println(studentList.stream().findFirst().map(Student::getFirsName).orElseThrow());
            case 8->System.out.println(studentList.stream().map(Student::toString).count());
            case 9-> System.out.println(studentList.stream().map(Student::getMoney).sorted());
            }
    }
//        List<Student> girls = new ArrayList<>();
//        for (Student student : students) {
//            if (student.getGender().equals(Gender.FEMALE)) {
//                girls.add(student);
            }

        }
        //  girls.forEach(System.out::println);

//        List<Student> female = students.stream()
//
//                .filter(student -> student.getGender().equals(Gender.FEMALE))
//                .collect(Collectors.toList());
//       // female.forEach(System.out::println);
//        List<Student>girlslamda=new ArrayList<>();k
//        Predicate<Student>studentPredicate=student -> student.getGender().equals(Gender.FEMALE);
//        for (Student student : students) {
//            if(studentPredicate.test(student)){
//                girlslamda.add(student);
//            }
//        }
//        girlslamda.forEach(System.out::println);
 //   }
//}