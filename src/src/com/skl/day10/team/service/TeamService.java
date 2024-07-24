package src.com.skl.day10.team.service;

import src.com.skl.day10.team.domain.Architect;
import src.com.skl.day10.team.domain.Designer;
import src.com.skl.day10.team.domain.Employee;
import src.com.skl.day10.team.domain.Programmer;

/**
 * @program: case_skills_practice
 * @ClassName: TeamService
 * @author: skl
 * @create: 2024-07-02 16:50
 */
public class TeamService {
    private static int count = 1;//给memberid自动赋值
    private final int MAX_MEMBER = 5;//开发团队最多能接受的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//开发团队的数组
    private int total;//记录开发团队的人数

    public Programmer[] getTeam() {//返回当前对象的成员
        Programmer[] team2 = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null) {
                team2[i] = team[i];
            }
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {//添加成员
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        Programmer p = (Programmer) e;
        Status status = p.getStatus();
        switch (status) {
            case BUSY:
                throw new TeamException("该成员已是某团队成员");
            case VOCATION:
                throw new TeamException("该成员正在休假，无法添加");
            default:
                team[total++] = p;

        }
        boolean isExist = isExist(p);
        if (isExist) {
            throw new TeamException("该成员已在开发团队中");
        }
        int PrograNum = 0, DesNum = 0, ArchNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                ArchNum++;
            } else if (team[i] instanceof Programmer) {
                PrograNum++;
            } else if (team[i] instanceof Designer) {
                DesNum++;
            }
        }
        if (p instanceof Architect) {
            if (ArchNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (DesNum >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (PrograNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        //可以添加到数组中
        team[total++] = p;
        p.setMemberId(count++);
        p.setStatus(Status.BUSY);
    }

    private boolean isExist(Programmer p) {//判断p是否已在开发团队中
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
//                team[i].setStatus(Status.FREE);
//                team[i] = team[--total];
//                team[total] = null;
                return true;
            }
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
//                team[i] = team[--total];
                break;
            }
        }
        if (i == total) {
            throw new TeamException("找不到该成员");
        }//调整数组
        for (int j = i; j < total - 1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
