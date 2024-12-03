package com.ll;

import com.ll.SimpleDb.SimpleDb;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SimpleDbTest {

    @BeforeAll
    public static void beforeAll() {
        private static SimpleDb simpleDb;

        simpleDb = new SimpleDb("localhost", "root", "lldj123414", "simpleDb__test");
    }
}
