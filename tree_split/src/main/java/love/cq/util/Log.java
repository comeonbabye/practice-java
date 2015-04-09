package love.cq.util;

/**
 * 简单的日志类，以后优化
 * @author tony
 *
 */
public class Log {

	public enum Level {
        ERROR(0), INFO(1), DEBUG(2);
        
        private final int value;
        
        Level(int v) {
        	this.value = v;
        }
        
        public int getValue() {
        	return this.value;
        }
    }
	
	
	private static Level level = Level.DEBUG;
	
	public static void debug(String msg, Object... objs) {
		
		if(level.value < Level.DEBUG.value) {
			return;
		}
		out(msg, objs);
	}

	public static void info(String msg, Object... objs) {
		
		if(level.value < Level.INFO.value) {
			return;
		}
		out(msg, objs);
	}
	
	private static void out(String msg, Object... objs) {
		
		if(msg == null) {
			throw new NullPointerException("msg can not by null.");
		}
		
		if(objs != null) {
			for(Object obj : objs) {
				msg = msg.replace("{}", obj.toString());
			}
		}  
		
		System.out.println(msg);
	}
	
	
	
	public static void main(String[] args) {
		Log.info("hello {}", "tony");
	}
}
