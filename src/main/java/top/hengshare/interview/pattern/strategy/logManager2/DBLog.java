package top.hengshare.interview.pattern.strategy.logManager2;

/**
 * @program: Java-Interview
 * @description: 记录日志到数据库
 * @author: Steven Yang
 * @create: 2019-10-16 10:15
 **/
public class DBLog extends LogStrategyTemplate {

    @Override
    protected void doLog(String msg) {
        //制造错误
        if (msg != null && msg.trim().length() > 5) {
            int a = 5 / 0;
        }
        System.out.println(msg + "'记录到数据库");
    }
}
