package cn.ThreadPro;
/**
 * һ����������ͬ����Դ
 * @author YR
 *
 */
public class Movie {
    private String pic;
    //��ʶ
    private boolean flag = true;
    public synchronized  void  play(String pic){
	if(!flag){
	    try {
		this.wait();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
	//��ʼ����
	try {
	    Thread.sleep(300);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	
	this.pic = pic;
	//֪ͨ����
	this.notify();System.out.println("�����ˣ�"+pic);
	//ֹͣ����
	flag = false;
    }
    public synchronized void watch(){
	if(flag){
	    try {
		this.wait();
	    } catch (InterruptedException e) {
		e.printStackTrace();
	    }
	}
	//��ʼ����
	try {
	    Thread.sleep(200);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	System.out.println("�����ˣ�"+pic);
	//������ϣ�֪ͨ����
	this.notify();
	flag = true;
    }
}
