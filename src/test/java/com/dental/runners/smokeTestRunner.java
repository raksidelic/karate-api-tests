package com.dental.runners;

import com.intuit.karate.junit5.Karate;

class smokeTestRunner {

    @Karate.Test
    Karate runUsersTests() {
        // Points to: src/test/resources/features/users/users.feature
        return Karate.run("classpath:features/firstFeature.feature");
    }
}
