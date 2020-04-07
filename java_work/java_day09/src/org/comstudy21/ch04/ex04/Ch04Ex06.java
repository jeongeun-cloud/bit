package org.comstudy21.ch04.ex04;
 
import java.util.Scanner;
 
import org.comstudy21.ch04.ex03.People;
 
public class Ch04Ex06 {
    public static final int max = 100;
    private People[] pArr = new People[max];
    private int top = 0; // ������ �Ͼ�� ���� �ȴ�. // top�� max�� �������� stop
    private int sequence = 0; // ��ü�� ������ �� ���� ���� ��� ����. idx�� ���
    
    public static final Scanner scan = new Scanner(System.in);
    
    public Ch04Ex06() {
        System.out.println("��ȭ��ȣ�� ���α׷�");
        
        while(true){
            run();
        }
    }
    
    public void run() {
        // System.out.println("run �޼ҵ� ȣ��");
        switch(menu()) {
        case 1 : input(); break;
        case 2 : output(); break;
        case 3 : search(); break;
        case 4 : modify(); break;
        case 5 : remove(); break;
        case 6 : 
            System.out.println("����..."); 
            System.exit(0);
            break;
        default : System.out.println("�ش� ���� �����ϴ�!");
        }
        System.out.println("------------------");
    }
    
    
    public int menu() {
        int no = 0;
        System.out.println("1.�Է� 2.��� 3.�˻� 4.���� 5.���� 6.����");
        System.out.print("���� : ");
 
        no = scan.nextInt();
        return no;
 
    }
    
    
    // pArr�� People ��ü�� �߰��Ѵ�.
    public void input() {
        System.out.println("�Է±��...");
 
        // �� �̻� �Է��� �� ���ٸ� �ٷ� ������
        if(top >= pArr.length) {
            System.out.println("�� �̻� �Է� �Ұ����մϴ�.");
            return;
        }
        
        // 1. ��ü����
        People p = new People();
        
        // 2. ��ü�� ������ �ֱ�
        p.setIdx(sequence++);
        System.out.print("���� �Է� : ");
        p.setName(scan.next());
        System.out.print("��ȣ �Է� : ");
        p.setPhone(scan.next());
        
        // 3. ��ü�� �迭�� top������ ���
        pArr[top++] = p;
        
        System.out.println("�Է� �Ϸ�");
    }
    
    
    public void output() {
        System.out.println("��±��...");
        //pArr�� ��Ҹ� top���� �ݺ��ؼ� ����Ѵ�.
        for(People p : pArr){
            if(p==null) {
                break;
            }
            if(p.getIdx()>=0) {
                System.out.println(p);
            }
        }        
    }
    
    
    public void search() {
        System.out.println("�˻����...");
        
        System.out.print("���� �Է� : ");
        String userName = scan.next();
                
        for(int i=0; i<pArr.length; i++){    
            try {
                if(pArr[i].getName().equals(userName)){
                    System.out.println("�˻� ��� => " + pArr[i]);
                    return;
                }
            } catch (NullPointerException e) {
                System.out.println("�������� �ʴ� �̸��Դϴ�. �ٽ� �õ����ּ���!");
                return;
            }
        }
    }
    
    
    public void modify() {
        System.out.println("�������...");
 
        System.out.print("���� �� ��ȣ �Է� : ");
        int num = scan.nextInt();
            
        
        for(int i=0; i<pArr.length; i++){    
            try {
                if(pArr[i].getIdx() == num){
                    System.out.println("������ ��ȣ�� �̸� : "+ pArr[num].getName() +" ��ȣ : "+ pArr[num].getPhone());
                    System.out.println("1. �̸�����  2. ��ȣ����");
                    System.out.print("���� : ");
                    int tmp = scan.nextInt();
                    
                    switch(tmp){
                        case 1 : 
                            System.out.print("�̸� ���� �Է� : ");
                            String newName = scan.next();
                            pArr[num].setName(newName);
                            System.out.println("������ �Ϸ� �Ǿ����ϴ�! ����� ���� Ȯ���ϼ���!");
                        break;
                        case 2 :
                            System.out.print("��ȣ ���� �Է� : ");
                            String newPhone = scan.next();
                            pArr[num].setPhone(newPhone);
                            System.out.println("������ �Ϸ� �Ǿ����ϴ�! ����� ���� Ȯ���ϼ���!");
                        break;
                        default :
                            System.out.println("******* ��ȣ�� �� �� �Է��Ͽ� ��ҵǾ����ϴ� *******");
                        break; 
                    } break;
                } 
            } catch (NullPointerException e) {
            System.out.println("�������� �ʴ� ��ȣ�Դϴ�. �ٽ� �õ��ϼ���!");
            return;
            }
        }
    }
    
    
    public void remove() {
        System.out.println("�������...");
        
        System.out.print("���� �� ��ȣ �Է� : ");
        int num = scan.nextInt();
        
 
        
        for(int i=0; i<pArr.length; i++){    
 
            try {
                if(pArr[i].getIdx() == num){
                    System.out.println("������ ��ȣ�� �̸� : "+ pArr[num].getName() +" ��ȣ : "+ pArr[num].getPhone());
                                    
                    System.out.println("1. ����    2. ���");
                    System.out.print("���� : ");
                    int tmp = scan.nextInt();
                    
                    switch(tmp){
                        case 1 : 
                            pArr[num].setIdx(-1);
                            pArr[num].setName(null);
                            pArr[num].setPhone(null);
                            System.out.println("�����Ǿ����ϴ�! ����� ���� Ȯ���ϼ���!");
                        break;
                        case 2 :
                            System.out.print("��ҵǾ����ϴ�.");
                        break;
                        default :
                            System.out.println("******* ��ȣ�� �� �� �Է��Ͽ� ��ҵǾ����ϴ� *******");
                        break; 
                    } break;
                }
                
                }catch (NullPointerException e) {
                    System.out.println("��ȣ�� ���� �ʽ��ϴ�! ��ȣ�� �ٽ� �Է��ϼ���.");
                    return;
                }catch (IndexOutOfBoundsException e) {
                    System.out.println("�̹� ������ ��ȣ�̰ų�, �������� �ʴ� ��ȣ�Դϴ�.");
                    return;
                }
            
        }
    }
    
    public static void main(String[] args) {
        new Ch04Ex06();
        
    }
 
}