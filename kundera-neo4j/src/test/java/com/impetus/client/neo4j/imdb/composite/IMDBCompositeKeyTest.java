/**
 * Copyright 2012 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.client.neo4j.imdb.composite;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test case for entities that hold composite keys  
 * @author amresh.singh
 */
public class IMDBCompositeKeyTest
{
    
    EntityManagerFactory emf;
    EntityManager em;   
    
    private static final String IMDB_PU = "imdb";
    


    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {           
        emf = Persistence.createEntityManagerFactory(IMDB_PU);      
        em = emf.createEntityManager();       
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {   
        em.close();             
        emf.close();      
    }  
    
    @Test
    public void testCompositeKeys()
    {
        
        
    }

}
