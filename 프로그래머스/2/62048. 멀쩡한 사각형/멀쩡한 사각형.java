class Solution {
    public long solution(int w, int h) {
        long ww = w/GCD(w,h);
        long hh = h/GCD(w,h);
        long cut = (long)ww*(long)hh - (long)((ww-1) * (hh-1));
        long answer = ((long)w*(long)h) - (long)(cut * GCD(w,h));
        return answer;
    }
    
    long GCD(long w, long h){
        if(w%h == 0){
            return h;
        }return GCD(h, w%h);
    }
}