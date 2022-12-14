package com.cydeo.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "",name = "EMPLOYEE-CLIENT")
public interface EmployeeClient {
}
