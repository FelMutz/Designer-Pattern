package designers.responsibility;

import lombok.Data;

@Data
public abstract class AbstractShopping {
    public static Integer CHANGE = 1;
    public static Integer MONEY = 2;
    public static Integer CARD = 3;

    protected Integer level;

    protected AbstractShopping nextServiceFile;

    public void setNextServiceFile(AbstractShopping nextServiceFile){
        this.nextServiceFile = nextServiceFile;
    }

    public void shopping(Integer level){
        if(this.level <= level){
            write();
        }
        if(nextServiceFile !=null){
            nextServiceFile.shopping(level);
        }
    }

    abstract protected void write();
}
