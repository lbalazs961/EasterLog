package pkg;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[]args) {
        final Level VIOLATION = Level.forName("VIOLATION", 150);
        final Level REQUEST = Level.forName("REQUEST", 350);
        int m = Integer.parseInt(args[0]);
        System.out.println(m);
        for (int i = 0; i < m; i++){
            logger.log(VIOLATION, "Zöld erdőben jártam,");
            logger.fatal("Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.log(REQUEST, "Szabad-e locsolni?");
            try {
                Thread.sleep(10);
            }    catch (InterruptedException e){}
        }
    }
}
