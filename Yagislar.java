package day13_Arrays;

public class Yagislar {
    public static void main(String[] args) {
        String[] months={"Jan","Feb","Mar","Apr","May","Jun",
                         "Jul","Aug","Sep","Oct","Nov","Dec"};

       double [] rains={40.5,35.3,42.2,51.3,35.2,14.1,12.5,18.0,7.5,31.5,44.6};
       double toplam=0;

       double max=rains[0];
       int enFazlaNdx=0;
       double min=rains[0];
       int enAzNdx=0;
        for (int i = 0; i < rains.length ; i++) {
            toplam+=rains[i];
            if(rains[i] > max){
                max=rains[i];
                enFazlaNdx=i;
            }
            if(rains[i] < min){
                min=rains[i];
                enAzNdx=i;
            }



        }
        System.out.println(String.format("Toplam yagis miktari =%5.1f",toplam));
        System.out.println(months[enFazlaNdx]);
        System.out.println(rains[enFazlaNdx]);
        System.out.println(months[enAzNdx]);
        System.out.println(rains[enAzNdx]);

    }
}
