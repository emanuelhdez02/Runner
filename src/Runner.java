public class Runner {
    //warmup 1
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }
    //warmup 2
    int countXX(String str) {
        int num = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) num++;
        }
        return num;
    }
    //string 1
    public boolean endsLy(String str) {
        int end = str.length();
        String ly = "ly";
        if (end < 2){
            return false;
        }else if (ly.equals(str.substring(end-2,end))){
            return true;
        }else{
            return false;
        }
    }
    //array 1
    public int[] makePi() {
        int[] num = {3, 1, 4};
        return num;
    }
    //logic 1
    public boolean love6(int a, int b) {
        if(a == 6 || b == 6){
            return true;
        }
        int num = a + b;
        int six = Math.abs(a-b);

        if(num == 6 || six == 6){
            return true;
        }else{
            return false;
        }
    }
    //string 2
    public boolean catDog(String str) {
        int len = str.length();
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i+3);
            if (temp.compareTo("cat") == 0){
                cat++;
            }
            if (temp.compareTo("dog") == 0){
                dog++;
            }
        }
        if (cat == dog){
            return true;
        }else{
            return false;
        }
    }
    //array 2
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean bounce = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3)
                bounce = false;
            if (nums[i] == 3 && bounce == true)
                return false;
            if (nums[i] == 3 && bounce == false) {
                bounce = true;
                count++;
            }
        }
        if (count == 3){
            return true;
        }else{
            return false;
        }
    }
    //logic 2
    public int luckySum(int a, int b, int c) {
        if(a != 13 && b != 13 && c != 13){
            return a + b + c;
        }
        if(a == 13){
            return 0;
        }
        if(b == 13){
            return a;
        }
        if(c == 13){
            return a + b;
        }
        if(a == 13 && b == 13 && c == 13){
            return  0;
        }
        return 0;
    }
    //string 3
    public int maxBlock(String str) {
        int len = str.length();
        int count = 0;
        int mcount = 1;

        if (len == 0){
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if (i < len-1 && str.charAt(i) == str.charAt(i+1)){
                mcount++;
            }else{
                mcount = 1;
            }
            if (mcount > count){
                count = mcount;
            }

        }
        return count;
    }
    //array 3
    public int maxSpan(int[] nums) {
        int span = 0;
        int mat = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int p = 0; p < nums.length; p++) {
                if (nums[i] == nums[p]) {
                    mat = p-i+1;
                    span = Math.max(mat,span);
                }
            }
        }
        return span;
    }

}
// public String conCat(String a, String b) {
//   if(a.substring(0, a.length -1)).equals(b.substring(0,1)){

//   }
// }
//public boolean hasBad(String str) {
//    if(String str.substring(0).equals("bad") || str.substring(str.length -1).equals("bad"){
//        return true;
//
//    }else{
//        return false;
//    }
//}
