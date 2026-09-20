//------------- solution 1
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> result=new ArrayList<>();        
        int carry=0;
        int n=digits.length-1;
        for(int i=n;i>=0||carry==1;i--){
            int sum=0;
            if(i==n){
                sum=carry+1+digits[i];
            }
            else{
                if(i<0){
                    sum=carry;
                }else{
                    sum=digits[i]+carry;
                }
            }
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            result.add(sum);
        }
        Collections.reverse(result);
        return result.stream().mapToInt(Integer:: intValue).toArray();
    }
	
	
	//--------------------solution2-------------------------------------------
	public int[] plusOne(int[] digits) {
	for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
	
	
//If the current digit is less than 9, increment it and return.

//If it is 9, change it to 0 and continue carrying.

//If every digit was 9, create a new array beginning with 1.