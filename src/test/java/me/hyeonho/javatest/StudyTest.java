package me.hyeonho.javatest;

import jdk.javadoc.doclet.StandardDoclet;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @BeforeAll
    static void beforeAll(){}

    @AfterAll
    static void afterAll(){}

    @BeforeEach
    void setUp(){}

    @AfterEach
    void tearUp(){}

    @Test
    @DisplayName("Study 생성")
    void create(){
        //when
        Study study = new Study();
        //then
        assertNotNull(study);
    }


}