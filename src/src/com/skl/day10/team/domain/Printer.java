package src.com.skl.day10.team.domain;

/**
 * @program: case_skills_practice
 * @ClassName: Printer
 * @author: skl
 * @create: 2024-07-01 22:38
 */
public class Printer implements Equipment {
    private String name;//打印机名称
    private String type;//打印机类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
