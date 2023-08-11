

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> ts = new TreeSet<>();
        
        for(int val : arr){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        // System.out.println(map);
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                ts.add(e.getKey());
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer value : ts){
            list.add(value);
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        
        return list;
    }
}