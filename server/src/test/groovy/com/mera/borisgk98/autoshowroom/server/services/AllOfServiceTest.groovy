package com.mera.borisgk98.autoshowroom.server.services

import org.junit.runner.RunWith
import org.junit.runners.Suite

@Suite.SuiteClasses([
    AutoMarkServiceTest.class,
    AutoModelServiceTest.class,
    AutoServiceTest.class,
    AutoOptionServiceTest.class,
    SellerServiceTest.class,
//    OrderServiceTest.class,
    CustomerServiceTest.class
])
@RunWith(Suite.class)
class AllOfServiceTest {
}
