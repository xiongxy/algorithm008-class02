class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < nums.length; i++) {
              if (map.containsKey(nums[i])) {
                  var value = map.get(nums[i]);
                  map.put(nums[i], ++value);
              } else {
                  map.put(nums[i], 1);
              }
          }
  
          PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
              @Override
              public int compare(Integer o1, Integer o2) {
                  return map.get(o1) - map.get(o2);
              }
          });
  
          for (Integer n : map.keySet()){
              if (pq.size()<k){
                  pq.add(n);
              }
              else if (map.get(n)>map.get(pq.peek())){
                  pq.remove();
                  pq.add(n);
              }
          }
          int[] newArray = new int[k];
          int pqCount = pq.size();
          for (int i = 0;i< pqCount;i++){
              newArray[i] = pq.remove();
          }
          return newArray;
      }
  }