package org.comstudy21.thread;

public class Ch06Ex03 implements Runnable {
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println("쓰레드 실행" + i);
			try {
				if(i==20) {
					synchronized (this) {
						this.wait(1000); // 스레드의 작동을 중지하고 대기 상태로 
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Ch06Ex03());
		t.start();
		
		for(int i=0; i<50; i++) {
			System.out.println("메인 실행" + i);
			try {
				if(i==30) {
					synchronized (t) {
						t.notify();	// 대기 중인 스레드 다시 시작 (상태전이)
					//	t.stop();	// 스레드가 멈추도록 (사용 자제하는 것이 좋음)
					}
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}


}
