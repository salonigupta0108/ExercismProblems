import java.util.*;
class PythagoreanTriplet{
    private int a,b,c;
    private static List<PythagoreanTriplet> tripletList;
    private static PythagoreanTriplet pythagoreanTriplet= new PythagoreanTriplet(0,0,0);
    PythagoreanTriplet(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static PythagoreanTriplet makeTripletsList(){
        tripletList = new ArrayList<PythagoreanTriplet>();
        return pythagoreanTriplet;
        }
    PythagoreanTriplet withFactorsLessThanOrEqualTo(int n){
        return pythagoreanTriplet;
    }
    public static PythagoreanTriplet thatSumTo(int n){
        for(int i=0;i<n/3;i++){
            for(int j=i+1;j<n/2;j++){
                int k = n-i-j;
                if(i*i+j*j==k*k)
                    tripletList.add(new PythagoreanTriplet(i,j,k));
            }
        }       
        return pythagoreanTriplet;
    }
    public static List<PythagoreanTriplet> build(){
        return tripletList;
    }
    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) obj;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
}