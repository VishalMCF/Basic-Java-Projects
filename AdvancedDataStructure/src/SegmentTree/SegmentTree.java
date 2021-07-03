package SegmentTree;

public class SegmentTree {

    private int[] st;
    private int[] arr;

    SegmentTree(int[] arr){
        this.arr = arr;
        int n = arr.length;
        int x = (int) Math.ceil(Math.log(n)/Math.log(2));
        int size = 2*(int)Math.pow(2,x)-1;
        st = new int[size];
        System.out.println("Segment Tree has been generated.....");
        constructUtil(arr,0,n-1,0);
    }

    private int getMid(int start,int end){
        return start + (end-start)/2;
    }

    private int constructUtil(int[] arr,int l,int r,int ix){
        if(l==r){
            st[ix] = arr[l];
            return st[ix];
        }
        int mid = l+(r-l)/2;
        st[ix] = constructUtil(arr,l,mid,2*ix +1)+constructUtil(arr,mid+1,r,2*ix + 2);
        return st[ix];
    }

    public int getSum(int qs,int qe){
        int n = arr.length;
        if(qs<0 || qe>n-1){
            System.out.println("Invalid Input");
            return Integer.MAX_VALUE;
        }
        return getSumUtil(0,n-1,qs,qe,0);
    }


    /*
    * ss -> Segment start index   (not segment array one but of actual array's segment)
    * se -> Segment Tree end index (not segment array one but of actual array's segment)
    * qs -> Query start index
    * qe -> Query End index
    * si -> Segment Array current index
    * */
    private int getSumUtil(int ss, int se, int qs, int qe, int si) {
        // If the query range is outside of the desired segment range
        if(qs>se || qe<ss) {
            //System.out.println("qs = "+qs+" qe = "+qe+" ss = "+ss+" se = "+se);
            return 0;
        }
        if(qs<=ss && qe>=se){
            //System.out.println("qs = "+qs+" qe = "+qe+" ss = "+ss+" se = "+se);
            return st[si];
        }
        int mid = getMid(ss,se);
        return getSumUtil(ss,mid,qs,qe,2*si+1)+getSumUtil(mid+1,se,qs,qe,2*si+2);
    }

    public void updateValue(int ix,int value){
        int diff = value-arr[ix];
        int n = arr.length;
        if(ix <0||ix>n-1){
            System.out.println("Invalid Input");
        }
        updateValueUtil(0,n-1,ix,diff,0);
    }

    private void updateValueUtil(int ss, int se, int ix, int diff, int si) {
        if(ix<ss || ix>se)
            return;
        System.out.println("ss = "+ss+" se = "+se+" ix = "+ix+" si = "+si+" diff = "+diff);
        st[si]+=diff;
        if(se!=ss){
            int mid = getMid(ss,se);
            updateValueUtil(ss,mid,ix,diff,2*si+1);
            updateValueUtil(mid+1,se,ix,diff,2*si+2);
        }
    }

    @Override
    public String toString() {
        String segmentTree = "";
        for (int i : st) {
            segmentTree += i + " ";
        }
        return segmentTree;
    }
}
