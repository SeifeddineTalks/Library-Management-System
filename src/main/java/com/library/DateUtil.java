package com.library;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateUtil {

    private static final int loanTime = 14;
    private static final double finePerDay = 0.5;

    private DateUtil(){

    }


    static LocalDate calculateDueDate(){
        return LocalDate.now().plusDays(loanTime);
    }


    static LocalDate calculateDueDate(LocalDate checkoutDate){
        return checkoutDate.plusDays(loanTime);
    }


    static long daysOverdue(LocalDate dueDate){
        if (LocalDate.now().isAfter(dueDate)) {
            return ChronoUnit.DAYS.between(dueDate, LocalDate.now());
        } else {
            return 0;
        }
    }


    static double calculateFine(LocalDate dueDate){
        return  daysOverdue(dueDate) * finePerDay;
    }

}
