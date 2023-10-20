package org.example.problem2.bitManipulation;

import java.time.LocalDate;
import java.time.LocalTime;

public class BitField1 {

    public static int LOG_TIME = 0x01;   // 0001
    public static int LOG_DATE = 0x02;   // 0010
    public static int LOG_COUNT = 0x04;   // 0100

    public static void logMsg(String msg, int options){
        int logCount=0;
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        if( checkOption(options, LOG_COUNT) )
            System.out.println(++logCount);
        if( checkOption(options, LOG_DATE) )
            System.out.println(localDate);
        if( checkOption(options, LOG_TIME) )
            System.out.println(localTime);
        System.out.println(msg);
    }

    public static boolean checkOption(int options, int flg){
        return (options & flg) != 0;
    }
    public static void main(String[] args) {
        logMsg("Hello", LOG_DATE | LOG_TIME | LOG_COUNT);
        System.out.println();
        logMsg("Hello 2", LOG_DATE | LOG_TIME);
        System.out.println();
        logMsg("things are running fine", 0);
    }
}
