class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        return false;
        int i=2;
        int j=0;
        long sum=1;
        for(;i*i<num;i++){
            if(num%i==0){
                j=num/i;
                sum=sum+i;
                if(i*i!=num){
                    sum+=j;
                }
            }
        }
        return num==sum;
    }
}

//-------------------- brute force

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
        return false;
        int i=2;
        int j=0;
        long sum=1;
        Set<Integer> n=new HashSet<Integer>();
        n.add(1);
        for(;i<num/2;i++){
            if(num%i==0){
                j=num/i;
                n.add(i);
                n.add(j);
            }
        }
        System.out.print(n.stream().mapToInt(Integer::intValue).sum());
        
        return num==n.stream().mapToInt(Integer::intValue).sum();

    }
}