package com.lypeng.app;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ResourceConfig rc = new ResourceConfig().packages("com.lypeng.app.resources");
    }
}
