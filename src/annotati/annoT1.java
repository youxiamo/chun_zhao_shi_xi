package annotati;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface myu{
    String paramValue() default "jj";
}

class say{
    @myu(paramValue = "my")
    public void name(String n){
        System.out.print(n);
    }
    @myu
    public void na(String w){
        System.out.print(w);
    }
}
public class annoT1 {



    public static void main(String []args) throws InvocationTargetException, IllegalAccessException {
        annoT1 a=new annoT1();
        //annoT1.say s=new annoT1().new say();
        say b=new say();

        Method[] methods=b.getClass().getDeclaredMethods();
        for(Method m:methods){
            System.out.println("----");
            myu y=null;
            if((y=m.getAnnotation(myu.class))!=null)
                m.invoke(b,y.paramValue());
            else m.invoke(b,"jdgh");
        }


    }


}
