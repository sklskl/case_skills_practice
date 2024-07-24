package src.com.skl.day10.team.domain;

/**
 * @program: case_skills_practice
 * @ClassName: PC
 * @author: skl
 * @create: 2024-07-01 22:31
 */
public class PC implements Equipment {
    private String model;//机器型号
    private String display;//显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";

    }
}
