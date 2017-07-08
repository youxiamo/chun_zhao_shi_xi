package implantTest;

/**
 * Created by Administrator on 2017/4/6 0006.
 */

interface myPar{
    static int id=1;
}
interface myPar2{
     int getId();
}
interface my1 extends myPar,myPar2{
    void getName();
    void setId();
}

public class myT1 implements my1{

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public void getName() {

        System.out.print(id);
    }

    @Override
    public void setId() {

    }
}
