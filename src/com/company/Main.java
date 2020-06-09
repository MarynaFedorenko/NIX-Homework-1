package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //////////////// task 1 //////////////////////
        Scanner num = new Scanner(System.in);
        int a; int b; int temp;
        a = num.nextInt();
        b = num.nextInt();

        temp = a;
        a=b;
        b=temp;
        System.out.println(a+","+b);

        System.out.println();
        ////////////// task 2 //////////////////////
        int numbOfPauses = 0;
        int countShortPause = 0;
        int countLongPause = 0;
        int shortPause = 5;
        int longPause = 15;
        int duration = 45;
        double endOfLesson = 0;
        int firstLessonStart = 9;
        int hourToMinutes = 60;

        int endHour = 0;
        int endMinute = 0;

        int lesson = num.nextInt();
        numbOfPauses = lesson - 1;
        countShortPause = numbOfPauses%2==0? numbOfPauses/2 : (numbOfPauses+1)/2;
        countLongPause = numbOfPauses%2==0? numbOfPauses/2 : (numbOfPauses+1)/2-1;

        endOfLesson = firstLessonStart*hourToMinutes + lesson*duration + shortPause*countShortPause + longPause*countLongPause;
        endHour = (int) endOfLesson/60;
        endMinute = (int)Math.round((endOfLesson/60-endHour)*hourToMinutes);

        System.out.println(endHour + "  "+endMinute);

        System.out.println();
        ////////////// task 3 //////////////////////
        int [] first  = new int [3];
        int [] second = new int [3];
        int fseconds = 0;
        int sseconds = 0;
        for(int i=0; i<3; i++)
            first[i] = num.nextInt();

        for(int i=0; i<3; i++)
            second[i] = num.nextInt();

        fseconds = (int)(first[0]*Math.pow(60,2)+first[1]*60 + first[2]);
        sseconds = (int)(second[0]*Math.pow(60,2)+second[1]*60 + second[2]);


        System.out.println(sseconds-fseconds);

        System.out.println();
        ////////////// task 4 //////////////////////
        float n = 0;
        float m = 0;
        n = num.nextFloat();
        m = num.nextFloat();
        int result = (int)Math.ceil(m/n);
        System.out.println(result);

        System.out.println();
        ////////////// task 5//////////////////////
        float h = 0;
        float aa = 0;
        float bb = 0;
        h = num.nextFloat();
        aa = num.nextFloat();
        bb = num.nextFloat();
        int days = (int) (Math.ceil((h-aa)/(aa-bb)))+1;
        System.out.println("days:" + days);

        System.out.println();
        ////////////// task 6//////////////////////
        int aaa = num.nextInt();
        int bbb = num.nextInt();
        int max = aaa>=bbb? aaa : bbb;

        System.out.println(max);

        System.out.println();
        ////////////// task 7//////////////////////
        int[] boat1 = new int[2];
        int [] boat2 = new int[2];
        boat1[0] = num.nextInt();
        boat1[1] = num.nextInt();
        boat2[0] = num.nextInt();
        boat2[1] = num.nextInt();
        if(boat1[0]==boat2[0] || boat1[1]==boat2[1])
            System.out.println("YES");
        else System.out.println("NO");

        System.out.println();
        //////////////// task 8//////////////////////
        int [] numb = new int [3];
        int res = 0;
        numb[0] = num.nextInt();
        numb[1] = num.nextInt();
        numb[2] = num.nextInt();
        for(int i=1; i<3; i++)
            if(numb[i]==numb[0]) res++;
        if(numb[1]==numb[2]) res++;
        if(res ==1) res++;
        System.out.println(res);

        System.out.println();
        //////////////// task 9//////////////////////
        int N = 0;
        N = num.nextInt();
        int [] array = new int [N];
        for(int i=0; i<N; i++)
            array[i] = num.nextInt();
        int count =0;
        for(int i=1; i<N; i++){
            if(array[i]>array[i-1]) count++;
        }
        System.out.println(count);

        System.out.println();
        //////////////// task 10//////////////////////
        int size = 0;
        size = num.nextInt();
        int [] arr = new int [size];
        for(int i=0; i<size; i++)
            arr[i] = num.nextInt();
        int countt =0;
        for(int i=1; i<size-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) countt++;
        }
        System.out.println(countt);

        System.out.println();
        //////////////// task 11//////////////////////

        int arrSize = 0; int templ=0;int evenOrNot = 0;

        arrSize = num.nextInt();
        int []arrayy = new int [arrSize];
        for(int i=0; i<arrSize; i++)
            arrayy[i] = num.nextInt();

        if(arrSize%2!=0) evenOrNot+=1;//если нечётное кол-во эл-тов - не трогает последний элемент

        for(int i=1; i<arrSize-evenOrNot; i++){
                templ = arrayy[i-1];
                arrayy[i-1] = arrayy[i];
                arrayy[i] = templ;
                i++;
        }
        for(int i=0; i<arrSize; i++)
            System.out.print(arrayy[i]+ "  ");

    }
}
