package problemex1;

public class Counter {
    //  カウント
    private int count = 0;
    private static int total_count = 0;
    //  コンストラクタ
    public void reset(){
        count = 0;
    }
    //  カウント
    public void count(){
        count++;
        total_count++;
    }
    //  値の取得
    public int getCount(){
        return count;
    }
    
    public static int getTotalCount() {
    	return total_count;
    }
 
}
