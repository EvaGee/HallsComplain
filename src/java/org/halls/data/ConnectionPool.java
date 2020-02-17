/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halls.data;

import javax.naming.InitialContext;
import javax.sql.DataSource;
//import org.apache.tomcat.jdbc.pool.DataSource;

/**
 *
 * @author Eva Gee
 */
public class ConnectionPool {
    private static ConnectionPool pool=null;
    private static DataSource dataSource=null;
    
    private ConnectionPool () 
    {
        try{
            InitialContext ic=new InitialContext();
            dataSource=(DataSource)
            ic.lookup("java:/comp/env/jdbc/halls");
        }
        catch(Exception e){
        }    
    }
    public static ConnectionPool getInstance() 
    {
        if(pool==null)
        {
            pool= new ConnectionPool();
        }
        return pool;
    }
    
              
                    
             
    }

