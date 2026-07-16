package Loop_Structure;

import utils.Validation;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        int n;
        n = (int) Validation.getNumber("Mời nhập số nguyên dương n: ", 0, true);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            System.out.format("\nMời nhập số thứ %d: ",i+1);
            int num = (int) Validation.getNumber("",true);
            if(num > max) {
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.format("Số nhỏ nhất là: %d",min);
        System.out.format("\nSố lớn nhất là: %d ",max);

    }
}
