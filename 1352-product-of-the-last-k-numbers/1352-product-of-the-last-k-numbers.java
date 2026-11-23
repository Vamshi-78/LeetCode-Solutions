class ProductOfNumbers {
    List<Integer> pre=new ArrayList<>();
    int size=0;
    public ProductOfNumbers() {
        this.pre.add(1);
        this.size=0;
    }
    
    public void add(int num) {
        if(num==0){
            this.pre=new ArrayList<Integer>();
            this.pre.add(1);
            this.size=0;
        }
        else{
            this.pre.add(this.pre.get(size)*num);
            this.size++;
        }
    }
    
    public int getProduct(int k) {
        if(k>this.size)
        return 0;
        return(
            this.pre.get(this.size)/this.pre.get(this.size-k)
        );
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */