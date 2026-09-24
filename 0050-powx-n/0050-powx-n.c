double myPow(double x, int n) {
    if(n==0) return (double)1;  //base condition which stops stack-overflow
    long pow=n;
    if(pow<0){
        pow=-pow;
        x=1/x;
    }
    double base=myPow(x,pow/2);
    if(pow%2==0){
        return base*base;
    }
    else{
        return base*base*x;
    }
}