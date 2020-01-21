package chapter1.exercises;



import java.net.URL;
import javax.swing.*;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL imageLocation = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1573890712995&di=50843a20d3d47fbe256f674161d89c75&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn08%2F80%2Fw440h440%2F20180930%2F3c8f-hkrzvkv2538525.jpg");
		JOptionPane.showMessageDialog(null, "Hello Tracy", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
	}
}
