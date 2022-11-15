package org.training.design.patterns.temp.puzzle1;

public class PrinterRun {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                                    .withName("osman")
                                    .withSurname("yaycıoğlu")
                                    .withGender(EGender.MALE)
                                    .build();
        Printer printer = new Printer();
        printer.print(employee);

        Person person = Person.builder()
                             .withFullName("osman yaycıoğlu")
                             .withGender("male")
                             .build(); // Bu satırı değiştir ve çalışır hale getir

        printer.print(person);


    }
}
