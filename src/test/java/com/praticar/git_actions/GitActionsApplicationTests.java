package com.praticar.git_actions;

import com.praticar.git_actions.feature.MyFeature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitActionsApplicationTests {

    @Autowired
    private MyFeature myFeature;

    @Test
    void contextLoads() {
        int result = myFeature.sumTwoNumbers(1, 2);
        Assertions.assertEquals(5, result);
    }

}
