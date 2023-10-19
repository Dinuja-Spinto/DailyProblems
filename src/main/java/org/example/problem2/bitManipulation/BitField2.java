package org.example.problem2.bitManipulation;

public class BitField2 {
    public static int array_of_bits = 0;

    public static void setBit(int N){
        array_of_bits |= (1 << N);
    }

    public static void clearBit(int N){
        array_of_bits &= ~(1 << N);
    }

    public static boolean isBitSet(int N){
        return ((array_of_bits >> N) & 1) != 0;
    }

    public static void main(String[] args) {
        setBit(5);
        setBit(2);
        setBit(9);
        setBit(7);
        setBit(45);

        clearBit(7);

        //System.out.println(isBitSet(2));
        for(int i =0; i <32; i++){
            if(isBitSet(i)){
                System.out.print("+");
            }else {
                System.out.print(".");
            }
        }
    }
}
