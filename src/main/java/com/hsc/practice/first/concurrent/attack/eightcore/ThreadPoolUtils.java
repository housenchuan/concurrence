package com.hsc.practice.first.concurrent.attack.eightcore;

import java.util.concurrent.*;

/**
 * @ClassName: com.hsc.practice.first.concurrent.attack.eightcore.ThreadPoolUtils
 * @auther: 侯森川
 * @Date: 2020-5-25 20:54
 **/

public class ThreadPoolUtils {

    public static ExecutorService executorService;

    static {
        executorService = new ThreadPoolExecutor(5, 20, 120, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1024),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    }
}
