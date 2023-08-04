public class Main{
    public static void main(String[] args) {
        try{
            int x=5/0;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
//            return;            //return用于结束当前方法，这里是main方法，也就是异常处理完毕后的代码不会执行
        }
        finally {
            System.out.println("执行finally语句");
        }
        System.out.println("异常处理完毕后的代码");
    }
        }

