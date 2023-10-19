package org.example.problem2.bitManipulation;

import java.time.LocalDate;
import java.time.LocalTime;

public class BitField1 {

    public static int LOG_TIME = 1;   // 0001
    public static int LOG_DATE = 2;   // 0010
    public static int LOG_COUNT = 4;   // 0100

    public static void logMsg(String msg, int options){
        int logCount=0;
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        if( (options & LOG_COUNT) != 0 )
            System.out.println(++logCount);
        if( (options & LOG_DATE) != 0 )
            System.out.println(localDate);
        if( (options & LOG_TIME) != 0 )
            System.out.println(localTime);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        logMsg("Hello", LOG_DATE | LOG_TIME | LOG_COUNT);
        System.out.println();
        logMsg("Hello 2", LOG_DATE | LOG_TIME);
        System.out.println();
        logMsg("things are running fine", 0);
    }
}
