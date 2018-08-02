package com.epam.sberbpoc.eks.testsuites;

import com.epam.sberbpoc.eks.tests.DidDataCorrectnessTest;
import com.epam.sberbpoc.eks.tests.EksDataCorrectnessTest;
import com.epam.sberbpoc.eks.tests.SchemaCorrectnessTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        EksDataCorrectnessTest.class,
        DidDataCorrectnessTest.class
})
public class DataCorrectnessTestsSuite {
}

