package src.com.skl.day10.team.view;

import src.com.skl.day10.team.domain.Employee;
import src.com.skl.day10.team.domain.Programmer;
import src.com.skl.day10.team.service.NameListService;
import src.com.skl.day10.team.service.TeamException;
import src.com.skl.day10.team.service.TeamService;

/**
 * @program: case_skills_practice
 * @ClassName: TeamView
 * @author: skl
 * @create: 2024-07-02 13:58
 */
public class TeamView {
    private NameListService nameListService = new NameListService();

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
    NameListService listSvc=new NameListService();
    TeamService teamSvc=new TeamService();

    public void enterMainMenu() {

        boolean flag = true;
        char key = 0;
        while (flag) {
            if (key != '1') {
                listAllEmployees();
            }

            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
            key = TSUtility.readMenuSelection();
            switch (key) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否确认退出(Y/N):");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                        break;
                    }
            }
        }

    }

    public void listAllEmployees() {
        System.out.println("------------------------开发团队调度软件--------------------------\n");
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        Employee employees[] = listSvc.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i] + "\n");
        }
        System.out.println("----------------------------------------------------------------");
    }

    public void getTeam() {
        System.out.println("------------------------团队成员列表--------------------------\n");
        System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
        Programmer programmer[] = teamSvc.getTeam();
        for (int i = 0; i < programmer.length; i++) {
            System.out.println(programmer[i].getDetails());
        }
        System.out.println("------------------------------------------------------------");
    }

    public void addMember() {
        System.out.println("------------------------添加成员--------------------------");
        System.out.println("请输入要添加的员工ID：");
        int id = TSUtility.readInt();

        try {
            Employee a = listSvc.getEmployee(id);
            teamSvc.addMember(a);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        TSUtility.readReturn();

    }

    public void deleteMember() {
        System.out.println("------------------------删除成员--------------------------");
        System.out.println("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        System.out.println("确认是否删除(Y/N):");
        char isDele = TSUtility.readConfirmSelection();
        if (isDele == 'N') {
            return;
        }

        try {
            teamSvc.removeMember(id);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("删除成功");

        TSUtility.readReturn();
    }

}

