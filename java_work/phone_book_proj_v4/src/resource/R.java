package resource;

import java.util.Scanner;

import model.DAO;
import view.Delete;
import view.Input;
import view.Menu;
import view.Modify;
import view.Output;
import view.Search;
import view.View;

// 상수 모아두는 곳
public interface R {
	
	String appTitle = ":::::::::: 전화번호부 ::::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = ":::::::::: 입력 기능 ::::::::::";
	String outputTitle = ":::::::::: 출력 기능 ::::::::::";
	String searchTitle = ":::::::::: 검색 기능 ::::::::::";
	String modifyTitle = ":::::::::: 수정 기능 ::::::::::";
	String deleteTitle = ":::::::::: 삭제 기능 ::::::::::";
	
	String[] menuArr = {"","입력","출력","검색","수정","삭제","종료"};
	
	Scanner scan = new Scanner(System.in);
	
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	DAO dao = DAO.getInstance();
	
}
