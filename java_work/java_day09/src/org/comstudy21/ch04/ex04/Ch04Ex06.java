package org.comstudy21.ch04.ex04;
 
import java.util.Scanner;
 
import org.comstudy21.ch04.ex03.People;
 
public class Ch04Ex06 {
    public static final int max = 100;
    private People[] pArr = new People[max];
    private int top = 0; // 삭제가 일어나면 감소 된다. // top이 max와 같아지면 stop
    private int sequence = 0; // 객체가 생성될 때 감소 없이 계속 증가. idx에 사용
    
    public static final Scanner scan = new Scanner(System.in);
    
    public Ch04Ex06() {
        System.out.println("전화번호부 프로그램");
        
        while(true){
            run();
        }
    }
    
    public void run() {
        // System.out.println("run 메소드 호출");
        switch(menu()) {
        case 1 : input(); break;
        case 2 : output(); break;
        case 3 : search(); break;
        case 4 : modify(); break;
        case 5 : remove(); break;
        case 6 : 
            System.out.println("종료..."); 
            System.exit(0);
            break;
        default : System.out.println("해당 사항 없습니다!");
        }
        System.out.println("------------------");
    }
    
    
    public int menu() {
        int no = 0;
        System.out.println("1.입력 2.출력 3.검색 4.수정 5.삭제 6.종료");
        System.out.print("선택 : ");
 
        no = scan.nextInt();
        return no;
 
    }
    
    
    // pArr에 People 객체를 추가한다.
    public void input() {
        System.out.println("입력기능...");
 
        // 더 이상 입력할 수 없다면 바로 끝내기
        if(top >= pArr.length) {
            System.out.println("더 이상 입력 불가능합니다.");
            return;
        }
        
        // 1. 객체생성
        People p = new People();
        
        // 2. 객체에 데이터 넣기
        p.setIdx(sequence++);
        System.out.print("성명 입력 : ");
        p.setName(scan.next());
        System.out.print("번호 입력 : ");
        p.setPhone(scan.next());
        
        // 3. 객체를 배열의 top번지에 담기
        pArr[top++] = p;
        
        System.out.println("입력 완료");
    }
    
    
    public void output() {
        System.out.println("출력기능...");
        //pArr의 요소를 top까지 반복해서 출력한다.
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
        System.out.println("검색기능...");
        
        System.out.print("성명 입력 : ");
        String userName = scan.next();
                
        for(int i=0; i<pArr.length; i++){    
            try {
                if(pArr[i].getName().equals(userName)){
                    System.out.println("검색 결과 => " + pArr[i]);
                    return;
                }
            } catch (NullPointerException e) {
                System.out.println("존재하지 않는 이름입니다. 다시 시도해주세요!");
                return;
            }
        }
    }
    
    
    public void modify() {
        System.out.println("수정기능...");
 
        System.out.print("수정 할 번호 입력 : ");
        int num = scan.nextInt();
            
        
        for(int i=0; i<pArr.length; i++){    
            try {
                if(pArr[i].getIdx() == num){
                    System.out.println("수정할 번호의 이름 : "+ pArr[num].getName() +" 번호 : "+ pArr[num].getPhone());
                    System.out.println("1. 이름수정  2. 번호수정");
                    System.out.print("선택 : ");
                    int tmp = scan.nextInt();
                    
                    switch(tmp){
                        case 1 : 
                            System.out.print("이름 새로 입력 : ");
                            String newName = scan.next();
                            pArr[num].setName(newName);
                            System.out.println("수정이 완료 되었습니다! 출력을 통해 확인하세요!");
                        break;
                        case 2 :
                            System.out.print("번호 새로 입력 : ");
                            String newPhone = scan.next();
                            pArr[num].setPhone(newPhone);
                            System.out.println("수정이 완료 되었습니다! 출력을 통해 확인하세요!");
                        break;
                        default :
                            System.out.println("******* 번호를 잘 못 입력하여 취소되었습니다 *******");
                        break; 
                    } break;
                } 
            } catch (NullPointerException e) {
            System.out.println("존재하지 않는 번호입니다. 다시 시도하세요!");
            return;
            }
        }
    }
    
    
    public void remove() {
        System.out.println("삭제기능...");
        
        System.out.print("삭제 할 번호 입력 : ");
        int num = scan.nextInt();
        
 
        
        for(int i=0; i<pArr.length; i++){    
 
            try {
                if(pArr[i].getIdx() == num){
                    System.out.println("삭제할 번호의 이름 : "+ pArr[num].getName() +" 번호 : "+ pArr[num].getPhone());
                                    
                    System.out.println("1. 삭제    2. 취소");
                    System.out.print("선택 : ");
                    int tmp = scan.nextInt();
                    
                    switch(tmp){
                        case 1 : 
                            pArr[num].setIdx(-1);
                            pArr[num].setName(null);
                            pArr[num].setPhone(null);
                            System.out.println("삭제되었습니다! 출력을 통해 확인하세요!");
                        break;
                        case 2 :
                            System.out.print("취소되었습니다.");
                        break;
                        default :
                            System.out.println("******* 번호를 잘 못 입력하여 취소되었습니다 *******");
                        break; 
                    } break;
                }
                
                }catch (NullPointerException e) {
                    System.out.println("번호가 맞지 않습니다! 번호를 다시 입력하세요.");
                    return;
                }catch (IndexOutOfBoundsException e) {
                    System.out.println("이미 삭제된 번호이거나, 존재하지 않는 번호입니다.");
                    return;
                }
            
        }
    }
    
    public static void main(String[] args) {
        new Ch04Ex06();
        
    }
 
}