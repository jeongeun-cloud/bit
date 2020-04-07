package resource;

import java.util.Scanner;

import model.DAO;
import view.*;

public interface R {
	
	String appTitle = ":::::::::: 전화번호부 ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String[] menuArr = {"", "입력", "출력", "검색", "수정", "삭제" , "종료"};
	String inputTitle = ":::::::::: 입력 기능 ::::::::::";
	String outputTitle = ":::::::::: 출력 기능 ::::::::::";
	String searchTitle = ":::::::::: 검색 기능 ::::::::::";
	String modifyTitle = ":::::::::: 수정 기능 ::::::::::";
	String deleteTitle = ":::::::::: 삭제 기능 ::::::::::";
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
}
