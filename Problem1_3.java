package problemex1;

public class Problem1_3 {
	
	public static void main(String[] args) {
		int tate = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int yoko = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        
        System.out.println("たて："+tate);
        System.out.println("よこ："+yoko);
        
        for(int i = 0; i<tate; i++) {
        	for(int j = 0; j<yoko; j++) {
        		System.out.print("・");
        	}
        	System.out.println("");
        }
        
	}

}
