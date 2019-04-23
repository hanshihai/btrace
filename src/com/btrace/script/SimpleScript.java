package com.btrace.script;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class SimpleScript {
		@OnMethod(
	        clazz="java.lang.Thread",
	        method="add"
	    )
	    public static void addFromScript(@Self Thread t) {
	        // println is defined in BTraceUtils
			D.probe("jthreadstart", Threads.name(t));
	        println(Strings.strcat("starting ", Threads.name(t)));
	    }
		
		@OnMethod(
		        clazz="java.lang.Thread",
		        method="run"
		    )
		    public static void runFromScript(@Self Thread t) {
		        // println is defined in BTraceUtils
				D.probe("jthreadstart", Threads.name(t));
		        println(Strings.strcat("running ", Threads.name(t)));
		    }
}
