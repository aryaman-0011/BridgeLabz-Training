package com.objectmodelling.objectandsequence;

class GradeCalculator {

    char calculateGrade(Student student) {
        int total = 0;

        for (Subject s : student.getSubjects()) {
            total += s.getMarks();
        }

        int average = total / student.getSubjects().size();

        if (average >= 90) return 'A';
        else if (average >= 75) return 'B';
        else if (average >= 60) return 'C';
        else return 'D';
    }
}
