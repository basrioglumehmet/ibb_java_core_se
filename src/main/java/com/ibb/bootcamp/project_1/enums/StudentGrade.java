package com.ibb.bootcamp.project_1.enums;

public enum StudentGrade {

    AA(90, 100, "AA"),
    BB(80, 89, "BB"),
    CC(70, 79, "CC"),
    DD(60, 69, "DD"),
    EE(50, 59, "EE"),
    FF(0, 49, "FF");

    private final double min;
    private final double max;
    private final String text;

    StudentGrade(double min, double max, String text) {
        this.min = min;
        this.max = max;
        this.text = text;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public String getText() {
        return text;
    }

    public static StudentGrade fromScore(double score) {
        for (StudentGrade grade : values()) {
            if (score >= grade.min && score <= grade.max) {
                return grade;
            }
        }
        return null; // Geçersiz not
    }
}
