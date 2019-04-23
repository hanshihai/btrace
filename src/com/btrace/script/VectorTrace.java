package com.btrace.script;

import java.util.List;

import com.sun.btrace.annotations.*;  

import static com.sun.btrace.BTraceUtils.*; 

@BTrace
public class VectorTrace {
	 @OnMethod(  
		      clazz="test.collection.TestVector",  
		      method="add",  
		      location=@Location(Kind.RETURN)  
		   )  
		   public static void traceExecute(String value, @Return String result){  
		     println("====== ");  
		     jstack();
		     println(strcat("paramter value: ",value));  
		     println(strcat("executed result: ",result));  
		   }  
}
