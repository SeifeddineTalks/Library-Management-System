package com.library.util;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateUtil {

    private static final int loanTime = 14;
    private static final double finePerDay = 0.5;

    private DateUtil(){

    }


    public static LocalDate calculateDueDate(){
        return LocalDate.now().plusDays(loanTime);
    }


    public static LocalDate calculateDueDate(LocalDate checkoutDate){
        return checkoutDate.plusDays(loanTime);
    }


    public static long daysOverdue(LocalDate dueDate){
        if (LocalDate.now().isAfter(dueDate)) {
            return ChronoUnit.DAYS.between(dueDate, LocalDate.now());
        } else {
            return 0;
        }
    }

    public static double calculateFine(LocalDate dueDate){
        return  daysOverdue(dueDate) * finePerDay;
    }
}
