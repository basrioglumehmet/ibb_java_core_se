package com.ibb.bootcamp.project_1.enums;

public enum Status {
    PASS,
    RETENTION,
    CONDITIONAL_PASS;

    public static Status fromScore(double score){
        if(score >= 50) return PASS;
        else if(score < 50 && score > 30) return CONDITIONAL_PASS;
        return RETENTION;
    }
}
