package com.homedepot.training.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jBasics
{
    private static Logger log  = LogManager.getLogger();

    public static void main( String args[] )
    {
        log.fatal( "Fatal message" );
        log.error( "Error message" );
        log.warn(  "Warning message " );
        log.info(  "Informational message" );
        log.debug( "Debug message useful to developers" );
        log.trace( "Trace output - can greatly impact system performance" );
    }
}
