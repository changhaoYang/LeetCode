class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        char[] charArr = S.toCharArray();
        int counts = 1;
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < charArr.length-1; i++) {
            if (charArr[i] == charArr[i+1]) {
                counts++;
                if(i == charArr.length - 2) {   // 到达倒数第二个，没有不同的
                    //存入起点和终点
                    if (counts >= 3) {
                        end = start + counts - 1;
                        List<Integer> temp = new ArrayList<>();
                        temp.add(start);
                        temp.add(end);
                        ans.add(temp);
                    }
                }
                
            } else {    // i与i+1不等
                if (counts >= 3) {
                    //存入起点和终点
                    end = start + counts - 1;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(start);
                    temp.add(end);
                    ans.add(temp);
                }
                start = i+1;
                counts = 1;
            }
            
        }
                
        return ans;
    }
}