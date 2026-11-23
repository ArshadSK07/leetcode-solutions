class ProductOfNumbers {
    static List<Integer> list = new ArrayList();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
     int n=list.size(),p=1;
     for(int i=n-k;i<n;i++){
        p*=list.get(i);
     }   
     return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */