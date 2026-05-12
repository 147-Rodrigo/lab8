package org.example;

public class App {
    public static void main(String[] args) {

        ClassGroup group = new ClassGroup("Turma A");

        group.add(new Student("Ana", 2));
        group.add(new Student("Bruno", 5));
        group.add(new Student("Carlos", 1));
        group.add(new Student("Diana", 6));

        System.out.println("Antes da remoção:");
        System.out.println(group);

        // Remove estudantes com mais de 3 inscrições
        group.removeByEnrollments(3);

        System.out.println("\nDepois da remoção:");
        System.out.println(group);
    }
}